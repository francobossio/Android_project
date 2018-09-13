package com.example.tractor.test;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.tractor.test.R.id.boton2_1;
import static com.example.tractor.test.R.id.boton3_1;
import static com.example.tractor.test.R.id.boton3_2;
import static com.example.tractor.test.R.id.boton3_3;
import static com.example.tractor.test.R.id.boton3_4;
import static com.example.tractor.test.R.id.boton3_5;
import static com.example.tractor.test.R.id.boton3_6;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        Button mi3boton1 = (Button) findViewById(boton3_1);
        final MediaPlayer np = MediaPlayer.create(this, R.raw.iago);
        mi3boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                np.start();
            }

        });
        Button mi3boton2 = (Button) findViewById(boton3_2);
        final MediaPlayer ap = MediaPlayer.create(this, R.raw.lapatita);
        mi3boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ap.start();
            }

        });

        Button mi3boton3 = (Button) findViewById(boton3_3);
        final MediaPlayer bp = MediaPlayer.create(this, R.raw.cristian);
        mi3boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bp.start();
            }

        });

        Button mi3boton4 = (Button) findViewById(boton3_4);
        final MediaPlayer cp = MediaPlayer.create(this, R.raw.boliviano);
        mi3boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cp.start();
            }

        });

        Button mi3boton5 = (Button) findViewById(boton3_5);
        final MediaPlayer dp = MediaPlayer.create(this, R.raw.pezon);
        mi3boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dp.start();
            }

        });

        Button mi3boton6 = (Button) findViewById(boton3_6);
        final MediaPlayer ep = MediaPlayer.create(this, R.raw.lacon);
        mi3boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ep.start();
            }

        });


    }
}
