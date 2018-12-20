package com.example.kojocoffee.kojocoffee_v2;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class in_modal extends AppCompatActivity {
    RelativeLayout in_modal;

    int jumModal;
    database_modal dbModal;
    EditText in_jmodal,tglModal;
    Button but_confModal;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.in_modal);

        dbModal = new database_modal(this);
        in_jmodal = (EditText) findViewById(R.id.in_jmodal);
        tglModal = (EditText) findViewById(R.id.tglModal);
        but_confModal = (Button) findViewById(R.id.but_confModal);
        but_confModal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbModal.getWritableDatabase();
                db.execSQL("INSERT INTO data_modal(tglModal, modal) VALUES ('" +
                        tglModal.getText().toString() + "','" +
                        in_jmodal.getText().toString() + "')");
                Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }

}
