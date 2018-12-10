package com.example.ashwininadagoud.screensaver;


import java.util.TimerTask;

public class ShapesTimerTask extends TimerTask {

    private Shapes shapes;
    private ShapesView shapesView;

    public ShapesTimerTask(Shapes shapes, ShapesView shapesView)
    {
        this.shapes=shapes;
        this.shapesView=shapesView;
    }
    public void run()
    {
        shapes.update();
        shapesView.postInvalidate();
    }
}
