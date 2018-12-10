package com.example.ashwininadagoud.screensaver;

import android.os.Bundle;
import android.app.Activity;
import java.util.Timer;

public class MainActivity extends Activity {

    private Shapes shapes;
    private ShapesView shapesView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        shapes = new Shapes();

        shapesView = new ShapesView(this, shapes);

        setContentView(shapesView);

        Timer timer = new Timer();
        ShapesTimerTask task = new ShapesTimerTask(shapes, shapesView);
        timer.schedule(task, 1000, 20);

    }
}
