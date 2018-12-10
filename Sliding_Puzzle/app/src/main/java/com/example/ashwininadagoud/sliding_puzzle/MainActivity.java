package com.example.ashwininadagoud.sliding_puzzle;

import android.graphics.Point;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;


public class MainActivity extends AppCompatActivity {

    private final int SIZE=3;
    int startIndex,endIndex;

    private Game game;
    private AppInterface appInterface;
    private GestureDetector gestureDetector;
    private boolean gameOver;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        game= new Game();

        appInterface = new AppInterface(this, screenHeight(), screenWidth());
        setContentView(appInterface);
        appInterface.showCurrent(game.getCurrent());

        TouchHandler temp=new TouchHandler();
        gestureDetector = new GestureDetector(this, temp);
        gestureDetector.setOnDoubleTapListener(temp);

        gameOver = false;
    }

    public boolean onTouchEvent(MotionEvent event)
    {
        if(!gameOver)gestureDetector.onTouchEvent(event);

        return true;
    }
    private int screenHeight()
    {
        Point size = new Point();
        getWindowManager().getDefaultDisplay().getSize(size);

        int DP =(int)(getResources().getDisplayMetrics().density);

        return size.y-80*DP; //Subtract the top menu bar
    }
    private int screenWidth()
    {
        Point size = new Point();
        getWindowManager().getDefaultDisplay().getSize(size);

        int DP =(int)(getResources().getDisplayMetrics().density);

        return size.x;
    }
    private class TouchHandler extends GestureDetector.SimpleOnGestureListener
    {
        public boolean onFling(MotionEvent event1, MotionEvent event2, float velocityX, float velocityY)
        {

            int startIndexX = getX(event1)/(screenWidth()/SIZE);
            int startIndexY = getY(event1)/(screenHeight()/SIZE);

            int endIndexX = getX1(event2)/(screenWidth()/SIZE);
            int endIndexY = getY1(event2)/(screenHeight()/SIZE);

        //Conditions to check if the touch is made on valid points
            if(startIndexX==0&&startIndexY==0)
            {
                startIndex=0;
            }
            else if(startIndexX==1&&startIndexY==0)
            {
                startIndex=1;
            }
            else if(startIndexX==2&&startIndexY==0)
            {
                startIndex=2;
            }
            else if(startIndexX==0&&startIndexY==1)
            {
                startIndex=3;
            }
            else if(startIndexX==1&&startIndexY==1)
            {
                startIndex=4;
            }
            else if(startIndexX==2&&startIndexY==1)
            {
                startIndex=5;
            }
            else if(startIndexX==0&&startIndexY==2)
            {
                startIndex=6;
            }
            else if(startIndexX==1&&startIndexY==2)
            {
                startIndex=7;
            }
            else if(startIndexX==2&&startIndexY==2)
            {
                startIndex=8;
            }


            if(endIndexX==0 && endIndexY==0)
            {
                endIndex=0;
            }
            else if(endIndexX==1 && endIndexY==0)
            {
                endIndex=1;
            }
            else if(endIndexX==2 && endIndexY==0)
            {
                endIndex=2;
            }
            else if(endIndexX==0 && endIndexY==1)
            {
                endIndex=3;
            }
            else if(endIndexX==1 && endIndexY==1)
            {
                endIndex=4;
            }
            else if(endIndexX==2 && endIndexY==1)
            {
                endIndex=5;
            }
            else if(endIndexX==0 && endIndexY==2)
            {
                endIndex=6;
            }
            else if(endIndexX==1 && endIndexY==2)
            {
                endIndex=7;
            }
            else if(endIndexX==2 && endIndexY==2)
            {
                endIndex=8;
            }

            game.exchange(startIndex, endIndex);


            appInterface.showCurrent(game.getCurrent());

            if(game.solved())
            {
                appInterface.stop();
                gameOver = true;
            }
            return true;
        }
        private int getY(MotionEvent event1)
        {
            int DP = (int)(getResources().getDisplayMetrics().density);

            return (int)(event1.getY()-80*DP);
        }
        private int getX(MotionEvent event1)
        {
            int DP = (int)(getResources().getDisplayMetrics().density);

            return (int)(event1.getX());
        }
        private int getY1(MotionEvent event2)
        {
            int DP = (int)(getResources().getDisplayMetrics().density);

            return (int)(event2.getY()-80*DP);
        }
        private int getX1(MotionEvent event2)
        {
            int DP = (int)(getResources().getDisplayMetrics().density);

            return (int)(event2.getX());
        }
    }
}
