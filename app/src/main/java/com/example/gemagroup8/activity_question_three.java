package com.example.gemagroup8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class activity_question_three extends Activity{
    ImageButton imageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_three);

        imageButton = (ImageButton) findViewById(R.id.closeButton3);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_question_three.this, com.example.gemagroup8.activity_playquiz.class);
                startActivity(intent);
            }
        });

        imageButton = (ImageButton) findViewById(R.id.backButton3);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_question_three.this, activity_question_two.class);
                startActivity(intent);
            }
        });
    }
}