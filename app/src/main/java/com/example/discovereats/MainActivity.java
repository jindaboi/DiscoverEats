package com.example.discovereats;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText username, password;
    private Button loginButton, createNewAccountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);
        loginButton = findViewById(R.id.createNewAccountButton);


    }


}