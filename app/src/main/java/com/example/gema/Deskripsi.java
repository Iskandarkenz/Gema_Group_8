package com.example.gema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Deskripsi extends AppCompatActivity {

    ImageButton back_btn;
    Button btn_read_now,btn_plus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);

        btn_read_now = findViewById(R.id.btn_read_now);
        btn_plus = findViewById(R.id.btn_plus);
        back_btn = findViewById(R.id.back_btn);


        btn_read_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Baca_buku.class);
                startActivity(intent);
            }

        });
            btn_plus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),MyLibrary.class);
                    startActivity(intent);
                }
    });
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MyLibrary.class);
                startActivity(intent);
            }
        });
  }
}



