package com.example.tractor.test;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;

import static com.example.tractor.test.R.id.boton2_1;
import static com.example.tractor.test.R.id.boton2_2;
import static com.example.tractor.test.R.id.boton2_3;
import static com.example.tractor.test.R.id.boton2_4;
import static com.example.tractor.test.R.id.boton2_5;
import static com.example.tractor.test.R.id.boton2_6;
import static com.example.tractor.test.R.id.button;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Button mi2boton7 = (Button)findViewById(R.id.boton2_7);
        mi2boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });

        Button mi2boton1 = (Button) findViewById(boton2_1);
        final MediaPlayer np = MediaPlayer.create(this, R.raw.calor);
        mi2boton1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                np.start();
            }

        });
        Button mi2boton2 = (Button) findViewById(boton2_2);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.r);
        mi2boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
        Button mi2boton3 = (Button) findViewById(boton2_3);
        final MediaPlayer sp = MediaPlayer.create(this, R.raw.oh);
        mi2boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sp.start();
            }
        });
        Button mi2boton4 = (Button) findViewById(boton2_4);
        final MediaPlayer ap = MediaPlayer.create(this, R.raw.clases);
        mi2boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ap.start();

            }
        });
        Button mi2boton5 = (Button) findViewById(boton2_5);
        final MediaPlayer bp = MediaPlayer.create(this, R.raw.zaza);
        mi2boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bp.start();
            }
        });

        Button mi2boton6 = (Button) findViewById(boton2_6);
        final MediaPlayer cp = MediaPlayer.create(this, R.raw.lacasa);
        mi2boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cp.start();
            }
        });


    }
    public void openActivity3() {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }
}


