package com.example.ashwininadagoud.sudoku;

import android.content.Context;
import android.graphics.Color;
import android.text.InputType;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.RelativeLayout;

public class AppInterface extends RelativeLayout {
    private int size;
    private EditText[][] editBox;
    private Button buttonNew, buttonSave, buttonResume;

    public AppInterface(Context context, int size, int width)
    {
        super(context);
        final int DP = (int) (getResources().getDisplayMetrics().density);
        this.size = size;
        editBox = new EditText[size][size];
        RelativeLayout.LayoutParams paramsRelative=new RelativeLayout.LayoutParams(0,0);
        GridLayout grid=new GridLayout(context);
        grid.setId(GridLayout.generateViewId());
        grid.setRowCount(9);
        grid.setColumnCount(9);
        paramsRelative.width=LayoutParams.WRAP_CONTENT;
        paramsRelative.height=LayoutParams.WRAP_CONTENT;
        grid.setLayoutParams(paramsRelative);
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                editBox[i][j]=new EditText(context);
                editBox[i][j].setBackgroundColor(Color.parseColor("#A4DFEE"));
                editBox[i][j].setTextSize((int)(width*0.2));
                editBox[i][j].setTextColor(Color.parseColor("#000000"));
                editBox[i][j].setInputType(InputType.TYPE_CLASS_NUMBER);
                editBox[i][j].setGravity(Gravity.CENTER);
                GridLayout.LayoutParams params=new GridLayout.LayoutParams();
                params.width=width;
                params.height=width;
                params.rowSpec = GridLayout.spec(i,1);
                params.columnSpec = GridLayout.spec(j,1);
                if(i==0)
                {
                    params.topMargin=30*DP;
                    params.bottomMargin=1;
                }
                else
                    params.topMargin = params.bottomMargin = 1;
                params.leftMargin = params.rightMargin = 1;
                editBox[i][j].setLayoutParams(params);
                grid.addView(editBox[i][j]);
                //addView(editBox[i][j]);
            }
        }
        addView(grid);

        RelativeLayout.LayoutParams paramsRelative1=new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        buttonNew=new Button(context);
        buttonNew.setText("New");
        buttonNew.setTextColor(Color.parseColor("#FFFFFF"));
        buttonNew.setBackgroundColor(Color.parseColor("#3F51B5"));
        buttonNew.setTextSize(TypedValue.COMPLEX_UNIT_SP,20);
        buttonNew.setPadding(10*DP,10*DP,10*DP,10*DP);
        buttonNew.setId(Button.generateViewId());
        paramsRelative1.addRule(RelativeLayout.BELOW,grid.getId());
        paramsRelative1.leftMargin=40*DP;
        paramsRelative1.topMargin=50*DP;
        buttonNew.setLayoutParams(paramsRelative1);
        addView(buttonNew);

        paramsRelative1=new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        buttonSave=new Button(context);
        buttonSave.setText("Save");
        buttonSave.setTextColor(Color.parseColor("#FFFFFF"));
        buttonSave.setBackgroundColor(Color.parseColor("#3F51B5"));
        buttonSave.setTextSize(TypedValue.COMPLEX_UNIT_SP,20);
        buttonSave.setPadding(10*DP,10*DP,10*DP,10*DP);
        buttonSave.setId(Button.generateViewId());
        paramsRelative1.leftMargin=40*DP;
        paramsRelative1.topMargin=50*DP;
        paramsRelative1.addRule(RelativeLayout.RIGHT_OF,buttonNew.getId());
        paramsRelative1.addRule(RelativeLayout.ALIGN_BOTTOM, buttonNew.getId());
        buttonSave.setLayoutParams(paramsRelative1);
        addView(buttonSave);

        paramsRelative1=new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        buttonResume=new Button(context);
        buttonResume.setText("Resume");
        buttonResume.setTextColor(Color.parseColor("#FFFFFF"));
        buttonResume.setBackgroundColor(Color.parseColor("#3F51B5"));
        buttonResume.setTextSize(TypedValue.COMPLEX_UNIT_SP,20);
        buttonResume.setPadding(10*DP,10*DP,10*DP,10*DP);
        buttonResume.setId(Button.generateViewId());
        paramsRelative1.leftMargin=40*DP;
        paramsRelative1.topMargin=50*DP;
        paramsRelative1.addRule(RelativeLayout.RIGHT_OF,buttonSave.getId());
        paramsRelative1.addRule(RelativeLayout.ALIGN_BOTTOM,buttonSave.getId());
        buttonResume.setLayoutParams(paramsRelative1);
        addView(buttonResume);

    }
    public int[][] drawInitialBoard()
    {
        Sudoku s=new Sudoku();
        int[][] nums=s.generate();
        for(int i=0;i<9;i++) {
            for (int j = 0; j < 9; j++) {
                if(nums[i][j]==0)
                    editBox[i][j].setText("");
                else {
                    editBox[i][j].setText(nums[i][j] + "");
                    editBox[i][j].setBackgroundColor(Color.parseColor("#A4C1EE"));
                    editBox[i][j].setEnabled(false);
                }
            }
        }
        return nums;
    }
    public void drawBoard(int[][] nums, int[][] initialNums)
    {
        for(int i=0;i<9;i++) {
            for (int j = 0; j < 9; j++) {
                if(nums[i][j]==0)
                    editBox[i][j].setText("");
                else if(nums[i][j]!=0 && initialNums[i][j]==0)
                    editBox[i][j].setText(nums[i][j]+"");
                else {
                    editBox[i][j].setText(nums[i][j] + "");
                    editBox[i][j].setBackgroundColor(Color.parseColor("#A4C1EE"));
                    editBox[i][j].setEnabled(false);
                }
            }
        }
    }
    public void setTextChangeHandler(TextWatcher temp, int i, int j)
    {
        editBox[i][j].addTextChangedListener(temp);
    }
    public void setText(int i, int j, int num){
        editBox[i][j].setText(num+"");
    }
    public void removeText(int i, int j){
        editBox[i][j].setText("");
    }
    public void setTextchangehandler(TextWatcher textwatcher, int x, int y){
        editBox[x][y].addTextChangedListener(textwatcher);
    }
    public void removeTextchangehandler(TextWatcher textwatcher, int x, int y){
        editBox[x][y].removeTextChangedListener(textwatcher);
    }
    public int getIdButtonNew()
    {
        return buttonNew.getId();
    }
    public int getIdButtonSave()
    {
        return buttonSave.getId();
    }
    public int getIdButtonResume()
    {
        return buttonResume.getId();
    }
}

