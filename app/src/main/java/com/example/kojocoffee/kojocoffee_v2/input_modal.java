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


public class input_modal extends AppCompatActivity {

    RelativeLayout in_modal;

    int jumModal;

    EditText in_jmodal;

    Button but_confModal;


    protected void OnCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.in_modal);

        in_jmodal = (EditText) findViewById(R.id.in_jmodal);

        but_confModal = (Button) findViewById(R.id.but_confModal);
        but_confModal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumModal = Integer.valueOf(in_jmodal.getText().toString());
            }
        });
    }





}
