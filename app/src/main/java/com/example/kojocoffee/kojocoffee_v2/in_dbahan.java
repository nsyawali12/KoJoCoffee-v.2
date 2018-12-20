package com.example.kojocoffee.kojocoffee_v2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class in_dbahan extends AppCompatActivity {
    RelativeLayout in_dbahan;

    protected Cursor cursor;
    database_bahan dbBahan;

    EditText in_nmBahan;
    EditText in_hrgBahan;
    EditText in_jumBhn;

    Button but_confBahan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.in_dbahan);

        dbBahan = new database_bahan(this);
        in_nmBahan = (EditText) findViewById(R.id.in_nmBhn);
        in_hrgBahan = (EditText) findViewById(R.id.in_hrgBhn);
        in_jumBhn = (EditText) findViewById(R.id.in_jumBhn);

        but_confBahan = (Button) findViewById(R.id.but_confBhn);
        but_confBahan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                SQLiteDatabase db = dbBahan.getWritableDatabase();
                db.execSQL("insert into data_bahan(namaBahan, hargaBahan, jumBahan) values ('" +
                        in_nmBahan.getText().toString() + "','" +
                        in_hrgBahan.getText().toString() + "','" +
                        in_jumBhn.getText().toString() + "')");

                Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_LONG).show();
                finish();

            }
        });
    }

}
