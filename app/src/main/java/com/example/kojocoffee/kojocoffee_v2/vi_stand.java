package com.example.kojocoffee.kojocoffee_v2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class vi_stand extends AppCompatActivity {
    protected Cursor cursor;
    database_stand dbStand;
    Button conf;
    EditText id,nama,panjang,lebar,tgl,harga,alamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vi_stand);

        dbStand = new database_stand(this);
        id = (EditText) findViewById(R.id.idStand);
        nama = (EditText) findViewById(R.id.namaEvent);
        panjang = (EditText) findViewById(R.id.panjang);
        lebar = (EditText) findViewById(R.id.lebar);
        tgl = (EditText) findViewById(R.id.tglEvent);
        harga = (EditText) findViewById(R.id.hargaStand);
        alamat = (EditText) findViewById(R.id.alamat);

        SQLiteDatabase db = dbStand.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM data_stand WHERE namaEvent = '" +
                getIntent().getStringExtra("namaEvent") + "'",null);
        cursor.moveToFirst();
        if (cursor.getCount() > 0){
            cursor.moveToPosition(0);
            id.setText(cursor.getString(0).toString());
            nama.setText(cursor.getString(1).toString());
            panjang.setText(cursor.getString(2).toString());
            lebar.setText(cursor.getString(3).toString());
            tgl.setText(cursor.getString(4).toString());
            harga.setText(cursor.getString(5).toString());
            alamat.setText(cursor.getString(6).toString());
        }
    }
}
