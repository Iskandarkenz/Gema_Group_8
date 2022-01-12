package com.example.gema;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Searching extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searching);

        //initialize And Assign Variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //set Home,pustaka and profil Selected
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setSelectedItemId(R.id.pustaka);
        bottomNavigationView.setSelectedItemId(R.id.profil);

        //Perform ItemSelectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), com.example.gema.MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;

                        case R.id.pustaka:
                            startActivity(new Intent(getApplicationContext(), MyLibrary.class));
                            overridePendingTransition(0, 0);
                            return true;

                            case R.id.profil:
                                startActivity(new Intent(getApplicationContext(), BuatProfil.class));
                                overridePendingTransition(0, 0);
                                return true;
                }
                return false;
            }
        }
        );
    }
}