package com.example.tugas_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //    variabel komponen
    EditText txtUsername;
    EditText txtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        txtPassword = findViewById(R.id.txtPassword);
        txtUsername = findViewById(R.id.txtUsername);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtUsername.getText().toString().equals("Afdhal") && txtPassword.getText().toString().equals("Deeznut69")){
                    Toast.makeText(MainActivity.this, "login successful", Toast.LENGTH_LONG).show();
                    Toast.makeText(MainActivity.this, "Hello " + txtUsername.getText().toString(), Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this, Dashboard.class);
                    startActivity(intent);
                    finish();
                }
                else {
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_LONG).show();
                }
            }
        });
    }}