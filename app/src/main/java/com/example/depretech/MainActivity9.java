package com.example.depretech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        Button y1=(Button) findViewById(R.id.yes1);
        Button n1=(Button) findViewById(R.id.no1);

        y1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int9=new Intent(MainActivity9.this,MainActivity11.class);
                startActivity(int9);
            }
        });

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int10=new Intent(MainActivity9.this,MainActivity11.class);
                startActivity(int10);
            }
        });
    }
}