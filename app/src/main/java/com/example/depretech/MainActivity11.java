package com.example.depretech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        Button y3=(Button) findViewById(R.id.yes3);
        Button n3=(Button) findViewById(R.id.no3);

        y3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int11=new Intent(MainActivity11.this,MainActivity12.class);
                startActivity(int11);
            }
        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int12=new Intent(MainActivity11.this,MainActivity13.class);
                startActivity(int12);
            }
        });
    }
}