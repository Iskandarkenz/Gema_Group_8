package com.example.gema;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MostPopular extends AppCompatActivity {

    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_most_popular);

        //initial tombol
        ImageView back = findViewById(R.id.back);

        // function tombol
       /* back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MostPopular.this, HomePopuler.class);
                startActivity(intent);
            }
        });*/
    }
}