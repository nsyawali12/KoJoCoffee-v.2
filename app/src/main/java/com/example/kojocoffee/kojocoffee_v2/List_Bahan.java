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
        //ListBahan adapter blm, keburu ngantuk bentar

    }

}
