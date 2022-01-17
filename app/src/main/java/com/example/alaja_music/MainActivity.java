package com.example.alaja_music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }
    public void login(View view){
        Intent window_login = new Intent(this, Login.class);
        startActivity(window_login);
    }

    public void Sign_up(View signUp){
        Intent window_signUp= new Intent(this, Login.class);
        startActivity(window_signUp);
    }

    public void Reproductor_1(View view){
        Intent window_reproductor= new Intent(this, Reproductor_1.class);
        startActivity(window_reproductor);
    }

}