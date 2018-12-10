package com.example.ashwininadagoud.screensaver;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import java.util.Random;


public class ShapesView extends View {

    private Shapes shapes;
    private double sceneWidth;
    private double sceneHeight;

    public int randomRed(int i)
    {
        Random randnum = new Random();
        i=randnum.nextInt(255);
        return i;
    }
    public int randomGreen(int i)
    {
        Random randnum = new Random();
        i=randnum.nextInt(255);
        return i;
    }
    public int randomBlue(int i)
    {
        Random randnum = new Random();
        i=randnum.nextInt(255);
        return i;
    }
    int i;
    int red=randomRed(i),green=randomGreen(i),blue=randomBlue(i);
    int red1=randomRed(i),green1=randomGreen(i),blue1=randomBlue(i);
    int red2=randomRed(i),green2=randomGreen(i),blue2=randomBlue(i);
    int red3=randomRed(i),green3=randomGreen(i),blue3=randomBlue(i);
    int red4=randomRed(i),green4=randomGreen(i),blue4=randomBlue(i);
    int red5=randomRed(i),green5=randomGreen(i),blue5=randomBlue(i);
    int red6=randomRed(i),green6=randomGreen(i),blue6=randomBlue(i);
    int red7=randomRed(i),green7=randomGreen(i),blue7=randomBlue(i);
    int red8=randomRed(i),green8=randomGreen(i),blue8=randomBlue(i);
    int red9=randomRed(i),green9=randomGreen(i),blue9=randomBlue(i);
    int red10=randomRed(i),green10=randomGreen(i),blue10=randomBlue(i);
    int red11=randomRed(i),green11=randomGreen(i),blue11=randomBlue(i);
    int red12=randomRed(i),green12=randomGreen(i),blue12=randomBlue(i);
    int red13=randomRed(i),green13=randomGreen(i),blue13=randomBlue(i);
    int red14=randomRed(i),green14=randomGreen(i),blue14=randomBlue(i);
    int red15=randomRed(i),green15=randomGreen(i),blue15=randomBlue(i);
    int red16=randomRed(i),green16=randomGreen(i),blue16=randomBlue(i);
    int red17=randomRed(i),green17=randomGreen(i),blue17=randomBlue(i);
    int red18=randomRed(i),green18=randomGreen(i),blue18=randomBlue(i);
    int red19=randomRed(i),green19=randomGreen(i),blue19=randomBlue(i);

    public ShapesView(Context context, Shapes shapes)
    {
        super(context);

        this.shapes=shapes;
        this.sceneWidth=1800;
        this.sceneHeight=1000;
    }

    public void onDraw(Canvas canvas)
    {
        double x1 = shapes.getBirdX();
        double birdY = shapes.getBirdY();
        double x2=shapes.getx2();
        double y1=shapes.getY1();
        double squareX1=shapes.getSquarex1();
        double squarey1=shapes.getSquarey1();
        double squaLength1=shapes.getSqr1Length();
        double squareX2=shapes.getSquarex2();
        double squarey2=shapes.getSquarey2();
        double squaLength2=shapes.getSqr1Length2();

        double squareX3=shapes.getSquarex3();
        double squarey3=shapes.getSquarey3();
        double squaLength3=shapes.getSquareLen3();
        double squareX4=shapes.getSquarex4();
        double squarey4=shapes.getSquarey4();
        double squaLength4=shapes.getSquareLen4();

        double squareX5=shapes.getSquarex5();
        double squarey5=shapes.getSquarey5();
        double squaLength5=shapes.getSquareLen5();
        double squareX6=shapes.getSquarex6();
        double squarey6=shapes.getSquarey6();
        double squaLength6=shapes.getSquareLen6();

        double squareX7=shapes.getSquarex7();
        double squarey7=shapes.getSquarey7();
        double squaLength7=shapes.getSquareLen7();
        double squareX8=shapes.getSquarex8();
        double squarey8=shapes.getSquarey8();
        double squaLength8=shapes.getSquareLen8();

        double squareX9=shapes.getSquarex9();
        double squarey9=shapes.getSquarey9();
        double squaLength9=shapes.getSquareLen9();
        double squareX10=shapes.getSquarex10();
        double squarey10=shapes.getSquarey10();
        double squaLength10=shapes.getSquareLen10();

        double x9=shapes.getx9();
        double y9=shapes.getY9();
        double x10=shapes.getx10();
        double y10=shapes.getY10();
        double x9rad=shapes.getRadius9();
        double x10rad=shapes.getRadius10();

        double x3=shapes.getx3();
        double y3=shapes.getY3();
        double x4=shapes.getx4();
        double y4=shapes.getY4();
        double x3rad=shapes.getRadius3();
        double x4rad=shapes.getRadius4();

        double x5=shapes.getx5();
        double y5=shapes.getY5();
        double x6=shapes.getx6();
        double y6=shapes.getY6();
        double x5rad=shapes.getRadius5();
        double x6rad=shapes.getRadius6();

        double x7=shapes.getx7();
        double y7=shapes.getY7();
        double x8=shapes.getx8();
        double y8=shapes.getY8();
        double x7rad=shapes.getRadius7();
        double x8rad=shapes.getRadius8();

        double radius = shapes.getRadius();
        double radius2=shapes.getRadius2();

        Paint paint = new Paint();


        paint.setColor(Color.parseColor("#000000"));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(0, 0, (float)sceneWidth, (float)sceneHeight, paint);

        paint.setColor(Color.rgb(red,green, blue));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle((float)x1, (float)birdY, (float)radius, paint);

        paint.setColor(Color.rgb(red1, green1, blue1));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle((float)y1, (float)x2, (float)radius2, paint);

        paint.setColor(Color.rgb(red2, green2, blue2));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect((float)squareX1, (float)squarey1, (float)(squaLength1+squareX1),(float)(squaLength1+squarey1), paint);

        paint.setColor(Color.rgb(red3, green3, blue3));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect((float)squareX2, (float)squarey2, (float)(squaLength2+squareX2),(float)(squaLength2+squarey2), paint);

        paint.setColor(Color.rgb(red4,green4, blue4));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle((float)y3, (float)x3, (float)x3rad, paint);

        paint.setColor(Color.rgb(red5,green5, blue5));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle((float)y4, (float)x4, (float)x4rad, paint);

        paint.setColor(Color.rgb(red6,green6, blue6));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle((float)x5, (float)y5, (float)x5rad, paint);

        paint.setColor(Color.rgb(red7,green7, blue7));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle((float)x6, (float)y6, (float)x6rad, paint);

        paint.setColor(Color.rgb(red8, green8, blue8));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect((float)squarey3, (float)squareX3, (float)(squaLength3+squarey3),(float)(squaLength3+squareX3), paint);

        paint.setColor(Color.rgb(red9, green9, blue9));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect((float)squarey4, (float)squareX4, (float)(squaLength4+squarey4),(float)(squaLength4+squareX4), paint);

        paint.setColor(Color.rgb(red10, green10, blue10));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect((float)squareX5, (float)squarey5, (float)(squaLength5+squareX5),(float)(squaLength5+squarey5), paint);

        paint.setColor(Color.rgb(red11, green11, blue11));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect((float)squareX6, (float)squarey6, (float)(squaLength6+squareX6),(float)(squaLength6+squarey6), paint);

        paint.setColor(Color.rgb(red12,green12, blue12));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle((float)x7, (float)y7, (float)x7rad, paint);

        paint.setColor(Color.rgb(red13,green13, blue13));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle((float)x8, (float)y8, (float)x8rad, paint);

        paint.setColor(Color.rgb(red14, green14, blue14));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect((float)squareX7, (float)squarey7, (float)(squaLength7+squareX7),(float)(squaLength7+squarey7), paint);

        paint.setColor(Color.rgb(red15, green15, blue15));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect((float)squareX8, (float)squarey8, (float)(squaLength8+squareX8),(float)(squaLength8+squarey8), paint);

        paint.setColor(Color.rgb(red16, green16, blue16));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect((float)squareX9, (float)squarey9, (float)(squaLength9+squareX9),(float)(squaLength9+squarey9), paint);

        paint.setColor(Color.rgb(red17, green17, blue17));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect((float)squareX10, (float)squarey10, (float)(squaLength10+squareX10),(float)(squaLength10+squarey10), paint);

        paint.setColor(Color.rgb(red18,green18, blue18));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle((float)y9, (float)x9, (float)x9rad, paint);

        paint.setColor(Color.rgb(red19,green19, blue19));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle((float)y10, (float)x10, (float)x10rad, paint);


    }

}
