package com.example.kojocoffee.kojocoffee_v2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * dibuat untuk database bahan
 */

public class database_bahan extends SQLiteOpenHelper{

    private static final String DATABASE_NAME = "database_bahan.db";
    private static final int DATABASE_VERSION = 1;

    public database_bahan(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        String sql = "create table data_bahan(namaBahan text null, hargaBahan integer null, jumBahan integer null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int bhn, int bhn1) {
        db.execSQL(DATABASE_NAME);
        onCreate(db);
    }

}
