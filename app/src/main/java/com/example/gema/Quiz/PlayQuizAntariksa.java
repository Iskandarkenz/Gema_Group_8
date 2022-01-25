package com.example.gema.Quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gema.BacaBuku.BacaBukuAntariksa;
import com.example.gema.Profil.Grid.MyLibrary;
import com.example.gema.R;

public class PlayQuizAntariksa extends AppCompatActivity {

    Button btn_play_quiz;
    ImageButton btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playquiz_antariksa);

        btn_play_quiz = findViewById(R.id.btn_play_quiz);
        btn_back = findViewById(R.id.btn_back);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BacaBukuAntariksa.class);
                startActivity(intent);
            }
        });

        btn_play_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), QuizAntariksa.class);
                startActivity(intent);
            }

        });

    }
}