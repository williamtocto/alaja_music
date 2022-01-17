package com.example.alaja_music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Agregar_Album extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_album);
    }


    public void playListV(View playList){
        Intent window_playList= new Intent(this, PlayList.class);
        startActivity(window_playList);
    }
}