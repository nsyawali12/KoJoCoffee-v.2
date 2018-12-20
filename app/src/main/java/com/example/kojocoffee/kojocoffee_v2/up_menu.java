package com.example.kojocoffee.kojocoffee_v2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class up_menu extends AppCompatActivity {
    protected Cursor cursor;
    database_menu dbMenu;
    Button update;
    EditText namaMenu,hargaMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.up_menu);
        dbMenu = new database_menu(this);
        namaMenu = (EditText) findViewById(R.id.namaMenu);
        hargaMenu = (EditText) findViewById(R.id.hargaMenu);
        SQLiteDatabase db = dbMenu.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM data_menu WHERE namaMenu = '" +
                getIntent().getStringExtra("namaMenu") + "'",null);
        cursor.moveToFirst();
        if (cursor.getCount() > 0){
            cursor.moveToPosition(0);
            namaMenu.setText(cursor.getString(0).toString());
            hargaMenu.setText(cursor.getString(1).toString());
        }
        update = (Button) findViewById(R.id.updateMenu);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase db = dbMenu.getWritableDatabase();
                db.execSQL("update data_menu set namaMenu='"+
                        namaMenu.getText().toString() +"', hargaMenu='" +
                        hargaMenu.getText().toString() + "' where namaMenu='" +
                        namaMenu.getText().toString()+"'");
                Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_LONG).show();
                list_menu.homeMenu.RefreshList();
                finish();
            }
        });
    }
}
