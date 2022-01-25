package com.example.alaja_music;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

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

    public void registrar(){
        Intent intent = new Intent();
        intent.addCategory(intent.getAction());

    }
}