package com.example.ashwininadagoud.shooting;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;



public class GameView extends View {

    private Game game;
    private double sceneWidth;
    private double sceneHeight;
    String color;

    public GameView(Context context, Game game)
    {
        super(context);

        this.game=game;
        this.sceneWidth=1820;
        this.sceneHeight=1050;
        this.color=" ";
    }

    public void onDraw(Canvas canvas)
    {
        double birdX = game.getBirdX();
        double birdY = game.getBirdY();
        double bulletX=game.getBulletX();
        double bulletY=game.getBulletY();
        double gunX=game.getGunX();
        double gunY= game.getGunY();
        double scenegun=game.getScenegun();
        double radius = game.getRadius();

        String color=game.getColor();
        Paint paint = new Paint();

        paint.setColor(Color.parseColor("#D6EAF8"));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(0, 0, (float)sceneWidth, (float)sceneHeight, paint);

        paint.setColor(Color.parseColor(color));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle((float)birdX, (float)(sceneHeight-birdY), (float)radius, paint);

        paint.setColor(Color.parseColor("#7B241C"));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle((float)bulletX, (float)(scenegun-bulletY),(float)radius, paint);

        paint.setColor(Color.parseColor("#7B241C"));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(30);
        canvas.drawLine(0, (float)scenegun, (float)gunX,(float)(scenegun-gunY), paint);

    }


    public void setColor(String color1)
    {
        color=color1;
    }

}
