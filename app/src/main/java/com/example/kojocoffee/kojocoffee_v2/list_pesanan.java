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

public class list_pesanan extends AppCompatActivity {
    String[] daftar;
    ListView ListPesanan;
    Menu menu;
    protected Cursor cursor;
    database_pesanan dbPesanan;
    public static list_pesanan homePesanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list__stand);

        homePesanan = this;
        dbPesanan = new database_pesanan(this);
        RefreshList();
    }

    public void RefreshList() {
        Bundle extras = getIntent().getExtras();
        String tglPesanan = extras.getString("key");
        SQLiteDatabase db = dbPesanan.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM data_pesanan WHERE tglPesanan = '" +
                tglPesanan + "'",null);
        daftar = new String[cursor.getCount()];
        cursor.moveToFirst();
        for (int cc=0; cc < cursor.getCount(); cc++){
            cursor.moveToPosition(cc);
            daftar[cc] = cursor.getString(1).toString();
        }
        ListPesanan = (ListView)findViewById(R.id.listStand);
        ListPesanan.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, daftar));
        ListPesanan.setSelected(true);
        ListPesanan.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView arg0, View arg1, int arg2, long arg3){
                final String selection = daftar[arg2];
                Intent in = new Intent(getApplicationContext(), vi_pesanan.class);
                in.putExtra("namaPesanan", selection);
                startActivity(in);
            }
        });
    }
}
