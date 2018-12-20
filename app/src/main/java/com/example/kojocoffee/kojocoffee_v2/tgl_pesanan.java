package com.example.kojocoffee.kojocoffee_v2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class tgl_pesanan extends AppCompatActivity {
    EditText tglPesanan2;
    Button confViPesanan2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tgl_pesanan);

        tglPesanan2 = (EditText) findViewById(R.id.tglPesanan2);
        confViPesanan2 = (Button) findViewById(R.id.confViPesanan2);

        confViPesanan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), list_pesanan.class);
                intent.putExtra("key", tglPesanan2.getText().toString());
                startActivity(intent);
            }
        });

    }
}
