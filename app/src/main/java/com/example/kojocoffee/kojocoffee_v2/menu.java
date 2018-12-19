package com.example.kojocoffee.kojocoffee_v2;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class menu extends AppCompatActivity {
    Dialog myDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        myDialog = new Dialog(this);
    }

    public void ShowPopupEspresso(View v) {
        TextView btnclose;
        myDialog.setContentView(R.layout.popupespresso);
        btnclose = (TextView) myDialog.findViewById(R.id.close);
        btnclose.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    public void ShowPopupCapucino(View v) {
        TextView btnclose;
        myDialog.setContentView(R.layout.popupcapucino);
        btnclose = (TextView) myDialog.findViewById(R.id.close);
        btnclose.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    public void ShowPopupLatte(View v) {
        TextView btnclose;
        myDialog.setContentView(R.layout.popuplatte);
        btnclose = (TextView) myDialog.findViewById(R.id.close);
        btnclose.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    public void ShowPopupv60(View v) {
        TextView btnclose;
        myDialog.setContentView(R.layout.popupv60);
        btnclose = (TextView) myDialog.findViewById(R.id.close);
        btnclose.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    public void ShowPopupKalita(View v) {
        TextView btnclose;
        myDialog.setContentView(R.layout.popupkalita);
        btnclose = (TextView) myDialog.findViewById(R.id.close);
        btnclose.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    public void ShowPopupCaramel(View v) {
        TextView btnclose;
        myDialog.setContentView(R.layout.popupcaramel);
        btnclose = (TextView) myDialog.findViewById(R.id.close);
        btnclose.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }
}
