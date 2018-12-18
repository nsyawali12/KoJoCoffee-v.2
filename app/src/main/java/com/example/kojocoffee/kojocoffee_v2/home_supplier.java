package com.example.kojocoffee.kojocoffee_v2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home_supplier extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_supplier);

        Button in_barangBtn = (Button) findViewById(R.id.in_dbarang);
        Button in_bahanBtn = (Button) findViewById(R.id.in_dbahan);
        Button up_bahanBtn = (Button) findViewById(R.id.up_bahan);
        Button up_barangBtn = (Button) findViewById(R.id.up_barang);

        in_barangBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent startIntent =  new Intent(getApplicationContext(), in_dbarang.class);
                startActivity(startIntent);
            }
        });

        in_bahanBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent startIntent =  new Intent(getApplicationContext(), in_dbahan.class);
                startActivity(startIntent);
            }
        });

        up_bahanBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent startIntent =  new Intent(getApplicationContext(), up_bahan.class);
                startActivity(startIntent);
            }
        });

        up_barangBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent startIntent =  new Intent(getApplicationContext(), up_barang.class);
                startActivity(startIntent);
            }
        });
    }
}
