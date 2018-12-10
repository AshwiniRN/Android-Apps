package com.example.ashwininadagoud.shooting;

import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;

import java.util.Timer;

public class MainActivity extends Activity {

    private Game game;
    private GameView gameView;
    private GestureDetector gestureDetector;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        game=new Game();

        gameView = new GameView(this, game);

        setContentView(gameView);

        Timer timer = new Timer();
        GameTimerTask task=new GameTimerTask(game, gameView);
        timer.schedule(task, 1000, 20);

        TouchHandler temp=new TouchHandler();
        gestureDetector = new GestureDetector(this, temp);
        gestureDetector.setOnDoubleTapListener(temp);


    }
    public boolean onTouchEvent(MotionEvent event)
    {
        gestureDetector.onTouchEvent(event);
        return true;
    }
    private class TouchHandler extends GestureDetector.SimpleOnGestureListener
    {
        public boolean onDoubleTap(MotionEvent event) {
            game.fire();
            return true;
        }
    }
}
