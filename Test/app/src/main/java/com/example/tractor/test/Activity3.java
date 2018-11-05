package com.example.tractor.test;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity3 extends AppCompatActivity {
    public MediaPlayer media;
    Activity3 context;
    ImageButton boten;
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        boten = (ImageButton)findViewById(R.id.boton1);
        boten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startSound(R.raw.sample);

            }
        });

        boton = (Button)findViewById(R.id.volver);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

        boten = (ImageButton)findViewById(R.id.boton2);
        boten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startSound(R.raw.boliviano);
            }
        });

        boten = (ImageButton)findViewById(R.id.boton3);
        boten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startSound(R.raw.cristian);
            }
        });

        boten = (ImageButton)findViewById(R.id.boton4);
        boten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startSound(R.raw.lacon);
            }
        });

        boten = (ImageButton)findViewById(R.id.boton5);
        boten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startSound(R.raw.lapatita);
            }
        });

        boten = (ImageButton)findViewById(R.id.boton6);
        boten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startSound(R.raw.iago);
            }
        });

        Button pausa = (Button)findViewById(R.id.pause);
        pausa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media.isPlaying()){
                    media.pause();
                }
            }
        });

        Button play = (Button)findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(media.isLooping()) {
                    media.start();
                    }
                else {
                    media.start();
                }
            }
        });


    }

    public void startSound(int song){
        System.out.println("startSound");
        if (this.media != null) {
            if (this.media.isPlaying()) {
                this.media.stop();
            }
            this.media.release();

        }
        this.media = MediaPlayer.create(this, song);
        this.media.start();
    }
    public void openActivity3 (){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);

    }


}
