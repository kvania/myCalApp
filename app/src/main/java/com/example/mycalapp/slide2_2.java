package com.example.mycalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class slide2_2 extends AppCompatActivity {

    String jenisk;
    String AO;
    Double TBTEXTDouble, BBTEXTDouble, UTEXTDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide22);

        RadioGroup RG, RG2;
        RadioButton LK, PR, S, SJ, KK;
        TextView TB, BB, U;

        EditText TBTEXT;
        EditText BBTEXT;
        EditText UTEXT;
        Button button;
        String ket;


        LK = (RadioButton) findViewById(R.id.LK);
        PR = (RadioButton) findViewById(R.id.PR);
        button = (Button) findViewById(R.id.button);
        S = (RadioButton) findViewById(R.id.S);
        SJ = (RadioButton) findViewById(R.id.SJ);
        KK = (RadioButton) findViewById(R.id.KK);
        TB = findViewById(R.id.TB);
        BB = findViewById(R.id.BB);
        U = findViewById(R.id.U);
        TBTEXT = findViewById(R.id.TBTEXT);
        BBTEXT = findViewById(R.id.BBTEXT);
        UTEXT = findViewById(R.id.UTEXT);
        RG = (RadioGroup) findViewById(R.id.RG);
        RG2 = (RadioGroup) findViewById(R.id.RG2);

        RG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup RG, int id) {
                switch (id) {
                    case R.id.LK:
                        jenisk = "Laki-laki";
                        break;
                    case R.id.PR:
                        jenisk = "Perempuan";
                        break;
                }

            }
        });

        RG2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup RG, int id) {
                switch (id) {
                    case R.id.S:
                        AO= "Sering";
                        break;
                    case R.id.KK:
                        AO = "Kadang-kadang";
                        break;
                    case R.id.SJ:
                        AO = "Sangat Jarang";
                        break;
                }

            }

        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BBTEXTDouble = Double.parseDouble(BBTEXT.getText().toString());
                TBTEXTDouble = Double.parseDouble(TBTEXT.getText().toString());
                UTEXTDouble = Double.parseDouble(UTEXT.getText().toString());


                Double kalori = 0.0;


                if (LK.isChecked()) {
                    kalori = (88.4 + (13.4 * BBTEXTDouble) + (4.8 * TBTEXTDouble) - (5.68 * UTEXTDouble));

                } else if (PR.isChecked()) {
                    kalori = (447.6 + 9.25 * BBTEXTDouble) + (3.10 * TBTEXTDouble) - (4.33 * UTEXTDouble);
                    ;
                }

                double kebutuhan = 0.0;

                if (S.isChecked()) {
                    kebutuhan = kalori * 1.2;
                } else if (KK.isChecked()) {
                    kebutuhan = kalori * 1.5;
                } else if (KK.isChecked()) {
                    kebutuhan = kalori * 1.9;
                }

                // perhitungan selesai dan dimasukkan ke variable

                //tampilkan hasil perhitungan ke textview'
                Intent intent = new Intent(slide2_2.this, Slide2_1_1.class);
                intent.putExtra("kebutuhan", kebutuhan + "");
                startActivity(intent);
            }
        });
    }
}