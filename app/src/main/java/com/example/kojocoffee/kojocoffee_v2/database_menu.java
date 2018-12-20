package com.example.kojocoffee.kojocoffee_v2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class database_menu extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "database_menu.db";
    private static final int DATABASE_VERSION = 1;
    public database_menu(Context context) {
        super(,context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        String sql = "create table data_menu(namaMenu text null, hargaMenu integer null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT INTO data_menu(namaMenu, hargaMenu) VALUES ('espresso', '50000');";
        db.execSQL(sql);
        sql = "INSERT INTO data_menu(namaMenu, hargaMenu) VALUES ('capucino', '50000');";
        db.execSQL(sql);
        sql = "INSERT INTO data_menu(namaMenu, hargaMenu) VALUES ('latte', '50000');";
        db.execSQL(sql);
        sql = "INSERT INTO data_menu(namaMenu, hargaMenu) VALUES ('v60', '50000');";
        db.execSQL(sql);
        sql = "INSERT INTO data_menu(namaMenu, hargaMenu) VALUES ('kalita', '50000');";
        db.execSQL(sql);
        sql = "INSERT INTO data_menu(namaMenu, hargaMenu) VALUES ('caramel', '50000');";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int arg1, int arg2) {

    }
}
