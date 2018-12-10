package com.example.ashwininadagoud.doodle;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GraphicsView graphicsView = new GraphicsView(this);
        setContentView(graphicsView);
    }
}