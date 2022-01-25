package com.example.gema.Profil.Grid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.gema.Home.PopularFragment;
import com.example.gema.R;

public class MostRead extends AppCompatActivity {

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
                Intent intent = new Intent (MostRead.this, PopularFragment.class);
                startActivity(intent);
            }
        });
    }
}