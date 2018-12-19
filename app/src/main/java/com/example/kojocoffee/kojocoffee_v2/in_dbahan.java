package com.example.kojocoffee.kojocoffee_v2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class in_dbahan extends AppCompatActivity {
    RelativeLayout in_dbahan;

    String namaBahan;
    int hargaBahan, jumBahan;

    EditText in_nmBahan;
    EditText in_hrgBahan;
    EditText in_jumBhn;

    Button but_confBahan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.in_dbahan);

        in_nmBahan = (EditText) findViewById(R.id.in_nmBhn);
        in_hrgBahan = (EditText) findViewById(R.id.in_hrgBhn);
        in_jumBhn = (EditText) findViewById(R.id.in_jumBhn);

        but_confBahan = (Button) findViewById(R.id.but_confBhn);
        but_confBahan.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               namaBahan = in_nmBahan.getText().toString();
               hargaBahan = Integer.valueOf(in_hrgBahan.getText().toString());
               jumBahan = Integer.valueOf(in_jumBhn.getText().toString());
           }
        });
    }
}
