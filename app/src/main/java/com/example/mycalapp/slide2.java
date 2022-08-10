package com.example.mycalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class slide2 extends AppCompatActivity {

    Button weight, ideal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide2);

        weight = (Button)findViewById(R.id.weight);
        ideal = (Button)findViewById(R.id.ideal);

        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(slide2.this, slide2_1.class));
            }
        });

        ideal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(slide2.this, slide2_2.class));
            }
        });

    }
}