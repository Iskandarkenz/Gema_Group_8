package com.example.gema.Profil.Grid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.gema.Home.PopularFragment;
import com.example.gema.R;

public class MostPopular extends AppCompatActivity {

    ImageView back;
    public CardView buku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_most_popular);

        //initial tombol
        ImageView back = findViewById(R.id.back);

        /*findViewById(R.id.danau_toba).setOnClickListener((View.OnClickListener) this);

        // function tombol
    }
        @Override
        public void onClick(View v) {
            Intent i;

        switch (v.getId()) {
            case R.id.antariksa:
                i = new Intent(this, MostPopular.class);
                startActivity(i);
                break;
        }*/

        // function tombol
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MostPopular.this, PopularFragment.class);
                startActivity(intent);
            }
        });
    }
}