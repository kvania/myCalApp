package com.example.mycalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Slide2_1_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide221);

        String intent;
        intent = getIntent().getStringExtra("kebutuhan");

//        System.out.println("hasil adalah " + intent);

        TextView hasil;
        hasil = findViewById(R.id.hasil);
        hasil.setText(intent + " kkal");


    }
}