package com.example.alaja_music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

public class Login extends AppCompatActivity {

    private EditText mensaje1;
    //EditText txt_contraseña= (EditText)findViewById(R.id.txt_contraseña);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mensaje1= (EditText) findViewById(R.id.txt_usuario);
    }

    public void album(View album){
        Intent window_album= new Intent(this, Agregar_Album.class);
        window_album.putExtra("msj",mensaje1.getText().toString());
        startActivity(window_album);
    }




}