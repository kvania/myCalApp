package com.example.mycalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class slide2_1 extends AppCompatActivity {
    EditText bbtext, bttext, imttext, kettext;
    Button hitung;
    Double bb, bt, imt;
    String ket;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide21);
        bbtext = (EditText)findViewById(R.id.bbtext);
        bttext = (EditText)findViewById(R.id.bttext);
        imttext = (EditText)findViewById(R.id.imttext);
        kettext = (EditText)findViewById(R.id.kettext);
        hitung = (Button)findViewById(R.id.hitung);


        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                bb = Double.parseDouble(bbtext.getText().toString());
                bt = Double.parseDouble(bttext.getText().toString());
                imt = bb / ((bt/100)*(bt/100));

                if (imt < 18.5){
                    ket = "Berat Badan Kurang";
                }

                else if (imt >= 18.5 && imt <25) {
                    ket = "Berat Badan Ideal";
                }
                else if (imt>= 25 && imt <30){
                    ket = "Berat Badan Berlebih";
                }
                else {
                    ket = "Obesitas";
                }
                imttext.setText(""+imt);
                kettext.setText(""+ket);
        }

    });
    }
}