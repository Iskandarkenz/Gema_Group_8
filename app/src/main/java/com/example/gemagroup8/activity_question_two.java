package com.example.gemagroup8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class activity_question_two extends Activity{
    ImageButton imageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_two);

        imageButton = (ImageButton) findViewById(R.id.closeButton2);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_question_two.this, com.example.gemagroup8.activity_playquiz.class);
                startActivity(intent);
            }
        });

        imageButton = (ImageButton) findViewById(R.id.nextButton2);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_question_two.this, com.example.gemagroup8.activity_question_three.class);
                startActivity(intent);
            }
        });

        imageButton = (ImageButton) findViewById(R.id.backButton2);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_question_two.this, activity_question_one.class);
                startActivity(intent);
            }
        });
    }
}
