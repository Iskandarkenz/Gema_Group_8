package com.example.gema;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.gema.Profil.MainProfilActivity;
import com.example.gema.Profil.Profil;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    private EditText editEmail, editpassword;
    private Button btnlogin, btnregister;
    private ProgressDialog progressDialog ;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editEmail = findViewById(R.id.email);
        editpassword = findViewById(R.id.password);
        btnlogin = findViewById(R.id.btn_login);
        btnregister = findViewById(R.id.btn_register);

        mAuth = FirebaseAuth.getInstance();
        progressDialog = new ProgressDialog(LoginActivity.this);
        progressDialog.setTitle("Loading");
        progressDialog.setMessage("Silakan Tunggu");
        progressDialog.setCancelable(false);


        // Fungsi Tombol

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Profil.class);
                startActivity(intent);
            }
        });

        btnregister.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
        });

        btnlogin.setOnClickListener(v -> {
            if ((editEmail.getText().length()>0 && editpassword.getText().length()>0)) {
                login(editEmail.getText().toString(), editpassword.getText().toString());

            }else{
                Toast.makeText(getApplicationContext(),"Silakan isi Password" , Toast.LENGTH_SHORT).show();
            }
        });

    }
    private void  login (String email, String password){

        mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful() && task.getResult()!=null) {
                    if (task.getResult().getUser() != null) {
                        reload();

                    } else {
                        Toast.makeText(getApplicationContext(), "Login Gagal", Toast.LENGTH_SHORT).show();
                    }
                  }
              }
        });
    }


        private void reload(){
            startActivity(new Intent(getApplicationContext(), MainProfilActivity.class));

        }
        @Override
        public void onStart() {
            super.onStart();
            FirebaseUser currentUser = mAuth.getCurrentUser();
            if(currentUser != null){
                reload();
            }
        }
    }