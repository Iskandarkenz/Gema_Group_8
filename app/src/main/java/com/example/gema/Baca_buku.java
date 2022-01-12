package com.example.gema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import Quiz.Playquiz;

public class Baca_buku extends AppCompatActivity {

    Button btn_selesai_membaca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baca_buku);

        btn_selesai_membaca = findViewById(R.id.btn_selesai_membaca);

        btn_selesai_membaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Playquiz.class);
                startActivity(intent);
            }

        });
}

}
