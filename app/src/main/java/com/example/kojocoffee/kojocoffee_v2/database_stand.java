package com.example.kojocoffee.kojocoffee_v2;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class database_stand extends SQLiteOpenHelper {


    private static final String DATABASE_NAME = "database_stand.db";
    private static final int DATABASE_VERSION = 1;

    public database_stand(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        String sql = "create table data_stand(idStand text null, namaEvent text null, panjang integer null, lebar integer null, tglEvent text null, hargaStand integer null, alamat text null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
    }

    ;


    @Override
    public void onUpgrade(SQLiteDatabase db, int k, int k1) {
        db.execSQL(DATABASE_NAME);
        onCreate(db);
    }

}
