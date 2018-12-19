package com.example.kojocoffee.kojocoffee_v2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home_pstand extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_pstand);

        Button in_dstandBtn = (Button) findViewById(R.id.in_dstand);
        Button up_standBtn = (Button) findViewById(R.id.up_stand);

        in_dstandBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                Intent startIntent =  new Intent(home_pstand.this, in_dstand.class);
                startActivity(startIntent);
            }
        });

        up_standBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent startIntent =  new Intent(getApplicationContext(), List_Stand.class);
                startActivity(startIntent);
            }
        });
    }
}
