package com.example.gema;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Profil extends AppCompatActivity implements View.OnClickListener {

    public CardView card_profil_saya, card_target_baca, card_tentang_gema, card_keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_profil);

        findViewById(R.id.card_profil_saya).setOnClickListener(this);
        findViewById(R.id.card_target_baca).setOnClickListener(this);
        findViewById(R.id.card_tentang_gema).setOnClickListener(this);
        findViewById(R.id.card_keluar).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.card_profil_saya:
                i = new Intent(this, ScreenProfilSaya.class);
                startActivity(i);
                break;

            case R.id.card_target_baca:
                i = new Intent(this, ScreenTargetBaca.class);
                startActivity(i);
                break;

            case R.id.card_tentang_gema:
                i = new Intent(this, ScreenTentangGema.class);
                startActivity(i);
                break;

            case R.id.card_keluar:
                i = new Intent(this, Deskripsi.class);
                startActivity(i);
                break;
        }
    }


    /*//initialize And Assign Variable
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
                    startActivity(new Intent(getApplicationContext(), com.example.gemagroup8.MainActivity.class));
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
}*/
}