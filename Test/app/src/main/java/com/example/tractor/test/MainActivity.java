package com.example.tractor.test;

import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import junit.framework.Test;

public class MainActivity extends AppCompatActivity {
    Button bt;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });

        Button miboton = (Button)findViewById(R.id.boton1);
        Button miboton2 = (Button) findViewById(R.id.boton2);
        final TextView mitexto = (TextView) findViewById(R.id.texto1);
        final MediaPlayer np = MediaPlayer.create(this, R.raw.sample);
        miboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                np.start();
                mitexto.setText("ELEGISTE A VICENTE");
                mitexto.setTextColor(mitexto.getContext().getResources().getColor(R.color.blue));
                Toast texto1 =
                        Toast.makeText(getApplicationContext(), "LOL", Toast.LENGTH_SHORT);
                texto1.show();

            }
        });
        miboton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mitexto.setText("ELEGISTE EL ROJO");
                mitexto.setTextColor(mitexto.getContext().getResources().getColor(R.color.red));
            }
        });
    }
    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

}
