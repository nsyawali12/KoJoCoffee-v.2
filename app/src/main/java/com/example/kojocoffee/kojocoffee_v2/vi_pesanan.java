package com.example.kojocoffee.kojocoffee_v2;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class vi_pesanan extends AppCompatActivity {
    protected Cursor cursor;
    EditText namaPelanggan, jmlhPesanan, totalHarga;
    database_pesanan dbPesanan;
    Button del;
    String namaPesanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vi_pesanan);

        dbPesanan = new database_pesanan(this);
        namaPelanggan = (EditText) findViewById(R.id.namaPelanggan);
        jmlhPesanan = (EditText) findViewById(R.id.jmlhPesanan);
        totalHarga = (EditText) findViewById(R.id.totalHarga);
        del = (Button) findViewById(R.id.delPesanan);
        namaPesanan = getIntent().getStringExtra("namaPesanan");
//        Bundle extras = getIntent().getExtras();
//        String tglPesanan = extras.getString("key");
            //The key argument here must match that used in the other activity
        SQLiteDatabase db = dbPesanan.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM data_pesanan WHERE namaPesanan = '" +
                 namaPesanan+ "'",null);
        cursor.moveToFirst();
        if (cursor.getCount() > 0){
            cursor.moveToPosition(0);
            namaPelanggan.setText(cursor.getString(1).toString());
            jmlhPesanan.setText(cursor.getString(3).toString());
            totalHarga.setText(cursor.getString(4).toString());
        }
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase db = dbPesanan.getWritableDatabase();
                db.execSQL("delete FROM data_pesanan WHERE namaPesanan = '" +
                        namaPesanan+ "'");
                Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_LONG).show();
                list_pesanan.homePesanan.RefreshList();
                finish();

            }
        });
    }
}
