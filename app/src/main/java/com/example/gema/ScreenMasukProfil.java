package com.example.gema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import Quiz.ScreenEssay;

public class ScreenMasukProfil extends AppCompatActivity {

    Button btn_google, btn_play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_masuk_profil);

        btn_google = findViewById(R.id.btn_google);
        btn_play = findViewById(R.id.btn_play);

        btn_google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Profil.class);
                startActivity(intent);
            }
        });

        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ScreenEssay.class);
                startActivity(intent);
            }
        });
    }
}