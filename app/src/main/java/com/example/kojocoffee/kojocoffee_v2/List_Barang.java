package com.example.kojocoffee.kojocoffee_v2;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.constraint.Constraints;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class List_Barang extends AppCompatActivity {
    Constraints list_barang;
    String[] daftar;
    ListView ListBarang;
    Menu menu;
    protected Cursor cursor;
    database_barang dbBarang;
    public static List_Barang homeBarang;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_barang);

        homeBarang = this;
        dbBarang = new database_barang(this);
        RefreshList();
    }

    public void RefreshList(){
        SQLiteDatabase db = dbBarang.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM data_barang", null);
        daftar = new String[cursor.getCount()];
        cursor.moveToFirst();
        for (int cc=0; cc < cursor.getCount(); cc++){
            cursor.moveToPosition(cc);
            daftar[cc] = cursor.getString(0).toString();
        }

        ListBarang = (ListView)findViewById(R.id.listBarang);
        ListBarang.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, daftar));
        ListBarang.setSelected(true);
        ListBarang.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView brg0, View brg1, int brg2, long brg3) {
                final String selection = daftar[brg2];
                final CharSequence[] dialogitem = {"Update","Delete"};
                AlertDialog.Builder builder = new AlertDialog.Builder(List_Barang.this);
                builder.setTitle("Choose: ");
                builder.setItems(dialogitem, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i){
                        switch (i){
                            case 0 :
                                Intent in = new Intent(getApplicationContext(), up_barang.class);
                                in.putExtra("namaBarang", selection);
                                startActivity(in);
                                break;
                            case 1 :
                                SQLiteDatabase db = dbBarang.getWritableDatabase();
                                db.execSQL("delete from data_barang where idBarang '"+selection+"'" );
                                RefreshList();
                                break;
                        }
                    }
                });
                builder.create().show();

            }});
        ((ArrayAdapter)ListBarang.getAdapter()).notifyDataSetInvalidated();
    }
}
