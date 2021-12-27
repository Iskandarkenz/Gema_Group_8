package com.example.gemagroup8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class HomePopuler extends AppCompatActivity {

    EditText editTextSearch;
    Button btn_populer2, btn_buku_baru2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_populer);

        //initial tombol
        editTextSearch = findViewById(R.id.editTextSearch);
        btn_populer2 = findViewById(R.id.btn_populer);
        btn_buku_baru2 = findViewById(R.id.btn_buku_baru);

        // function tombol
        editTextSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (HomePopuler.this, SearchingActivity.class);
                startActivity(intent);
            }
        });

        btn_populer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (HomePopuler.this, home_semuabuku.class);
                startActivity(intent);
            }
        });
        btn_buku_baru2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (HomePopuler.this, home_buku_baru.class);
                startActivity(intent);
            }
        });

    }
}