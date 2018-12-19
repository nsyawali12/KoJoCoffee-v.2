package com.example.kojocoffee.kojocoffee_v2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class pilih_pesanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilih_pesanan);

        Button plus1btn = (Button) findViewById(R.id.plus1);
        Button min1btn = (Button) findViewById(R.id.min1);
        Button plus2btn = (Button) findViewById(R.id.plus2);
        Button min2btn = (Button) findViewById(R.id.min2);
        Button plus3btn = (Button) findViewById(R.id.plus3);
        Button min3btn = (Button) findViewById(R.id.min3);
        Button plus4btn = (Button) findViewById(R.id.plus4);
        Button min4btn = (Button) findViewById(R.id.min4);
        Button plus5btn = (Button) findViewById(R.id.plus5);
        Button min5btn = (Button) findViewById(R.id.min5);
        Button plus6btn = (Button) findViewById(R.id.plus6);
        Button min6btn = (Button) findViewById(R.id.min6);

        final EditText espresso = (EditText) findViewById(R.id.espresso);
        final EditText latte = (EditText) findViewById(R.id.latte);
        final EditText capucino = (EditText) findViewById(R.id.capucino);
        final EditText v60 = (EditText) findViewById(R.id.v60);
        final EditText kalita = (EditText) findViewById(R.id.kalita);
        final EditText caramel = (EditText) findViewById(R.id.caramel);

        //espresso
        plus1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int plus = Integer.parseInt(espresso.getText().toString()) + 1;
                espresso.setText(String.valueOf(plus));

            }
        });

        min1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int min = Integer.parseInt(espresso.getText().toString()) - 1;
                espresso.setText(String.valueOf(min));

            }
        });

        //capucino
        plus2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int plus = Integer.parseInt(capucino.getText().toString()) + 1;
                capucino.setText(String.valueOf(plus));

            }
        });

        min2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int min = Integer.parseInt(capucino.getText().toString()) - 1;
                capucino.setText(String.valueOf(min));

            }
        });

        //latte
        plus3btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int plus = Integer.parseInt(latte.getText().toString()) + 1;
                latte.setText(String.valueOf(plus));

            }
        });

        min3btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int min = Integer.parseInt(latte.getText().toString()) - 1;
                latte.setText(String.valueOf(min));

            }
        });

        //v60
        plus4btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int plus = Integer.parseInt(v60.getText().toString()) + 1;
                v60.setText(String.valueOf(plus));

            }
        });

        min4btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int min = Integer.parseInt(v60.getText().toString()) - 1;
                v60.setText(String.valueOf(min));

            }
        });

        //Kalita
        plus5btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int plus = Integer.parseInt(kalita.getText().toString()) + 1;
                kalita.setText(String.valueOf(plus));

            }
        });

        min5btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int min = Integer.parseInt(kalita.getText().toString()) - 1;
                kalita.setText(String.valueOf(min));

            }
        });

        //caramel
        plus6btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int plus = Integer.parseInt(caramel.getText().toString()) + 1;
                caramel.setText(String.valueOf(plus));

            }
        });

        min6btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int min = Integer.parseInt(caramel.getText().toString()) - 1;
                caramel.setText(String.valueOf(min));

            }
        });
    }
}
