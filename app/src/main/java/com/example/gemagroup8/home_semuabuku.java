package com.example.gemagroup8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class home_semuabuku extends AppCompatActivity {

    Button btn_populer, btn_buku_baru;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_semua_buku);

        //initial tombol
        btn_populer = findViewById(R.id.btn_populer);
        btn_buku_baru = findViewById(R.id.btn_buku_baru);

        // function tombol
        btn_populer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (home_semuabuku.this, HomePopuler.class);
                startActivity(intent);
            }
        });
        btn_buku_baru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (home_semuabuku.this, home_buku_baru.class);
                startActivity(intent);
            }
        });

    }
}