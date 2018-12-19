package com.example.kojocoffee.kojocoffee_v2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class in_dbarang extends AppCompatActivity {
    RelativeLayout in_dbarang;

    String namaBarang;
    int hargaBarang;
    int jumBarang;

    EditText in_nmBrg;
    EditText in_hrgBrg;
    EditText in_jumBrg;

    Button but_confBrg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.in_dbarang);

        in_nmBrg = (EditText) findViewById(R.id.in_nmBrg);
        in_hrgBrg = (EditText) findViewById(R.id.in_hrgBrg);
        in_jumBrg = (EditText) findViewById(R.id.in_jumBrg);

        but_confBrg = (Button) findViewById(R.id.but_confBrg);
        but_confBrg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                namaBarang = in_nmBrg.getText().toString();
                hargaBarang = Integer.valueOf(in_hrgBrg.getText().toString());
                jumBarang = Integer.valueOf(in_jumBrg.getText().toString());
            }
        });
    }
}
