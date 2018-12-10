package com.example.ashwininadagoud.simplepiano;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button key1,key2,key3,key4,key5,key6,key7,key8;

    private SoundPool soundPool;
    private int sound1,sound2,sound3,sound4,sound5,sound6,sound7,sound8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //To access the buttons
        key1 = (Button) findViewById(R.id.btn1);
        key2 = (Button) findViewById(R.id.btn2);
        key3 = (Button) findViewById(R.id.btn3);
        key4 = (Button) findViewById(R.id.btn4);
        key5 = (Button) findViewById(R.id.btn5);
        key6 = (Button) findViewById(R.id.btn6);
        key7 = (Button) findViewById(R.id.btn7);
        key8 = (Button) findViewById(R.id.btn8);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            soundPool = new SoundPool.Builder().setMaxStreams(5).build();
        }
        else{
            soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        }

        //To load the sound files
        sound1 = soundPool.load(this, R.raw.sound1, 1);
        sound2 = soundPool.load(this, R.raw.sound2, 1);
        sound3 = soundPool.load(this, R.raw.sound3, 1);
        sound4 = soundPool.load(this, R.raw.sound4, 1);
        sound5 = soundPool.load(this, R.raw.sound5, 1);
        sound6 = soundPool.load(this, R.raw.sound6, 1);
        sound7 = soundPool.load(this, R.raw.sound7, 1);
        sound8 = soundPool.load(this, R.raw.sound8, 1);

        //Set sound to key1
        key1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound1,1,1,0,0,1);

            }
        });

        //Set sound to key2
        key2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound2,1,1,0,0,1);

            }
        });

        //Set sound to key3
        key3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound3,1,1,0,0,1);

            }
        });

        //Set sound to key4
        key4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound4,1,1,0,0,1);

            }
        });

        //Set sound to key5
        key5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound5,1,1,0,0,1);

            }
        });

        //Set sound to key6
        key6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound6,1,1,0,0,1);

            }
        });

        //Set sound to key7
        key7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound7,1,1,0,0,1);

            }
        });

        //Set sound to key8
        key8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound8,1,1,0,0,1);

            }
        });
    }
}
