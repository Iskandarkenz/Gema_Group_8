package com.example.gema;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MyLibrary extends AppCompatActivity implements View.OnClickListener {

    public CardView antariksa, card2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_library);

        //initial tombol
        findViewById(R.id.antariksa).setOnClickListener(this);
        findViewById(R.id.card2).setOnClickListener(this);

        // function tombol
    }
    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.antariksa:
                i = new Intent(this, Deskripsi.class);
                startActivity(i);
                break;

            case R.id.card2:
                i = new Intent(this, Baca_buku.class);
                startActivity(i);
                break;

        }

        //initialize And Assign Variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //set Home,pustaka and profil Selected
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setSelectedItemId(R.id.pustaka);
        bottomNavigationView.setSelectedItemId(R.id.profil);

        //Perform ItemSelectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.pustaka:
                        startActivity(new Intent(getApplicationContext(), MyLibrary.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.profil:
                        startActivity(new Intent(getApplicationContext(), Profil.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;

          };
        }
      );
     }
    }


