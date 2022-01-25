package com.example.gema.Deskripsi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.gema.BacaBuku.BacaBukuAntariksa;
import com.example.gema.BacaBuku.BacaBukuCeritaBinatangAsyik;
import com.example.gema.Profil.Grid.MyLibrary;
import com.example.gema.R;

public class DeskripsiCeritaBinatangAsyik extends AppCompatActivity {

    ImageButton btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi_cerita_binatang_asyik);

        btn_back = findViewById(R.id.btn_back);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MyLibrary.class);
                startActivity(intent);
            }
        });
    }
}