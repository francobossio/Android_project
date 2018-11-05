package com.example.tractor.test;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;


public class Activity2 extends AppCompatActivity {
    public MediaPlayer media;
    ImageButton boten;
    Activity2 context;
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        boton = (Button) findViewById(R.id.boton2_7);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        boten = (ImageButton)findViewById(R.id.idboton2 );
        boten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boten = (ImageButton)findViewById(R.id.idboton2 );
                context.startSound(R.raw.oh);
                boten.setImageDrawable(getResources().getDrawable(R.drawable.boton1));
                boten.setImageResource(R.drawable.boton1);

            }
        });

        boten = (ImageButton)findViewById(R.id.idboton1);
        boten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startSound(R.raw.zaza);
            }
        });

        boten = (ImageButton)findViewById(R.id.idboton2);
        boten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startSound(R.raw.r);
            }
        });

        boten = (ImageButton)findViewById(R.id.idboton3);
        boten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startSound(R.raw.oh);
            }
        });

        boten = (ImageButton)findViewById(R.id.idboton4);
        boten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startSound(R.raw.clases);
            }
        });


        boten = (ImageButton)findViewById(R.id.idboton5);
        boten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startSound(R.raw.zaza);
            }
        });

        boten = (ImageButton)findViewById(R.id.idboton6);
        boten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startSound(R.raw.lacasa);
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

    private void stopSound() {
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

    public void openActivity2 (){
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);

    }

}


