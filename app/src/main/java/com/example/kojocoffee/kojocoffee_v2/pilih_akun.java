package com.example.kojocoffee.kojocoffee_v2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class pilih_akun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilih_akun);

        ImageButton pemilikBtn = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton pstandBtn = (ImageButton) findViewById(R.id.imageButton4);
        ImageButton supplierBtn = (ImageButton) findViewById(R.id.imageButton5);

        pemilikBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent startIntent =  new Intent(getApplicationContext(), home_pemilik.class);
                startActivity(startIntent);
            }
        });

        pstandBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent startIntent =  new Intent(getApplicationContext(), home_pstand.class);
                startActivity(startIntent);
            }
        });

        supplierBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent startIntent =  new Intent(getApplicationContext(), home_supplier.class);
                startActivity(startIntent);
            }
        });
    }
}
