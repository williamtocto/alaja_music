package com.example.alaja_music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void login(View view){
        Intent window_login = new Intent(this, Login.class);
        startActivity(window_login);
    }

    public void Sign_up(View signUp){
        Intent window_signUp= new Intent(this, SignUp.class);
        startActivity(window_signUp);
    }


}