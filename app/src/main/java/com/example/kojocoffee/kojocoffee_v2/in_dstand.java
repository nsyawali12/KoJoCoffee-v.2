package com.example.kojocoffee.kojocoffee_v2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class in_dstand extends AppCompatActivity {

    protected Cursor cursor;
    database_stand dbStand;
    Button conf;
    EditText id,nama,panjang,lebar,tgl,harga,alamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.in_dstand);

        dbStand = new database_stand(this);
        id = (EditText) findViewById(R.id.idStand);
        nama = (EditText) findViewById(R.id.namaEvent);
        panjang = (EditText) findViewById(R.id.panjang);
        lebar = (EditText) findViewById(R.id.lebar);
        tgl = (EditText) findViewById(R.id.tglEvent);
        harga = (EditText) findViewById(R.id.hargaStand);
        alamat = (EditText) findViewById(R.id.alamat);
        conf = (Button) findViewById(R.id.confirmStand);

        conf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (id.getText().toString().matches("")) {
                    Toast.makeText(getApplicationContext(), "Nama stand kosong", Toast.LENGTH_SHORT).show();
                    return;
                } else if (nama.getText().toString().matches("")) {
                    Toast.makeText(getApplicationContext(), "Nama Event kosong", Toast.LENGTH_SHORT).show();
                    return;
                } else if (panjang.getText().toString().matches("")) {
                    Toast.makeText(getApplicationContext(), "Panjang stand kosong", Toast.LENGTH_SHORT).show();
                    return;
                } else if (lebar.getText().toString().matches("")) {
                    Toast.makeText(getApplicationContext(), "Lebar stand kosong", Toast.LENGTH_SHORT).show();
                    return;
                } else if (tgl.getText().toString().matches("")) {
                    Toast.makeText(getApplicationContext(), "Tanggal event kosong", Toast.LENGTH_SHORT).show();
                    return;
                } else if (harga.getText().toString().matches("")) {
                    Toast.makeText(getApplicationContext(), "Harga stand kosong", Toast.LENGTH_SHORT).show();
                    return;
                } if (alamat.getText().toString().matches("")) {
                    Toast.makeText(getApplicationContext(), "Alamat stand kosong", Toast.LENGTH_SHORT).show();
                    return;
                }else {
                    SQLiteDatabase db = dbStand.getWritableDatabase();
                    db.execSQL("insert into data_stand(idStand, namaEvent, panjang, lebar, tglEvent, hargaStand, alamat) values ('" +
                            id.getText().toString() + "','" +
                            nama.getText().toString() + "','" +
                            panjang.getText().toString() + "','" +
                            lebar.getText().toString() + "','" +
                            tgl.getText().toString() + "','" +
                            harga.getText().toString() + "','" +
                            alamat.getText().toString() + "')");
                    Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_LONG).show();
                    List_Stand.homeStand.RefreshList();
                    finish();
                }
            }
        });
    }
}
