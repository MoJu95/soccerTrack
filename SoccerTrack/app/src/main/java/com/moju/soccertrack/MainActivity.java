package com.moju.soccertrack;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int Ascore = 0;
    int Bscore = 0;
    int Afoul1 = 0;
    int Bfoul1 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView scoreA = findViewById(R.id.ascore);
        final TextView scoreB = findViewById(R.id.bscore);
        final TextView foulA = findViewById(R.id.foula);
        final TextView foulB = findViewById(R.id.foulb);
        Button Agoal = findViewById(R.id.abtn);
        Button Bgoal = findViewById(R.id.bbtn);
        Button Afoul = findViewById(R.id.fabtn);
        Button Bfoul = findViewById(R.id.fbbtn);
        Button rst = findViewById(R.id.rst);


        Agoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ascore++;
                scoreA.setText(String.valueOf(Ascore));
            }
        });
        Bgoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bscore++;
                scoreB.setText(String.valueOf(Bscore));
            }
        });
        Afoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Afoul1++;
                foulA.setText(String.valueOf(Afoul1));
            }
        });
        Bfoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bfoul1++;
                foulB.setText(String.valueOf(Bfoul1));
            }
        });
        rst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ascore = 0;
                Bscore = 0;
                Afoul1 = 0;
                Bfoul1 = 0;
                foulA.setText(String.valueOf(Afoul1));
                foulB.setText(String.valueOf(Bfoul1));
                scoreA.setText(String.valueOf(Ascore));
                scoreB.setText(String.valueOf(Bscore));
            }
        });

    }
}