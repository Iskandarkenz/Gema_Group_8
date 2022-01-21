package com.example.gema.Profil;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.gema.MyLibrary;
import com.example.gema.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BuatProfil extends AppCompatActivity {

    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buat_profil);

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(BuatProfil.this);
        String profileName = pref.getString("PROFILE_NAME", "");
        if(profileName.length() > 0) {
            startActivity(new Intent(getApplicationContext(), Profil.class));
        }

       Button button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ScreenMasukProfil.class);
                startActivity(intent);
            }
        });

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


           /* button1.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {
                  Intent intent = new Intent(view.getContext(), ScreenMasukProfil.class);
                  view.getContext().startActivity(intent);}
               });

            }
   /* public void goToRegister(View view ){
        Intent intent = new Intent (this,RegisterActivity.class);
        startActivity(intent);
    }*/


