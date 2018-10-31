package com.example.ashwininadagoud.sudokugame;

import android.content.Context;
import android.graphics.Color;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.TextView;

public class AppInterface extends GridLayout
{
    private int size;
    private EditText[][] board;
    private TextView status;
    int a=0;

    public AppInterface(Context context, int size, int width)
    {
        super(context);

        this.size = size;
        setRowCount(size + 1);
        setColumnCount(size);

        //to create a grid of 9*9
        board= new EditText[size][size];
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++) {
                board[i][j] = new EditText(context);
                board[i][j].setBackgroundColor(Color.parseColor("#F9E79F"));
                board[i][j].setTextColor(Color.BLACK);
                board[i][j].setTextSize((int) (width * 0.2));
                board[i][j].setGravity(Gravity.CENTER);
                if(Game.board[i][j]==0)
                    board[i][j].setText("");
                else {
                    board[i][j].setText(Integer.toString(Game.board[i][j]));
                    board[i][j].setEnabled(false);
                }
                GridLayout.LayoutParams params = new GridLayout.LayoutParams();
                params.width = width;
                params.height = width;
                params.rowSpec = GridLayout.spec(i, 1);
                params.columnSpec = GridLayout.spec(j, 1);
                params.topMargin = params.bottomMargin = 1;
                params.leftMargin = params.rightMargin = 1;
                board[i][j].setLayoutParams(params);
                addView(board[i][j]);
            }


        //TextView to display status
        status = new TextView(context);
        status.setBackgroundColor(Color.parseColor("#7FB3D5"));
        status.setTextColor(Color.BLACK);
        status.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
        status.setGravity(Gravity.CENTER);
        GridLayout.LayoutParams params = new GridLayout.LayoutParams();
        params.width = width*size;
        params.height = width;
        params.rowSpec = GridLayout.spec(size, 1);
        params.columnSpec = GridLayout.spec(0, size);
        status.setLayoutParams(params);
        addView(status);

    }
    public void setTextChangeHandler(TextWatcher temp, int i, int j)
    {
        board[i][j].addTextChangedListener(temp);
    }



}


