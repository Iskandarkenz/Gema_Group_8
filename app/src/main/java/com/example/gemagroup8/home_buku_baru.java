package com.example.gemagroup8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class home_buku_baru extends AppCompatActivity {

    EditText search_new_book;
    Button btn_populer3, btn_buku_baru3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_buku_baru);

        //initial tombol
        search_new_book = findViewById(R.id.editTextSearch);
        btn_populer3 = findViewById(R.id.btn_populer);
        btn_buku_baru3 = findViewById(R.id.btn_buku_baru);

        // function tombol
        search_new_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (home_buku_baru.this, SearchingActivity.class);
                startActivity(intent);
            }
        });

        btn_populer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (home_buku_baru.this, HomePopuler.class);
                startActivity(intent);
            }
        });
        btn_buku_baru3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (home_buku_baru.this, HomePopuler.class);
                startActivity(intent);
            }
        });

    }
}