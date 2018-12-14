package com.example.kojocoffee.kojocoffee_v2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.view.ViewGroup;


public class input_dbarang extends MainActivity{

    RelativeLayout in_dbarang;

    String namaBrg;
    int hargaBrg;
    int jumBrg;

    EditText in_nmBrg;
    EditText in_hrgBrg;
    EditText in_jumBrg;

    Button but_confBrg;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.in_dbarang);

        in_nmBrg = (EditText) findViewById(R.id.in_nmBrg);
        in_hrgBrg = (EditText) findViewById(R.id.in_hrgBrg);
        in_jumBrg = (EditText) findViewById(R.id.in_jumBrg);

        but_confBrg = (Button) findViewById(R.id.but_confBrg);
        but_confBrg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                namaBrg = in_nmBrg.getText().toString();
                hargaBrg = Integer.valueOf(in_hrgBrg.getText().toString());
            }
        });


    }








}
