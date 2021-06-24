package com.example.depretech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        Button h1=(Button) findViewById(R.id.btnvid);
        Button h2=(Button) findViewById(R.id.btnhome);
        Button h3=(Button) findViewById(R.id.btndoc);

        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int13=new Intent(MainActivity12.this,MainActivity7.class);
                startActivity(int13);
            }
        });

        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int14=new Intent(MainActivity12.this,MainActivity5.class);
                startActivity(int14);
            }
        });

        h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int15=new Intent(MainActivity12.this,MainActivity8.class);
                startActivity(int15);
            }
        });
    }
}