package com.example.kojocoffee.kojocoffee_v2;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class in_menu extends AppCompatActivity {

    RelativeLayout in_menu;

    database_menu dbMenu;
    String namaMenu;
    int hargaMenu;

    EditText in_nmMenu;
    EditText in_hrgMenu;

    Button but_confMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.in_menu);

        dbMenu = new database_menu(this);
        in_nmMenu = (EditText) findViewById(R.id.in_nmMenu);
        in_hrgMenu = (EditText) findViewById(R.id.in_hrgMenu);

        but_confMenu = (Button) findViewById(R.id.but_confMenu);
        but_confMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbMenu.getWritableDatabase();
                db.execSQL("insert into data_menu(namaMenu, hargaMenu) values ('" +
                        in_nmMenu.getText().toString() + "','" +
                        in_hrgMenu.getText().toString() + "')");
                Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_LONG).show();
                finish();
            }
        });

    }

}
