package com.example.depretech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        Button hh1=(Button) findViewById(R.id.btnvid1);
        Button hh2=(Button) findViewById(R.id.btnhome1);
        Button hh3=(Button) findViewById(R.id.btndoc1);

        hh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int16=new Intent(MainActivity13.this,MainActivity7.class);
                startActivity(int16);
            }
        });

        hh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int17=new Intent(MainActivity13.this,MainActivity5.class);
                startActivity(int17);
            }
        });

        hh3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int18=new Intent(MainActivity13.this,MainActivity8.class);
                startActivity(int18);
            }
        });
    }
}