package com.example.gema.Deskripsi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.gema.BacaBuku.BacaBukuAntariksa;
import com.example.gema.Profil.Grid.MyLibrary;
import com.example.gema.R;

public class DeskripsiAntariksa extends AppCompatActivity {

    ImageButton back_btn;
    Button btn_read_now,btn_plus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi_antariksa);

        btn_read_now = findViewById(R.id.btn_read_now);
        btn_plus = findViewById(R.id.btn_plus);
        back_btn = findViewById(R.id.back_btn);


        btn_read_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BacaBukuAntariksa.class);
                startActivity(intent);
            }

        });
            btn_plus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), MyLibrary.class);
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



