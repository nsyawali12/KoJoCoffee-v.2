package com.example.kojocoffee.kojocoffee_v2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class database_laporan extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "database_laporan.db";
    private static final int DATABASE_VERSION = 1;
    public database_laporan(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table data_laporan(tglLaporan integer null, modal integer null, pemasukkan integer null, );";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
