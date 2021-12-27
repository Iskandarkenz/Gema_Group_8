package com.example.gemagroup8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MostReadActivity extends AppCompatActivity {

    ImageView back2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_most_read);

        //initial tombol
        ImageView back2 = findViewById(R.id.back2);

        // function tombol
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MostReadActivity.this, HomePopuler.class);
                startActivity(intent);
            }
        });
    }
}