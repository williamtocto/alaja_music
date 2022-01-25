package com.example.alaja_music;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Descripcion_Artista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion_artista);

        ImageButton buttonCamara=findViewById(R.id.buttonCamara);
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
}