package com.example.gemagroup8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MyLibraryActivity extends AppCompatActivity {

    ImageView antariksa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_library);

        //initial tombol
        ImageView antariksa = findViewById(R.id.antariksa);

        // function tombol
        antariksa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MyLibraryActivity.this, Deskripsi.class);
                startActivity(intent);
            }
        });
    }
}