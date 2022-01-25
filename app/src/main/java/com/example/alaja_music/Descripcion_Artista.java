package com.example.alaja_music;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class Descripcion_Artista extends AppCompatActivity {


    ProgressBar progressBar;
    Intent window_reproductor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion_artista);
        progressBar=(ProgressBar) findViewById(R.id.progressBar);
        ImageButton buttonCamara=findViewById(R.id.buttonCamara);
        progressBar.setVisibility(View.INVISIBLE);
        buttonCamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCamara= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if(intentCamara.resolveActivity(getPackageManager())!=null){
                    startActivityForResult(intentCamara,1);
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1 && resultCode==RESULT_OK){
            Bundle bundle =data.getExtras();
            Bitmap imagen= (Bitmap) bundle.get("data");

            ImageView imageView=findViewById(R.id.imageViewCaptura);
            imageView.setImageBitmap(imagen);
        }
    }

    public void album(View album){
        window_reproductor= new Intent(this, Reproductor_1.class);
        progressBar.setVisibility(View.VISIBLE);
        new Hilo1().start();
    }

    class Hilo1 extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(5000);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        progressBar.setVisibility(View.INVISIBLE);
                        startActivity(window_reproductor);
                    }
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}