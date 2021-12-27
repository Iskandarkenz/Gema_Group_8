package com.example.gemagroup8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SearchingActivity extends AppCompatActivity {

    ImageButton imageView5, imageView6, imageView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searching);

        //initial tombol
        ImageButton imageView5 = findViewById(R.id.imageView5);
        ImageButton imageView6 = findViewById(R.id.imageView6);
        ImageButton imageView7 = findViewById(R.id.imageView7);

        // function tombol
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (SearchingActivity.this, home_semuabuku.class);
                startActivity(intent);
            }
        });

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (SearchingActivity.this, MyLibraryActivity.class);
                startActivity(intent);
            }
        });

        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (SearchingActivity.this, ScreenProfil.class);
                startActivity(intent);
            }
        });

    }
}