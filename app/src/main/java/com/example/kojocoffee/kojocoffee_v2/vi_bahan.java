package com.example.kojocoffee.kojocoffee_v2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class vi_bahan extends AppCompatActivity {

    protected Cursor cursor;
    database_bahan dbBahan;
    Button but_confBhn;
    EditText in_nmBhn, in_hrgBhn, in_jumBhn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vi_bahan);

        dbBahan = new database_bahan(this);
        in_nmBhn = (EditText) findViewById(R.id.in_nmBhn);
        in_hrgBhn = (EditText) findViewById(R.id.in_hrgBhn);
        in_jumBhn = (EditText) findViewById(R.id.in_jumBhn);

        SQLiteDatabase db = dbBahan.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM data_bahan WHERE namaBahan = '" +
                getIntent().getStringExtra("namaBahan") + "'",null);
        cursor.moveToFirst();
        if (cursor.getCount() > 0){
            cursor.moveToPosition(0);
            in_nmBhn.setText(cursor.getString(0).toString());
            in_hrgBhn.setText(cursor.getString(1).toString());
            in_jumBhn.setText(cursor.getString(2).toString());
        }
    }
}
