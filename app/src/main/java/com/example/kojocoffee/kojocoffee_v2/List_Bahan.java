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

import java.util.List;

public class List_Bahan extends AppCompatActivity{

    Constraints list_bahan;
    String[] daftar;
    ListView ListBahan;
    Menu menu;
    protected Cursor cursor;
    database_bahan dbBahan;
    public static List_Bahan homeBahan;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_bahan);

        homeBahan = this;
        dbBahan = new database_bahan(this);
        RefreshList();
    }

    public void RefreshList() {
        SQLiteDatabase db = dbBahan.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM data_bahan", null);
        daftar = new String[cursor.getCount()];
        cursor.moveToFirst();
        for (int b=0; b < cursor.getCount(); b++){
            cursor.moveToPosition(b);
            daftar[b] = cursor.getString(0).toString();
        }
        ListBahan = (ListView) findViewById(R.id.listBahan);
        ListBahan.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, daftar));
        ListBahan.setSelected(true);
        ListBahan.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView arg0, View dbhn1, int dbhn2, long dbhn3) {
                final String selection = daftar[dbhn2];
                final CharSequence[] dialogitem = {"Update", "Delete"};
                AlertDialog.Builder builder = new AlertDialog.Builder(List_Bahan.this);
                builder.setTitle("Choose : ");
                builder.setItems(dialogitem, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        switch (i) {
                            case 0:
                                Intent in = new Intent(getApplicationContext(), up_bahan.class);
                                in.putExtra("namaBahan", selection);
                                startActivity(in);
                                break;
                            case 1:
                                SQLiteDatabase db = dbBahan.getWritableDatabase();
                                db.execSQL("delete from data_bahan where namaBahan = '" + selection + "'");
                                RefreshList();
                                break;
                        }
                    }
                });
                builder.create().show();

            }});
        ((ArrayAdapter)ListBahan.getAdapter()).notifyDataSetInvalidated();
    }

}
