//package com.example.kojocoffee.kojocoffee_v2;
//
//import android.content.ContentValues;
//import android.content.Context;
//import android.database.Cursor;
//import android.database.DatabaseErrorHandler;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//import android.util.Log;
//
///*
//    dibuat untuk database barang, semoga bisa
// */
//
//public class database_barang extends SQLiteOpenHelper {
//
//    private static final String TAG = "database_barang";
//
//    private static final String TABLE_NAME = "data_barang";
//    private static final String COL1 = "Nama Barang";
//    private static final String COL2 = "Harga Barang";
//    private static final String COL3 = "Jumlah Barang";
//
//    public database_barang(Context context){
//        super(context, TABLE_NAME, null, 1);
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase db){
//        String createTable = "CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " + COL2 + "Barang, " + COL3 + "Barang)";
//        db.execSQL(createTable);
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int i, int i1){
//        db.execSQL(TABLE_NAME);
//        onCreate(db);
//    }
//
//    public boolean addData(String item) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues contentValues = new ContentValues();
//        contentValues.put(COL2, item);
//
//        Log.d(TAG, "addData: Adding " + item + " to " + TABLE_NAME);
//
//        long result = db.insert(TABLE_NAME, null, contentValues);
//
//        //if date as inserted incorrectly it will return -1
//        if (result == -1){
//            return false;
//        } else {
//            return true;
//        }
//    }
//
//    /**
//     * Return all the data from database
//     * @return
//     */
//
//    public Cursor getData(){
//        SQLiteDatabase db = this.getWritableDatabase();
//        String query = "SELECT * FROM " + TABLE_NAME;
//        Cursor data = db.rawQuery(query, null);
//        return data;
//    }
//
//    /**
//     * Return only COL1 that matches the name passed in
//     * @param name
//     * @return
//     */
//
//    public Cursor getItemID(String name){
//       SQLiteDatabase db = this.getWritableDatabase();
//       String query = " SELECT " + COL1 + " FROM " + TABLE_NAME +
//               " WHERE " + COL2 + " = '" + name + "'";
//       Cursor data = db.rawQuery(query, null);
//       return data;
//    }
//
//    /**
//     * Update the name field
//     * @param newName
//     * @param id
//     * @param oldName
//     */
//    public void updateName(String newName, int id, String oldName){
//        SQLiteDatabase db = this.getWritetableDatabase();
//        String query = "UPDATE" + TABLE_NAME + " SET " + COL2 +
//                " = '" + newName + "' WHERE " + COL1 + " = '" + id + "'"+
//                " AND " + COL2 + " = '" + oldName + "'";
//        Log.d(TAG, "updateName: query: " + query);
//        Log.d(TAG, "updateName: Setting name to " + newName);
//        db.execSQL(query);
//    }
//
//
//    /**
//     * Delete from database
//     * @param id
//     * @param name
//     */
//    public void deleteName(int id, String name){
//        SQLiteDatabase db = this.getWritableDatabase();
//        String query = " DELETE FROM " + TABLE_NAME + " WHERE "
//                + COL1 + " = '" + id + "'" +
//                " AND " + COL2 + "= '" + name + "'";
//        Log.d(TAG, "deleteName: query " + query);
//        Log.d(TAG, "deleteName: Deleting " + name + "from database.");
//        db.execSQL(query);
//    }
//
//}
