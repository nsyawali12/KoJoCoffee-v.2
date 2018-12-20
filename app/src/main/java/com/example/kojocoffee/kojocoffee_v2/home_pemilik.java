package com.example.kojocoffee.kojocoffee_v2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home_pemilik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_pemilik);

        Button in_menuBtn = (Button) findViewById(R.id.in_menu);
        Button in_modalBtn = (Button) findViewById(R.id.in_modal);
        Button in_pesananBtn = (Button) findViewById(R.id.in_pesanan);
        Button up_menuBtn = (Button) findViewById(R.id.up_menu);
        Button vi_menuBtn = (Button) findViewById(R.id.vi_menu);
        Button vi_barangBtn = (Button) findViewById(R.id.vi_barang);
        Button vi_bahanBtn = (Button) findViewById(R.id.vi_bahan);
        Button vi_laporanBtn = (Button) findViewById(R.id.vi_laporan);
        Button vi_standBtn = (Button) findViewById(R.id.vi_stand);


        in_menuBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent startIntent =  new Intent(getApplicationContext(), in_menu.class);
                startActivity(startIntent);
            }
        });

        in_modalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent =  new Intent(getApplicationContext(), in_modal.class);
                startActivity(startIntent);
            }
        });

        in_pesananBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent =  new Intent(getApplicationContext(), pilih_pesanan.class);
                startActivity(startIntent);
            }
        });

        up_menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent =  new Intent(getApplicationContext(), list_menu.class);
                startActivity(startIntent);
            }
        });

        vi_menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent =  new Intent(getApplicationContext(), menu.class);
                startActivity(startIntent);
            }
        });

        vi_barangBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent =  new Intent(getApplicationContext(), vi_barang.class);
                startActivity(startIntent);
            }
        });

        vi_bahanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent =  new Intent(getApplicationContext(), vi_bahan.class);
                startActivity(startIntent);
            }
        });

        vi_laporanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent =  new Intent(getApplicationContext(), vi_laporan.class);
                startActivity(startIntent);
            }
        });

        vi_standBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent =  new Intent(getApplicationContext(), View_List_Data.class);
                startActivity(startIntent);
            }
        });
    }
}
