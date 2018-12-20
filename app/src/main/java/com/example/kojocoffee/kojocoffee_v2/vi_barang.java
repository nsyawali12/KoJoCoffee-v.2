package com.example.kojocoffee.kojocoffee_v2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class vi_barang extends AppCompatActivity {

    protected Cursor cursor;
    database_barang dbBarang;
    Button but_confBrg;
    EditText in_nmBrg, in_hrgBrg, in_jumBrg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vi_barang);

        dbBarang = new database_barang(this);
        in_nmBrg = (EditText) findViewById(R.id.in_nmBrg);
        in_hrgBrg = (EditText) findViewById(R.id.in_hrgBrg);
        in_jumBrg = (EditText) findViewById(R.id.in_jumBrg);

        SQLiteDatabase db = dbBarang.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM data_barang WHERE namaBarang = '" +
                getIntent().getStringExtra("namaBarang") + "'",null);
        cursor.moveToFirst();
        if (cursor.getCount() > 0){
            cursor.moveToPosition(0);
            in_nmBrg.setText(cursor.getString(0).toString());
            in_hrgBrg.setText(cursor.getString(1).toString());
            in_jumBrg.setText(cursor.getString(2).toString());
        }
    }

}
