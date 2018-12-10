package com.example.ashwininadagoud.sliding_puzzle;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class AppInterface extends RelativeLayout {

    private TextView box1,box2,box3,box4,box5,box6,box7,box8,box9;

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public AppInterface(Context context, int screenHeight, int screenWidth)
    {
        super(context);
        int height=screenHeight/3;
        int width=screenWidth/3;


        box1 = new TextView(context);
        box1.setId(TextView.generateViewId());
        box1.setBackgroundColor(Color.parseColor("#D2B4DE"));
        box1.setTextColor(Color.BLACK);
        box1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
        box1.setGravity(Gravity.CENTER);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(0, 0);
        params.width=width;
        params.height=height;
        params.topMargin=5;
        params.leftMargin=5;
        params.rightMargin=5;
        params.bottomMargin=5;
        box1.setLayoutParams(params);
        addView(box1);

        box2 = new TextView(context);
        box2.setId(TextView.generateViewId());
        box2.setBackgroundColor(Color.parseColor("#D2B4DE"));
        box2.setTextColor(Color.BLACK);
        box2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
        box2.setGravity(Gravity.CENTER);
        RelativeLayout.LayoutParams params1 = new RelativeLayout.LayoutParams(0, 0);
        params1.addRule(RelativeLayout.RIGHT_OF, box1.getId());
        params1.addRule(RelativeLayout.ALIGN_BOTTOM, box1.getId());
        params1.width=width;
        params1.height=height;
        params1.topMargin=5;
        params1.leftMargin=5;
        params1.rightMargin=5;
        params1.bottomMargin=5;
        box2.setLayoutParams(params1);
        addView(box2);

        box3 = new TextView(context);
        box3.setId(TextView.generateViewId());
        box3.setBackgroundColor(Color.parseColor("#D2B4DE"));
        box3.setTextColor(Color.BLACK);
        box3.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
        box3.setGravity(Gravity.CENTER);
        RelativeLayout.LayoutParams params2 = new RelativeLayout.LayoutParams(0, 0);
        params2.addRule(RelativeLayout.RIGHT_OF, box2.getId());
        params2.addRule(RelativeLayout.ALIGN_BOTTOM, box2.getId());
        params2.width=width;
        params2.height=height;
        params2.topMargin=5;
        params2.leftMargin=5;
        params2.rightMargin=5;
        params2.bottomMargin=5;
        box3.setLayoutParams(params2);
        addView(box3);

        box4 = new TextView(context);
        box4.setId(TextView.generateViewId());
        box4.setBackgroundColor(Color.parseColor("#D2B4DE"));
        box4.setTextColor(Color.BLACK);
        box4.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
        box4.setGravity(Gravity.CENTER);
        RelativeLayout.LayoutParams params3 = new RelativeLayout.LayoutParams(0, 0);
        params3.addRule(RelativeLayout.BELOW, box1.getId());
        params3.addRule(RelativeLayout.ALIGN_LEFT, box1.getId());
        params3.width=width;
        params3.height=height;
        params3.topMargin=5;
        params3.leftMargin=5;
        params3.rightMargin=5;
        params3.bottomMargin=5;
        box4.setLayoutParams(params3);
        addView(box4);

        box5 = new TextView(context);
        box5.setId(TextView.generateViewId());
        box5.setBackgroundColor(Color.parseColor("#D2B4DE"));
        box5.setTextColor(Color.BLACK);
        box5.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
        box5.setGravity(Gravity.CENTER);
        RelativeLayout.LayoutParams params4 = new RelativeLayout.LayoutParams(0, 0);
        params4.addRule(RelativeLayout.RIGHT_OF, box4.getId());
        params4.addRule(RelativeLayout.ALIGN_BOTTOM, box4.getId());
        params4.width=width;
        params4.height=height;
        params4.topMargin=5;
        params4.leftMargin=5;
        params4.rightMargin=5;
        params4.bottomMargin=5;
        box5.setLayoutParams(params4);
        addView(box5);

        box6 = new TextView(context);
        box6.setId(TextView.generateViewId());
        box6.setBackgroundColor(Color.parseColor("#D2B4DE"));
        box6.setTextColor(Color.BLACK);
        box6.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
        box6.setGravity(Gravity.CENTER);
        RelativeLayout.LayoutParams params5 = new RelativeLayout.LayoutParams(0, 0);
        params5.addRule(RelativeLayout.RIGHT_OF, box5.getId());
        params5.addRule(RelativeLayout.ALIGN_BOTTOM, box5.getId());
        params5.width=width;
        params5.height=height;
        params5.topMargin=5;
        params5.leftMargin=5;
        params5.rightMargin=5;
        params5.bottomMargin=5;
        box6.setLayoutParams(params5);
        addView(box6);

        box7 = new TextView(context);
        box7.setId(TextView.generateViewId());
        box7.setBackgroundColor(Color.parseColor("#D2B4DE"));
        box7.setTextColor(Color.BLACK);
        box7.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
        box7.setGravity(Gravity.CENTER);
        RelativeLayout.LayoutParams params6 = new RelativeLayout.LayoutParams(0, 0);
        params6.addRule(RelativeLayout.BELOW, box4.getId());
        params6.addRule(RelativeLayout.ALIGN_LEFT, box4.getId());
        params6.width=width;
        params6.height=height;
        params6.topMargin=5;
        params6.leftMargin=5;
        params6.rightMargin=5;
        params6.bottomMargin=5;
        box7.setLayoutParams(params6);
        addView(box7);

        box8 = new TextView(context);
        box8.setId(TextView.generateViewId());
        box8.setBackgroundColor(Color.parseColor("#D2B4DE"));
        box8.setTextColor(Color.BLACK);
        box8.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
        box8.setGravity(Gravity.CENTER);
        RelativeLayout.LayoutParams params7 = new RelativeLayout.LayoutParams(0, 0);
        params7.addRule(RelativeLayout.RIGHT_OF, box7.getId());
        params7.addRule(RelativeLayout.ALIGN_BOTTOM, box7.getId());
        params7.width=width;
        params7.height=height;
        params7.topMargin=5;
        params7.leftMargin=5;
        params7.rightMargin=5;
        params7.bottomMargin=5;
        box8.setLayoutParams(params7);
        addView(box8);

        box9 = new TextView(context);
        box9.setId(TextView.generateViewId());
        box9.setBackgroundColor(Color.parseColor("#D2B4DE"));
        box9.setTextColor(Color.BLACK);
        box9.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
        box9.setGravity(Gravity.CENTER);
        RelativeLayout.LayoutParams params8 = new RelativeLayout.LayoutParams(0, 0);
        params8.addRule(RelativeLayout.RIGHT_OF, box8.getId());
        params8.addRule(RelativeLayout.ALIGN_BOTTOM, box8.getId());
        params8.width=width;
        params8.height=height;
        params8.topMargin=5;
        params8.leftMargin=5;
        params8.rightMargin=5;
        params8.bottomMargin=5;
        box9.setLayoutParams(params8);
        addView(box9);
    }

    public void showCurrent(String[] current)
    {
        box1.setText(current[0]);
        box2.setText(current[1]);
        box3.setText(current[2]);
        box4.setText(current[3]);
        box5.setText(current[4]);
        box6.setText(current[5]);
        box7.setText(current[6]);
        box8.setText(current[7]);
        box9.setText(current[8]);

    }
    public void stop()
    {

        box1.setBackgroundColor(Color.parseColor("#990000"));
        box2.setBackgroundColor(Color.parseColor("#990000"));
        box3.setBackgroundColor(Color.parseColor("#990000"));
        box4.setBackgroundColor(Color.parseColor("#990000"));
        box5.setBackgroundColor(Color.parseColor("#990000"));
        box6.setBackgroundColor(Color.parseColor("#990000"));
        box7.setBackgroundColor(Color.parseColor("#990000"));
        box8.setBackgroundColor(Color.parseColor("#990000"));
        box9.setBackgroundColor(Color.parseColor("#990000"));
    }
}


