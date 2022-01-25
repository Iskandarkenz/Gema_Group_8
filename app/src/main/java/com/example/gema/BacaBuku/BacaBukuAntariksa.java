package com.example.gema.BacaBuku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.gema.Profil.Grid.MyLibrary;
import com.example.gema.R;

import com.example.gema.Quiz.PlayQuizAntariksa;

public class BacaBukuAntariksa extends AppCompatActivity {

    Button btn_selesai_membaca;
    ImageView back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baca_buku_antariksa);

        btn_selesai_membaca = findViewById(R.id.btn_selesai_membaca);
        back_btn = findViewById(R.id.back_btn);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MyLibrary.class);
                startActivity(intent);
            }
        });

        btn_selesai_membaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PlayQuizAntariksa.class);
                startActivity(intent);
            }

        });
}

}
