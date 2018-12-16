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

public class input_menu extends AppCompatActivity {
    RelativeLayout in_menu;

    String namaMenu;
    int hargaMenu;

    EditText in_nmMenu;
    EditText in_hrgMenu;

    Button but_confMenu;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.in_menu);

        in_nmMenu = (EditText) findViewById(R.id.in_nmMenu);
        in_hrgMenu = (EditText) findViewById(R.id.in_hrgMenu);

        but_confMenu = (Button) findViewById(R.id.but_confMenu);
        but_confMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                namaMenu = in_nmMenu.getText().toString();
                hargaMenu = Integer.valueOf(in_hrgMenu.getText().toString());
            }
        });
    }

}
