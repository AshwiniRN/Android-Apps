package com.example.ashwininadagoud.doodle;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class GraphicsView extends View {
    private int colorCount;
    GraphicsView v;

    //The colors for the pen to draw on the canvas
    private int[] color = {0xFF000000, 0xFFffffff, 0xFF808080, 0xFFff0000, 0xFF00ff00,0xFF0000ff, 0xFFffff00,0xFFA52A2A};
    private Path drawPath;
    private Paint drawPaint;
    private Canvas drawCanvas;
    private Bitmap canvasBitmap;
    private int col=0xFF000000;
    Paint paint1=new Paint();


    final GestureDetector gdt = new GestureDetector(new GestureListener());

    public GraphicsView(Context context)
    {
        super(context);
        start();

    }

    private void start(){

        drawPath = new Path();
        drawPaint = new Paint();
        setColor(color[0]);
        drawPaint.setColor(col);
        drawPaint.setStrokeWidth(20);
        drawPaint.setStyle(Paint.Style.STROKE);

    }


    protected void onDraw(Canvas canvas) {

        drawPaint.setColor(color[colorCount]);
        canvas.drawPath(drawPath, drawPaint);

        paint1.setColor(color[colorCount]);
        paint1.setStyle(Paint.Style.FILL);
        canvas.drawRect(915,1570,1065,1720,paint1);

    }
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        canvasBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        drawCanvas = new Canvas(canvasBitmap);
    }
    private class GestureListener extends GestureDetector.SimpleOnGestureListener {
        @Override
        public boolean onSingleTapConfirmed(MotionEvent event) {

            colorCount = colorCount%7 + 1;
            return true;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float touchX = event.getX();
        float touchY = event.getY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                drawPath.moveTo(touchX, touchY);
                break;
            case MotionEvent.ACTION_MOVE:
                drawPath.lineTo(touchX, touchY);
                break;
            case MotionEvent.ACTION_HOVER_ENTER:
                drawPath.lineTo(touchX, touchY);
                drawCanvas.drawPath(drawPath, drawPaint);
                break;

            default:
                return false;
        }

        if(event.getX()>915  && event.getY()>1570)

        {
            gdt.onTouchEvent(event);
            colorCount=colorCount%7+1;

        }

        invalidate();
        return true;
    }
    public void setColor(int p)
    {

        drawPaint.setColor(colorCount);
        invalidate();
    }
}
