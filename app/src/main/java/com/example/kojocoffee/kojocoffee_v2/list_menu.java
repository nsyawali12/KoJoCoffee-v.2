package com.example.kojocoffee.kojocoffee_v2;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class list_menu extends AppCompatActivity {
    String[] daftar;
    ListView ListStand;
    Menu menu;
    protected Cursor cursor;
    database_menu dbmenu;
    public static list_menu homeMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list__stand);

        homeMenu = this;
        dbmenu = new database_menu(this);
        RefreshList();
    }
    public void RefreshList(){
        SQLiteDatabase db = dbmenu.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM data_menu", null);
        daftar = new String[cursor.getCount()];
        cursor.moveToFirst();
        for (int cc=0; cc < cursor.getCount(); cc++){
            cursor.moveToPosition(cc);
            daftar[cc] = cursor.getString(0).toString();
        }
        ListStand = (ListView)findViewById(R.id.listStand);
        ListStand.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, daftar));
        ListStand.setSelected(true);
        ListStand.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView arg0, View arg1, int arg2, long arg3){
                final String selection = daftar[arg2];
                Intent in = new Intent(getApplicationContext(), up_menu.class);
                in.putExtra("namaMenu", selection);
                startActivity(in);
            }
        });
    }
}
