package com.example.gema.MenuProfil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.gema.Profil.Profil;
import com.example.gema.R;

public class ScreenTargetBaca extends AppCompatActivity {

    EditText minReadPerDays;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_target_baca);

        ImageView back = (ImageView) findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Profil.class);
                startActivity(intent);
            }
        });

        minReadPerDays = findViewById(R.id.minReadPerDays);
        minReadPerDays.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(ScreenTargetBaca.this);
                SharedPreferences.Editor edit = pref.edit();
                edit.putInt("minReadPerDays", Integer.valueOf(String.valueOf(minReadPerDays.getText())));
                return false;
            }
        });

    }
}