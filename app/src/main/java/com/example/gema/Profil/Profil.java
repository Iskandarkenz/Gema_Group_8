package com.example.gema.Profil;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.preference.PreferenceManager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.gema.DeskripsiAntariksa;
import com.example.gema.MenuProfil.ScreenProfilSaya;
import com.example.gema.MenuProfil.ScreenTargetBaca;
import com.example.gema.MenuProfil.ScreenTentangGema;
import com.example.gema.MyLibrary;
import com.example.gema.R;
import com.example.gema.RegisterActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Profil extends AppCompatActivity implements View.OnClickListener {

    public CardView card_profil_saya, card_target_baca, card_tentang_gema, card_keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_profil);

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(Profil.this);
        String name = pref.getString("PROFILE_NAME", "");
        TextView saved_ubah_nama = findViewById(R.id.saved_ubah_nama);
        saved_ubah_nama.setText(name);

        findViewById(R.id.card_profil_saya).setOnClickListener(this);
        findViewById(R.id.card_target_baca).setOnClickListener(this);
        findViewById(R.id.card_tentang_gema).setOnClickListener(this);
        findViewById(R.id.card_keluar).setOnClickListener(this);


    }



    public void buttonClicked(View view){

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Buat Profil");

        //myRef.setValue("Simpan");
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        myRef.setValue(editText);

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
                i = new Intent(this, RegisterActivity.class);
                startActivity(i);
                break;
        }
    };


    //initialize And Assign Variable
    /*BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

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
}*/
}