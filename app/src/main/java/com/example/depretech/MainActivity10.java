package com.example.depretech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        Button y2=(Button) findViewById(R.id.yes2);
        Button n2=(Button) findViewById(R.id.no2);

        y2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int7=new Intent(MainActivity10.this,MainActivity9.class);
                startActivity(int7);
            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int8=new Intent(MainActivity10.this,MainActivity9.class);
                startActivity(int8);
            }
        });
    }
}