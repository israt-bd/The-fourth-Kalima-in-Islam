package com.example.a4kalimahinislam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void kalimahtayyibah(View view) {
        Intent intent=new Intent(MainActivity.this,kalimah1.class);
        startActivity(intent);
    }

    public void kalimahtauhid(View view) {
        Intent intent=new Intent(MainActivity.this,kalimah2.class);
        startActivity(intent);
    }

    public void kalimahtamjeed(View view) {
        Intent intent=new Intent(MainActivity.this,kalimah3.class);
        startActivity(intent);
    }

    public void shahadat(View view) {
        Intent intent=new Intent(MainActivity.this,kalimah4.class);
        startActivity(intent);
    }

    public void about(View view) {
        Intent intent=new Intent(MainActivity.this,about.class);
        startActivity(intent);
    }
}