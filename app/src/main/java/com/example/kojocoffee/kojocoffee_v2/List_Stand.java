package com.example.kojocoffee.kojocoffee_v2;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class List_Stand extends AppCompatActivity {
    String[] daftar;
    ListView ListStand;
    Menu menu;
    protected Cursor cursor;
    database_stand dbstand;
    public static List_Stand homeStand;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list__stand);

        homeStand = this;
        dbstand = new database_stand(this);
        RefreshList();
    }

    public void RefreshList() {
        SQLiteDatabase db = dbstand.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM data_stand", null);
        daftar = new String[cursor.getCount()];
        cursor.moveToFirst();
        for (int cc=0; cc < cursor.getCount(); cc++){
            cursor.moveToPosition(cc);
            daftar[cc] = cursor.getString(1).toString();
        }
        ListStand = (ListView)findViewById(R.id.listStand);
        ListStand.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, daftar));
        ListStand.setSelected(true);
        ListStand.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView arg0, View arg1, int arg2, long arg3) {
                final String selection = daftar[arg2];
                final CharSequence[] dialogitem = { "Update", "Delete"};
                AlertDialog.Builder builder = new AlertDialog.Builder(List_Stand.this);
                builder.setTitle("Choose : ");
                builder.setItems(dialogitem, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        switch (i){
                            case 0 :
                                Intent in = new Intent(getApplicationContext(), up_stand.class);
                                in.putExtra("idStand", selection);
                                startActivity(in);
                                break;
                            case 1 :
                                SQLiteDatabase db = dbstand.getWritableDatabase();
                                db.execSQL("delete from data_stand where idStand = '"+selection+"'");
                                RefreshList();
                                break;
                        }
                    }
                });
                builder.create().show();
            }});
        ((ArrayAdapter)ListStand.getAdapter()).notifyDataSetInvalidated();
    }


}
