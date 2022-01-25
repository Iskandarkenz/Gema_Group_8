package com.example.gema.Quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gema.R;

public class EssayQuiz extends AppCompatActivity {

    Button btn_save;
    EditText test;
    TextView testing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_essay);

        btn_save = findViewById(R.id.btn_save);
        /*test = findViewById(R.id.pendapat);
        testing = findViewById(R.id.gmn);

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = test.getText().toString();
                testing.setText(str);
            }
        });*/

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Rating.class);
                startActivity(intent);
            }

        });

    }
}