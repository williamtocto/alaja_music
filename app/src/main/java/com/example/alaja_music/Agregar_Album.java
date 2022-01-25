package com.example.alaja_music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Agregar_Album extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_album);
        text=(TextView) findViewById(R.id.mensaje);
        String dato=getIntent().getStringExtra("msj");
        text.setText( "Bienvenido "+dato);
    }



    public void playListV(View playList){
        Intent window_playList= new Intent(this, Descripcion_Artista.class);
        startActivity(window_playList);

    }
}