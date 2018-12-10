package com.example.ashwininadagoud.sorting;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.RelativeLayout;

public class AppInterface extends RelativeLayout {

    public static Button[] array;
    public static Button swapRemaining,result;

    public AppInterface(Context context) {
        super(context);

        final int DP = (int) (getResources().getDisplayMetrics().density);

        //Grid layout is nested into a relative layout
        RelativeLayout.LayoutParams paramsRelative = new RelativeLayout.LayoutParams(0, 0);

        GridLayout gridOne = new GridLayout(context);
        gridOne.setColumnCount(1);
        gridOne.setRowCount(10);
        paramsRelative.width = LayoutParams.WRAP_CONTENT;
        paramsRelative.height = LayoutParams.WRAP_CONTENT;
        gridOne.setLayoutParams(paramsRelative);
        paramsRelative.topMargin = 30 * DP;
        paramsRelative.addRule(CENTER_HORIZONTAL);

        //To create the array of buttons to hold random numbers
        array = new Button[10];
        for (int i = 0; i < 9; i++)
        {
            array[i] = new Button(context);
            array[i].setTextColor(Color.BLACK);
            array[i].setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
            array[i].setGravity(Gravity.CENTER);
            array[i].setBackgroundColor(Color.parseColor("#ABEBC6"));
            GridLayout.LayoutParams params = new GridLayout.LayoutParams();
            params.setGravity(Gravity.CENTER);
            params.width = 120 * DP;
            params.height = 60 * DP;
            params.rowSpec = GridLayout.spec(i, 1);
            params.columnSpec = GridLayout.spec(0, 1);
            params.topMargin = params.bottomMargin = 2;
            params.leftMargin = params.rightMargin = 2;
            array[i].setLayoutParams(params);
            gridOne.addView(array[i]);
        }
        addView(gridOne);

        //To display the number of swaps remaining
        swapRemaining = new Button(context);
        swapRemaining.setTextColor(Color.BLACK);
        swapRemaining.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        swapRemaining.setGravity(Gravity.CENTER);
        swapRemaining.setText("Total swaps: 45");
        RelativeLayout.LayoutParams paramsRel2 = new RelativeLayout.LayoutParams(0, 0);
        paramsRel2.width = LayoutParams.WRAP_CONTENT;
        paramsRel2.height = LayoutParams.WRAP_CONTENT;
        paramsRel2.addRule(CENTER_HORIZONTAL);
        paramsRel2.topMargin = 600* DP;
        paramsRel2.bottomMargin = 1;
        paramsRel2.rightMargin = 1;
        swapRemaining.setLayoutParams(paramsRel2);
        addView(swapRemaining);

        result = new Button(context);
        result.setTextColor(Color.BLACK);
        result.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        result.setGravity(Gravity.CENTER);
        result.setText("Result");
        result.setBackgroundColor(Color.parseColor("#FFFFFF"));
        RelativeLayout.LayoutParams paramsRe3 = new RelativeLayout.LayoutParams(0, 0);
        paramsRe3.width = LayoutParams.WRAP_CONTENT;
        paramsRe3.height = LayoutParams.WRAP_CONTENT;
        paramsRe3.topMargin = 680* DP;
        paramsRe3.bottomMargin = 1;
        paramsRe3.addRule(CENTER_HORIZONTAL);
        paramsRe3.rightMargin = 1;
        result.setLayoutParams(paramsRe3);
        addView(result);
    }
}
