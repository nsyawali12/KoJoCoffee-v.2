package com.example.kojocoffee.kojocoffee_v2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * dibuat untuk database bahan
 */

public class database_bahan extends SQLiteOpenHelper{

    private static final String TAG = "database_bahan";

    private static final String TABLE_NAME = "Data Bahan";
    private static final String COL1 = "Nama Bahan";
    private static final String COL2 = "Harga Bahan";
    private static final String COL3 = "Jumlah Bahan";

    public database_bahan(Context context){
        super(context, TABLE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        String createTable = "CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COL2 + "Bahan, " + COL3 + "Bahan)";
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int j, int j1){
        db.execSQL(TABLE_NAME);
        onCreate(db);
    }

    public boolean addBahan(String item) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL2, item);

        Log.d(TAG, "addBahan: Adding " + item + " to " + TABLE_NAME);

        Long result = db.insert(TABLE_NAME, null, contentValues);

        //if date as inserted incorrectly it will return -1
        if(result == -1){
            return false;
        } else {
            return true;
        }
    }

    /**
     * Return all all the data from database
     * @return
     */

    public Cursor getBahan() {
        SQLiteDatabase db = this.getWritableDatabase();
        String query = " SELECT * FROM " + TABLE_NAME;
        Cursor data = db.rawQuery(query, null);
        return data;
    }

    /**
     * Return only COL1 that matches the name passed in
     * @param name
     * @return
     */

    public Cursor getIdBahan(String name){
        SQLiteDatabase db = this.getWritableDatabase();
        String query = " SELECT " + COL1 + " FROM " + TABLE_NAME +
                " WHERE " + COL2 + " = '" + name + "'";
        Cursor data = db.rawQuery(query, null);
        return data;
    }

    /**
     * Update nama field
     * @param newName
     * @param id
     * @param oldName
     */

    public void updateName(String newName, int id, String oldName){
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "UPDATE" + TABLE_NAME + " SET " + COL2 +
                " = '" + newName + "' WHERE " + COL1 + " = '" + id + "'"+
                " AND " + COL2 + " = '" + oldName + "'";
        Log.d(TAG, "updateName: query: " + query);
        Log.d(TAG, "updateName: Setting name to " + newName);
        db.execSQL(query);
    }

    /**
     * Delete bahan dari database
     * @param id
     * @param name
     */
    public void deleteBahan(int id, String name){
        SQLiteDatabase db = this.getWritableDatabase();
        String query = " DELETE FROM " + TABLE_NAME + " WHERE "
                + COL1 + " = '" + id + "'" +
                " AND " + COL2 + "= '" + name + "'";
        Log.d(TAG, "deleteBahan: Query " + query);
        Log.d(TAG, "deleteName: Deleeting " + name + "from database. ");
        db.execSQL(query);
    }

}
