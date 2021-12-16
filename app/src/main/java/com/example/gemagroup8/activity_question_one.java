package com.example.gemagroup8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class activity_question_one extends AppCompatActivity{
    ImageButton imageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_one);

        imageButton = (ImageButton) findViewById(R.id.closeButton);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_question_one.this, com.example.gemagroup8.activity_playquiz.class);
                startActivity(intent);
            }
        });
        imageButton = (ImageButton) findViewById(R.id.nextButton);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iSavee = new Intent(activity_question_one.this, com.example.gemagroup8.activity_question_two.class);
                startActivity(iSavee);
            }
        });

    }
}