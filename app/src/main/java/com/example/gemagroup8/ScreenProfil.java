package com.example.gemagroup8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ScreenProfil extends AppCompatActivity {

    ImageButton button_buat_profil, imageView5, imageView6, imageView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_profil);

        //initial tombol
        ImageButton button_buat_profil = findViewById(R.id.imageView3);
        ImageButton imageView5 = findViewById(R.id.imageView5);
        ImageButton imageView6 = findViewById(R.id.imageView6);
        ImageButton imageView7 = findViewById(R.id.imageView7);

        // function tombol
        button_buat_profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (ScreenProfil.this, ScreenMasukProfil.class);
                startActivity(intent);
            }
        });

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (ScreenProfil.this, home_semuabuku.class);
                startActivity(intent);
            }
        });

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (ScreenProfil.this, MyLibraryActivity.class);
                startActivity(intent);
            }
        });

        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (ScreenProfil.this, ScreenProfil.class);
                startActivity(intent);
            }
        });

    }
}