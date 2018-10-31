package com.example.ashwininadagoud.slidingpuzzle;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.RelativeLayout;

public class AppInterface extends RelativeLayout {

    public static Button[][] user_board; //user board
    public static Button[][] result_board; //Result board
    public static Button west, east, north, south;

    public AppInterface(Context context) {
        super(context);

        final int DP = (int) (getResources().getDisplayMetrics().density);

        RelativeLayout.LayoutParams paramsRelative = new RelativeLayout.LayoutParams(0, 0);

        //to create user board grid layout and inserting 3*3 matrix
        GridLayout gridOne = new GridLayout(context);
        gridOne.setColumnCount(3);
        gridOne.setRowCount(3);
        paramsRelative.width = LayoutParams.WRAP_CONTENT;
        paramsRelative.height = LayoutParams.WRAP_CONTENT;
        gridOne.setLayoutParams(paramsRelative);
        paramsRelative.leftMargin = 110 * DP;
        paramsRelative.topMargin = 50 * DP;

        user_board = new Button[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                user_board[i][j] = new Button(context);
                user_board[i][j].setTextColor(Color.BLACK);
                user_board[i][j].setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
                user_board[i][j].setGravity(Gravity.CENTER);
                user_board[i][j].setBackgroundColor(Color.parseColor("#A9A9A9"));
                GridLayout.LayoutParams params = new GridLayout.LayoutParams();
                params.setGravity(Gravity.CENTER);
                params.width = 100 * DP;
                params.height = 70 * DP;
                params.rowSpec = GridLayout.spec(i, 1);
                params.columnSpec = GridLayout.spec(j, 1);
                params.topMargin = params.bottomMargin = 2;
                params.leftMargin = params.rightMargin = 2;
                user_board[i][j].setLayoutParams(params);
                gridOne.addView(user_board[i][j]);
            }
        addView(gridOne);

        RelativeLayout.LayoutParams paramsRelative1 = new RelativeLayout.LayoutParams(0, 0);
        //to create result board second grid layout and inserting 3*3 matrix
        GridLayout gridTwo = new GridLayout(context);
        gridTwo.setColumnCount(3);
        gridTwo.setRowCount(3);
        paramsRelative1.width = LayoutParams.WRAP_CONTENT;
        paramsRelative1.height = LayoutParams.WRAP_CONTENT;
        gridTwo.setLayoutParams(paramsRelative1);
        paramsRelative1.leftMargin = 110 * DP;
        paramsRelative1.topMargin = 350 * DP;
        gridTwo.setLayoutParams(paramsRelative1);

        result_board = new Button[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                result_board[i][j] = new Button(context);
                result_board[i][j].setTextColor(Color.BLACK);
                result_board[i][j].setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
                result_board[i][j].setGravity(Gravity.CENTER);
                result_board[i][j].setBackgroundColor(Color.parseColor("#A3E4D7"));
                GridLayout.LayoutParams params = new GridLayout.LayoutParams();
                params.width = 100 * DP;
                params.height = 70 * DP;
                params.rowSpec = GridLayout.spec(i, 1);
                params.columnSpec = GridLayout.spec(j, 1);
                params.topMargin = params.bottomMargin = 2;
                params.leftMargin = params.rightMargin = 2;
                result_board[i][j].setLayoutParams(params);
                gridTwo.addView(result_board[i][j]);
            }
        addView(gridTwo);

        //Button to move west
        west = new Button(context);
        west.setTextColor(Color.BLACK);
        west.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15);
        west.setGravity(Gravity.CENTER);
        west.setText("West");
        RelativeLayout.LayoutParams paramsRel = new RelativeLayout.LayoutParams(0, 0);
        paramsRel.width = 100 * DP;
        paramsRel.height = 70 * DP;
        paramsRel.topMargin = 650* DP;
        paramsRel.leftMargin = 275*DP;
        paramsRel.rightMargin = 1;
        west.setLayoutParams(paramsRel);
        addView(west);

        //button to move right
        east = new Button(context);
        east.setTextColor(Color.BLACK);
        east.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15);
        east.setGravity(Gravity.CENTER);
        east.setText("East");
        paramsRel = new RelativeLayout.LayoutParams(0, 0);
        paramsRel.width = 100 * DP;
        paramsRel.height = 70 * DP;
        paramsRel.topMargin = 650 * DP;
        paramsRel.leftMargin = 400 *DP;
        paramsRel.rightMargin = 1;
        east.setLayoutParams(paramsRel);
        addView(east);

        //button to move north
        north = new Button(context);
        north.setTextColor(Color.BLACK);
        north.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15);
        north.setGravity(Gravity.CENTER);
        north.setText("North");
        paramsRel = new RelativeLayout.LayoutParams(0,0);
        paramsRel.width = 100 * DP;
        paramsRel.height = 70 * DP;
        paramsRel.topMargin = 650 * DP;
        paramsRel.leftMargin = 20 * DP;
        paramsRel.rightMargin = 1;
        north.setLayoutParams(paramsRel);
        addView(north);

        //button to move south
        south = new Button(context);
        south.setTextColor(Color.BLACK);
        south.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15);
        south.setGravity(Gravity.CENTER);
        south.setText("South");
        paramsRel = new RelativeLayout.LayoutParams(0 ,0);
        paramsRel.width = 100 * DP;
        paramsRel.height = 70 * DP;
        paramsRel.topMargin = 650 * DP;
        paramsRel.leftMargin = 145 * DP;
        paramsRel.rightMargin = 1;
        south.setLayoutParams(paramsRel);
        addView(south);

    }
}
