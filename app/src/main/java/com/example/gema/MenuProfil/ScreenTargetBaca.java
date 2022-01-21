package com.example.gema.MenuProfil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

import com.example.gema.R;

public class ScreenTargetBaca extends AppCompatActivity {

    EditText minReadPerDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_target_baca);

        minReadPerDays = findViewById(R.id.minReadPerDays);
        minReadPerDays.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(ScreenTargetBaca.this);
                return false;
            }
        });

    }
}