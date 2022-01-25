package com.example.gema.Quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gema.BacaBuku.BacaBukuCeritaBinatangAsyik;
import com.example.gema.BacaBuku.BacaBukuDanauToba;
import com.example.gema.R;

public class PlayQuizDanauToba extends AppCompatActivity {

    Button btn_play_quiz;
    ImageButton btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playquiz_danau_toba);

        btn_play_quiz = findViewById(R.id.btn_play_quiz);
        btn_back = findViewById(R.id.btn_back);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BacaBukuDanauToba.class);
                startActivity(intent);
            }
        });

        btn_play_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), QuizDanauToba.class);
                startActivity(intent);
            }

        });

    }
}