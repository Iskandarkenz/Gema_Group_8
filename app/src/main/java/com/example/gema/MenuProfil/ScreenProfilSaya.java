package com.example.gema.MenuProfil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gema.Profil.Profil;
import com.example.gema.Profil.ScreenMasukProfil;
import com.example.gema.R;

public class ScreenProfilSaya extends AppCompatActivity {

    SharedPreferences pref;
    Button saveButton;
    EditText test;
    EditText test2;
    TextView testing;
    TextView testing2;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_profil_saya);

        ImageView back = (ImageView) findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Profil.class);
                startActivity(intent);
            }
        });

        pref = PreferenceManager.getDefaultSharedPreferences(ScreenProfilSaya.this);

        /*final EditText changeNameEditText = findViewById(R.id.ubah_nama);
        final EditText changeAgeEditText = findViewById(R.id.ubah_umur);
        Button saveButton = findViewById(R.id.btn_save);*/

        saveButton = findViewById(R.id.btn_save);
        test = findViewById(R.id.ubah_nama);
        test2 = findViewById(R.id.ubah_umur);
        testing = findViewById(R.id.nama);
        testing2 = findViewById(R.id.umur);

        String name = pref.getString("PROFILE_NAME", "");
        test.setText(name);
        String age = pref.getString("PROFILE_AGE", "");
        test.setText(name);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String changeName = test.getText().toString().trim();
                String changeAge = test2.getText().toString().trim();

                SharedPreferences.Editor edit = pref.edit();
                edit.putString("PROFILE_NAME", changeName);
                edit.putString("PROFILE_AGE", changeAge);

                saveButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String str = test.getText().toString();
                        testing.setText(str);
                    }
                });
                edit.apply();
                startActivity(new Intent(getApplicationContext(), Profil.class));

                /*TextView savedTextView = findViewById(R.id.saved_ubah_nama);
                String savedText = pref.getString("CHANGE_NAME", "");
                savedTextView.setText(savedText);*/
            }
        });
    }
}