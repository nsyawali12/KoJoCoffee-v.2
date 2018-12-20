package com.example.kojocoffee.kojocoffee_v2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class pilih_pesanan extends AppCompatActivity {
    protected Cursor cursor;
    database_pesanan dbPesanan;
    database_menu dbMenu;
    Button conf;
    EditText idPesanan,namaPesanan,tglPesanan, totalHarga,espresso,capucino,latte,v60,kalita,caramel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilih_pesanan);

        dbPesanan = new database_pesanan(this);
        dbMenu = new database_menu(this);
        namaPesanan = (EditText) findViewById(R.id.namaPesanan);
        idPesanan = (EditText) findViewById(R.id.idPesanan);
        tglPesanan = (EditText) findViewById(R.id.tglPesanan);
        totalHarga = (EditText) findViewById(R.id.totalHarga);
        conf = (Button) findViewById(R.id.confPesanan);
        Button plus1btn = (Button) findViewById(R.id.plus1);
        Button min1btn = (Button) findViewById(R.id.min1);
        Button plus2btn = (Button) findViewById(R.id.plus2);
        Button min2btn = (Button) findViewById(R.id.min2);
        Button plus3btn = (Button) findViewById(R.id.plus3);
        Button min3btn = (Button) findViewById(R.id.min3);
        Button plus4btn = (Button) findViewById(R.id.plus4);
        Button min4btn = (Button) findViewById(R.id.min4);
        Button plus5btn = (Button) findViewById(R.id.plus5);
        Button min5btn = (Button) findViewById(R.id.min5);
        Button plus6btn = (Button) findViewById(R.id.plus6);
        Button min6btn = (Button) findViewById(R.id.min6);

        espresso = (EditText) findViewById(R.id.espresso);
        latte = (EditText) findViewById(R.id.latte);
        capucino = (EditText) findViewById(R.id.capucino);
        v60 = (EditText) findViewById(R.id.v60);
        kalita = (EditText) findViewById(R.id.kalita);
        caramel = (EditText) findViewById(R.id.caramel);

        //espresso
        plus1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int plus = Integer.parseInt(espresso.getText().toString()) + 1;
                espresso.setText(String.valueOf(plus));
                SQLiteDatabase dbEsp = dbMenu.getReadableDatabase();
                cursor = dbEsp.rawQuery("SELECT hargaMenu FROM data_menu WHERE namaMenu = 'espresso'",null);
                cursor.moveToFirst();
                cursor.moveToPosition(0);
                int harga =  Integer.parseInt(cursor.getString(0).toString());
                int totEsp = Integer.parseInt(espresso.getText().toString());
                totalHarga.setText(String.valueOf(harga * totEsp));

            }
        });

        min1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int min = Integer.parseInt(espresso.getText().toString()) - 1;
                espresso.setText(String.valueOf(min));
                SQLiteDatabase dbEsp = dbMenu.getReadableDatabase();
                cursor = dbEsp.rawQuery("SELECT hargaMenu FROM data_menu WHERE namaMenu = 'espresso'",null);
                cursor.moveToFirst();
                cursor.moveToPosition(0);
                int harga =  Integer.parseInt(cursor.getString(0).toString());
                int totEsp = Integer.parseInt(espresso.getText().toString());
                totalHarga.setText(String.valueOf(harga * totEsp));

            }
        });

        //capucino
        plus2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int plus = Integer.parseInt(capucino.getText().toString()) + 1;
                capucino.setText(String.valueOf(plus));
                SQLiteDatabase dbCap = dbMenu.getReadableDatabase();
                cursor = dbCap.rawQuery("SELECT hargaMenu FROM data_menu WHERE namaMenu = 'capucino'",null);
                cursor.moveToFirst();
                cursor.moveToPosition(0);
                int harga =  Integer.parseInt(cursor.getString(0).toString());
                int tot = Integer.parseInt(capucino.getText().toString());
                totalHarga.setText(String.valueOf(harga * tot));

            }
        });

        min2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int min = Integer.parseInt(capucino.getText().toString()) - 1;
                capucino.setText(String.valueOf(min));
                SQLiteDatabase dbCap = dbMenu.getReadableDatabase();
                cursor = dbCap.rawQuery("SELECT hargaMenu FROM data_menu WHERE namaMenu = 'capucino'",null);
                cursor.moveToFirst();
                cursor.moveToPosition(0);
                int harga =  Integer.parseInt(cursor.getString(0).toString());
                int tot = Integer.parseInt(capucino.getText().toString());
                totalHarga.setText(String.valueOf(harga * tot));

            }
        });

        //latte
        plus3btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int plus = Integer.parseInt(latte.getText().toString()) + 1;
                latte.setText(String.valueOf(plus));
                SQLiteDatabase dbLat = dbMenu.getReadableDatabase();
                cursor = dbLat.rawQuery("SELECT hargaMenu FROM data_menu WHERE namaMenu = 'latte'",null);
                cursor.moveToFirst();
                cursor.moveToPosition(0);
                int harga =  Integer.parseInt(cursor.getString(0).toString());
                int tot = Integer.parseInt(latte.getText().toString());
                totalHarga.setText(String.valueOf(harga * tot));

            }
        });

        min3btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int min = Integer.parseInt(latte.getText().toString()) - 1;
                latte.setText(String.valueOf(min));
                SQLiteDatabase dbLat = dbMenu.getReadableDatabase();
                cursor = dbLat.rawQuery("SELECT hargaMenu FROM data_menu WHERE namaMenu = 'latte'",null);
                cursor.moveToFirst();
                cursor.moveToPosition(0);
                int harga =  Integer.parseInt(cursor.getString(0).toString());
                int tot = Integer.parseInt(latte.getText().toString());
                totalHarga.setText(String.valueOf(harga * tot));

            }
        });

        //v60
        plus4btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int plus = Integer.parseInt(v60.getText().toString()) + 1;
                v60.setText(String.valueOf(plus));
                SQLiteDatabase dbv60 = dbMenu.getReadableDatabase();
                cursor = dbv60.rawQuery("SELECT hargaMenu FROM data_menu WHERE namaMenu = 'v60'",null);
                cursor.moveToFirst();
                cursor.moveToPosition(0);
                int harga =  Integer.parseInt(cursor.getString(0).toString());
                int tot = Integer.parseInt(v60.getText().toString());
                totalHarga.setText(String.valueOf(harga * tot));

            }
        });

        min4btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int min = Integer.parseInt(v60.getText().toString()) - 1;
                v60.setText(String.valueOf(min));
                SQLiteDatabase dbv60 = dbMenu.getReadableDatabase();
                cursor = dbv60.rawQuery("SELECT hargaMenu FROM data_menu WHERE namaMenu = 'v60'",null);
                cursor.moveToFirst();
                cursor.moveToPosition(0);
                int harga =  Integer.parseInt(cursor.getString(0).toString());
                int tot = Integer.parseInt(v60.getText().toString());
                totalHarga.setText(String.valueOf(harga * tot));

            }
        });

        //Kalita
        plus5btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int plus = Integer.parseInt(kalita.getText().toString()) + 1;
                kalita.setText(String.valueOf(plus));
                SQLiteDatabase dbKal = dbMenu.getReadableDatabase();
                cursor = dbKal.rawQuery("SELECT hargaMenu FROM data_menu WHERE namaMenu = 'v60'",null);
                cursor.moveToFirst();
                cursor.moveToPosition(0);
                int harga =  Integer.parseInt(cursor.getString(0).toString());
                int tot = Integer.parseInt(kalita.getText().toString());
                totalHarga.setText(String.valueOf(harga * tot));

            }
        });

        min5btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int min = Integer.parseInt(kalita.getText().toString()) - 1;
                kalita.setText(String.valueOf(min));
                SQLiteDatabase dbKal = dbMenu.getReadableDatabase();
                cursor = dbKal.rawQuery("SELECT hargaMenu FROM data_menu WHERE namaMenu = 'v60'",null);
                cursor.moveToFirst();
                cursor.moveToPosition(0);
                int harga =  Integer.parseInt(cursor.getString(0).toString());
                int tot = Integer.parseInt(kalita.getText().toString());
                totalHarga.setText(String.valueOf(harga * tot));

            }
        });

        //caramel
        plus6btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int plus = Integer.parseInt(caramel.getText().toString()) + 1;
                caramel.setText(String.valueOf(plus));
                SQLiteDatabase dbCar = dbMenu.getReadableDatabase();
                cursor = dbCar.rawQuery("SELECT hargaMenu FROM data_menu WHERE namaMenu = 'v60'",null);
                cursor.moveToFirst();
                cursor.moveToPosition(0);
                int harga =  Integer.parseInt(cursor.getString(0).toString());
                int tot = Integer.parseInt(caramel.getText().toString());
                totalHarga.setText(String.valueOf(harga * tot));

            }
        });

        min6btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int min = Integer.parseInt(caramel.getText().toString()) - 1;
                caramel.setText(String.valueOf(min));
                SQLiteDatabase dbCar = dbMenu.getReadableDatabase();
                cursor = dbCar.rawQuery("SELECT hargaMenu FROM data_menu WHERE namaMenu = 'v60'",null);
                cursor.moveToFirst();
                cursor.moveToPosition(0);
                int harga =  Integer.parseInt(cursor.getString(0).toString());
                int tot = Integer.parseInt(caramel.getText().toString());
                totalHarga.setText(String.valueOf(harga * tot));

            }
        });

        conf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int jumEsp = Integer.parseInt(espresso.getText().toString());

                int jumCap = Integer.parseInt(capucino.getText().toString());
                int jumLatte = Integer.parseInt(latte.getText().toString());
                int jummV60 = Integer.parseInt(v60.getText().toString());
                int jumKal = Integer.parseInt(kalita.getText().toString());
                int jumCar = Integer.parseInt(caramel.getText().toString());
                int total = jumCap + jumCar + jumEsp + jumKal + jumLatte + jummV60;
                SQLiteDatabase db = dbPesanan.getWritableDatabase();
                db.execSQL("INSERT INTO data_pesanan(idPesanan, namaPesanan, tglPesanan, jumPesanan, totalHarga) VALUES ('" +
                        idPesanan.getText().toString() + "','" +
                        namaPesanan.getText().toString() + "','" +
                        tglPesanan.getText().toString() + "','" +
                        total + "','" +
                        totalHarga.getText().toString() + "')");
                Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}
