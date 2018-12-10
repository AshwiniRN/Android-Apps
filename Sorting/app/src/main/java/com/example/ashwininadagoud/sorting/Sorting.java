package com.example.ashwininadagoud.sorting;

import android.content.Context;
import android.graphics.Color;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import java.util.Random;

import static com.example.ashwininadagoud.sorting.AppInterface.*;

public class Sorting {
    AppInterface appInterface;
    Context context;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19;


    public Sorting(Context context) {
        appInterface = new AppInterface(context);
        this.context = context;

        //Set of buttons to hold the random numbers
        btn1 = array[0];
        btn2 = array[1];
        btn3 = array[2];
        btn4 = array[3];
        btn5 = array[4];
        btn6 = array[5];
        btn7 = array[6];
        btn8 = array[7];
        btn9 = array[8];
        setValues1();

        //Set of buttons used for swapping window
        btn11 = array[0];
        btn12 = array[1];
        btn13 = array[2];
        btn14 = array[3];
        btn15 = array[4];
        btn16 = array[5];
        btn17 = array[6];
        btn18 = array[7];
        btn19 = array[8];
        setValues2();


        final GestureDetector gdt = new GestureDetector(new GestureListener());


        appInterface.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(final View view, final MotionEvent event) {
                gdt.onTouchEvent(event);
                return true;
            }
        });

    }

    private class GestureListener extends GestureDetector.SimpleOnGestureListener {
        @Override
        public boolean onSingleTapConfirmed(MotionEvent event) {

            checkButton(windowValue);
            return true;
        }
        public boolean onDoubleTap(MotionEvent event)
        {
            swapButton(windowValue);
            return true;
        }

    }


    public void checkButton(int x)
    {

        if (x == 0) {
            removeBackground();
            backgroundSetting1(x);
            windowValue=1;
        } else if (x == 1) {
            removeBackground();
            backgroundSetting1(x);
            windowValue=2;
        } else if (x == 2) {
            removeBackground();
            backgroundSetting1(x);
            windowValue=3;
        } else if (x == 3) {
            removeBackground();
            backgroundSetting1(x);
            windowValue=4;
        } else if (x == 4) {
            removeBackground();
            backgroundSetting1(x);
            windowValue=5;
        } else if (x == 5) {
            removeBackground();
            backgroundSetting1(x);
            windowValue=6;
        } else if (x == 6) {
            removeBackground();
            backgroundSetting1(x);
            windowValue=7;
        } else if (x == 7) {
            removeBackground();
            backgroundSetting1(x);
            windowValue=0;


        }

    }
    //To swap the values on comparison
    public void swapButton(int y)
    {
        if(y==0)
        {
            y=0;
            swapping(y);
        }
        if(y==1)
        {
            y=1;
            swapping(y);

        }
        else if(y==2)
        {

            y=2;
            swapping(y);

        }
        else if(y==3)
        {
            y=3;
            swapping(y);

        }
        else if(y==4)
        {
            y=4;
            swapping(y);

        }
        else if(y==5)
        {
            y=5;
            swapping(y);

        }
        else if(y==6)
        {
            y=6;
            swapping(y);

        }
        else if(y==7)
        {
            y=7;
            swapping(y);


        }
        if(y==8)
        {
            y=8;
            swapping(y);

        }

    }


    public AppInterface getAppInterface()
    {
        return appInterface;
    }
    public void setValues1()
   //To generate random values
    {
        generateRandomValues();
        btn1.setText(v[0]);
        btn2.setText(v[1]);
        btn3.setText(v[2]);
        btn4.setText(v[3]);
        btn5.setText(v[4]);
        btn6.setText(v[5]);
        btn7.setText(v[6]);
        btn8.setText(v[7]);
        btn9.setText(v[8]);

    }
    int windowValuePassing;

    //To generate the swapping window at random locations
    public void setValues2()

    {
        generateRandomWindow();

        windowValuePassing=windowValue;
        backgroundSetting(windowValuePassing);


    }

    int windowValue;
    public void generateRandomWindow()
    {
        Random r= new Random();
        windowValue=r.nextInt(10);
    }


    int a[]=new int[9];
    String v[]=new String[9];
    int i,j,k;
    Random r=new Random();
    boolean status=false;

    //To generate random numbers
    public void generateRandomValues()
    {
        a[0]=r.nextInt(9);
        for(int i = 0; i < 9; i++) {
            a[i] = (int) (Math.random() * 100 + 1);
        }

        for(i=0;i<9;i++)
        {
            if(a[i]==0)
                v[i]="";
            else
                v[i]=Integer.toString(a[i]);

        }

    }


    public void backgroundSetting(int winValue)
    {
        if(winValue==0)
        {
            btn11.setBackgroundColor(Color.parseColor("#F7DC6F"));
            btn12.setBackgroundColor(Color.parseColor("#F7DC6F"));
        }
        if(winValue==1)
        {
            btn12.setBackgroundColor(Color.parseColor("#F7DC6F"));
            btn13.setBackgroundColor(Color.parseColor("#F7DC6F"));
        }
        if(winValue==2)
        {
            btn13.setBackgroundColor(Color.parseColor("#F7DC6F"));
            btn14.setBackgroundColor(Color.parseColor("#F7DC6F"));
        }
        if(winValue==3)
        {
            btn14.setBackgroundColor(Color.parseColor("#F7DC6F"));
            btn15.setBackgroundColor(Color.parseColor("#F7DC6F"));
        }
        if(winValue==4)
        {
            btn15.setBackgroundColor(Color.parseColor("#F7DC6F"));
            btn16.setBackgroundColor(Color.parseColor("#F7DC6F"));
        }
        if(winValue==5)
        {
            btn16.setBackgroundColor(Color.parseColor("#F7DC6F"));
            btn17.setBackgroundColor(Color.parseColor("#F7DC6F"));
        }
        if(winValue==6)
        {
            btn17.setBackgroundColor(Color.parseColor("#F7DC6F"));
            btn18.setBackgroundColor(Color.parseColor("#F7DC6F"));
        }
        if(winValue==7)
        {
            btn18.setBackgroundColor(Color.parseColor("#F7DC6F"));
            btn19.setBackgroundColor(Color.parseColor("#F7DC6F"));
        }
        if(winValue==8)
        {
            btn11.setBackgroundColor(Color.parseColor("#F7DC6F"));
            btn12.setBackgroundColor(Color.parseColor("#F7DC6F"));
        }


    }
    public void backgroundSetting1(int winValue)
    {
        if(winValue==0)
        {
            btn12.setBackgroundColor(Color.parseColor("#F7DC6F"));
            btn13.setBackgroundColor(Color.parseColor("#F7DC6F"));
        }
        if(winValue==1)
        {
            btn13.setBackgroundColor(Color.parseColor("#F7DC6F"));
            btn14.setBackgroundColor(Color.parseColor("#F7DC6F"));
        }
        if(winValue==2)
        {
            btn14.setBackgroundColor(Color.parseColor("#F7DC6F"));
            btn15.setBackgroundColor(Color.parseColor("#F7DC6F"));
        }
        if(winValue==3)
        {
            btn15.setBackgroundColor(Color.parseColor("#F7DC6F"));
            btn16.setBackgroundColor(Color.parseColor("#F7DC6F"));
        }
        if(winValue==4)
        {
            btn16.setBackgroundColor(Color.parseColor("#F7DC6F"));
            btn17.setBackgroundColor(Color.parseColor("#F7DC6F"));
        }
        if(winValue==5)
        {
            btn17.setBackgroundColor(Color.parseColor("#F7DC6F"));
            btn18.setBackgroundColor(Color.parseColor("#F7DC6F"));
        }
        if(winValue==6)
        {
            btn18.setBackgroundColor(Color.parseColor("#F7DC6F"));
            btn19.setBackgroundColor(Color.parseColor("#F7DC6F"));
        }
        if(winValue==7)
        {
            btn11.setBackgroundColor(Color.parseColor("#F7DC6F"));
            btn12.setBackgroundColor(Color.parseColor("#F7DC6F"));
        }
        if(winValue==8)
        {
            btn12.setBackgroundColor(Color.parseColor("#F7DC6F"));
            btn13.setBackgroundColor(Color.parseColor("#F7DC6F"));
        }


    }
    int count=45;
    public void swapping(int y)
    {

        if(y==0) {

            Object temp=btn1.getText();
            btn1.setText(btn2.getText());
            btn2.setText(temp+"");
            count--;
            swapRemaining.setText("Remaining swaps are " + count+"");
            checkCount(count);
        }
        if(y==1)
        {
            Object temp=btn2.getText();
            btn2.setText(btn3.getText());
            btn3.setText(temp+"");
            count--;
            swapRemaining.setText("Remaining swaps are " + count+"");
            checkCount(count);

        }
        if(y==2)
        {
            Object temp=btn3.getText();
            btn3.setText(btn4.getText());
            btn4.setText(temp+"");
            count--;
            swapRemaining.setText("Remaining swaps are " + count+"");
            checkCount(count);

        }
        if(y==3)
        {
            Object temp=btn4.getText();
            btn4.setText(btn5.getText());
            btn5.setText(temp+"");
            count--;
            swapRemaining.setText("Remaining swaps are " + count+"");
            checkCount(count);

        }
        if(y==4)
        {
            Object temp=btn5.getText();
            btn5.setText(btn6.getText());
            btn6.setText(temp+"");
            count--;
            swapRemaining.setText("Remaining swaps are " + count+"");
            checkCount(count);

        }
        if(y==5)
        {
            Object temp=btn6.getText();
            btn6.setText(btn7.getText());
            btn7.setText(temp+"");
            count--;
            swapRemaining.setText("Remaining swaps are " + count+"");
            checkCount(count);

        }
        if(y==6)
        {
            Object temp=btn7.getText();
            btn7.setText(btn8.getText());
            btn8.setText(temp+"");
            count--;
            swapRemaining.setText("Remaining swaps are " + count+"");
            checkCount(count);


        }
        if(y==7)
        {
            Object temp=btn8.getText();
            btn8.setText(btn9.getText());
            btn9.setText(temp+"");
            count--;
            swapRemaining.setText("Remaining swaps are " + count+"");
            checkCount(count);

        }

    }
    public void checkCount(int num)
    {
        if(num<=0)
        {

            result.setText("You Lost");
            result.setBackgroundColor(Color.parseColor("#FF0000"));


        }
        else
        {

            int num1 = Integer.parseInt(btn1.getText().toString());
            int num2 = Integer.parseInt(btn2.getText().toString());
            int num3 = Integer.parseInt(btn3.getText().toString());
            int num4 = Integer.parseInt(btn4.getText().toString());
            int num5 = Integer.parseInt(btn5.getText().toString());
            int num6 = Integer.parseInt(btn6.getText().toString());
            int num7 = Integer.parseInt(btn7.getText().toString());
            int num8 = Integer.parseInt(btn8.getText().toString());
            int num9 = Integer.parseInt(btn9.getText().toString());

            if(num1<=num2 && num2<=num3 && num3<=num4 && num4<=num5 && num5<=num6 && num6<=num7 && num7<=num8 && num8<=num9)
            {
                result.setText("won");
                result.setBackgroundColor(Color.parseColor("#00FF00"));

            }


        }
    }

    //Window
    public void removeBackground()
    {
        btn11.setBackgroundColor(Color.parseColor("#ABEBC6"));
        btn12.setBackgroundColor(Color.parseColor("#ABEBC6"));
        btn13.setBackgroundColor(Color.parseColor("#ABEBC6"));
        btn14.setBackgroundColor(Color.parseColor("#ABEBC6"));
        btn15.setBackgroundColor(Color.parseColor("#ABEBC6"));
        btn16.setBackgroundColor(Color.parseColor("#ABEBC6"));
        btn17.setBackgroundColor(Color.parseColor("#ABEBC6"));
        btn18.setBackgroundColor(Color.parseColor("#ABEBC6"));
        btn19.setBackgroundColor(Color.parseColor("#ABEBC6"));
    }
}

