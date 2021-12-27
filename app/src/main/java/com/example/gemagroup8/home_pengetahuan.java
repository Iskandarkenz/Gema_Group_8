package com.example.gemagroup8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class home_pengetahuan extends AppCompatActivity {

    EditText search_new_book2;
    Button btn_semua_buku, btn_populer4, btn_buku_baru4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_pengetahuan);

        //initial tombol
        search_new_book2 = findViewById(R.id.editTextSearch);
        btn_semua_buku = findViewById(R.id.btn_semua_buku);
        btn_populer4 = findViewById(R.id.btn_populer);
        btn_buku_baru4 = findViewById(R.id.btn_buku_baru);

        // function tombol
        search_new_book2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (home_pengetahuan.this, SearchingActivity.class);
                startActivity(intent);
            }
        });

        btn_semua_buku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (home_pengetahuan.this, home_semuabuku.class);
                startActivity(intent);
            }
        });

        btn_populer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (home_pengetahuan.this, HomePopuler.class);
                startActivity(intent);
            }
        });

        btn_buku_baru4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (home_pengetahuan.this, home_buku_baru.class);
                startActivity(intent);
            }
        });

    }
}