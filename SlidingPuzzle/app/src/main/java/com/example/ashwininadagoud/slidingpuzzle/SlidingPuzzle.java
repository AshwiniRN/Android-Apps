package com.example.ashwininadagoud.slidingpuzzle;

import static com.example.ashwininadagoud.slidingpuzzle.AppInterface.*;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.util.Random;

public class SlidingPuzzle {
    AppInterface appInterface;
    Context context;
    Button btn_ub1,btn_ub2,btn_ub3,btn_ub4,btn_ub5,btn_ub6,btn_ub7,btn_ub8,btn_ub9;
    Button btn_fb1,btn_fb2,btn_fb3,btn_fb4,btn_fb5,btn_fb6,btn_fb7,btn_fb8,btn_fb9;
    Button west,east,north,south;

    public SlidingPuzzle(Context context) {
        appInterface = new AppInterface(context);
        this.context=context;
        //upper part of the game(1st 3*3 matrix)
        btn_ub1=user_board[0][0];
        btn_ub2=user_board[0][1];
        btn_ub3=user_board[0][2];
        btn_ub4=user_board[1][0];
        btn_ub5=user_board[1][1];
        btn_ub6=user_board[1][2];
        btn_ub7=user_board[2][0];
        btn_ub8=user_board[2][1];
        btn_ub9=user_board[2][2];
        setValues1();

        //lower part of the game(2nd 3*3 matrix)
        btn_fb1=result_board[0][0];
        btn_fb2=result_board[0][1];
        btn_fb3=result_board[0][2];
        btn_fb4=result_board[1][0];
        btn_fb5=result_board[1][1];
        btn_fb6=result_board[1][2];
        btn_fb7=result_board[2][0];
        btn_fb8=result_board[2][1];
        btn_fb9=result_board[2][2];
        setValues2();

        west=AppInterface.west; //left button
        east=AppInterface.east; //right button
        north=AppInterface.north; //top button
        south=AppInterface.south; //bottom button


        //if left button is pressed
        west.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //checks condition to move b2,b5,b8 position and calls checkButton function
                if(verifyButton(btn_ub2,btn_ub5,btn_ub8)) {
                    checkButton(btn_ub2, btn_ub1);
                    checkButton(btn_ub5, btn_ub4);
                    checkButton(btn_ub8, btn_ub7);
                    checkGameOver();
                }
                //if above condition fails it checks b3,b6,b9 position and calls checkButton function
                else if(verifyButton(btn_ub3,btn_ub6,btn_ub9)) {
                    checkButton(btn_ub3, btn_ub2);
                    checkButton(btn_ub6, btn_ub5);
                    checkButton(btn_ub9, btn_ub8);
                    checkGameOver();
                }
            }
        });


        //if right button is pressed
        east.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //checks condition to move b1,b4,b7 position and calls checkButton function
                if(verifyButton(btn_ub1,btn_ub4,btn_ub7)) {
                    checkButton(btn_ub1, btn_ub2);
                    checkButton(btn_ub4, btn_ub5);
                    checkButton(btn_ub7, btn_ub8);
                    checkGameOver();
                }
                //if above condition fails it checks b2,b5,b8 position and calls checkButton function
                else if(verifyButton(btn_ub2,btn_ub5,btn_ub8)) {
                    checkButton(btn_ub2, btn_ub3);
                    checkButton(btn_ub5, btn_ub6);
                    checkButton(btn_ub8, btn_ub9);
                    checkGameOver();
                }
            }
        });

        //if bottom button is pressed
        south.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //checks condition to move b1,b2,b3 position and calls checkButton function
                if(verifyButton(btn_ub1,btn_ub2,btn_ub3)) {
                    checkButton(btn_ub1, btn_ub4);
                    checkButton(btn_ub2, btn_ub5);
                    checkButton(btn_ub3, btn_ub6);
                    checkGameOver();
                }
                //if above condition fails it checks b4,b5,b6 position and calls checkButton function
                else if(verifyButton(btn_ub4,btn_ub5,btn_ub6)) {
                    checkButton(btn_ub4, btn_ub7);
                    checkButton(btn_ub5, btn_ub8);
                    checkButton(btn_ub6, btn_ub9);
                    checkGameOver();
                }
            }
        });

        // //if top button is pressed
        north.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //checks condition to move b7,b8,b9 position and calls checkButton function
                if(verifyButton(btn_ub7,btn_ub8,btn_ub9)) {
                    checkButton(btn_ub7, btn_ub4);
                    checkButton(btn_ub8, btn_ub5);
                    checkButton(btn_ub9, btn_ub6);
                    checkGameOver();
                }
                //if above condition fails it checks b4,b5,b6 position and calls checkButton function
                else if(verifyButton(btn_ub4,btn_ub5,btn_ub6)) {
                    checkButton(btn_ub4, btn_ub1);
                    checkButton(btn_ub5, btn_ub2);
                    checkButton(btn_ub6, btn_ub3);
                    checkGameOver();
                }
            }
        });

    }
    public AppInterface getAppInterface()
    {
        return appInterface;
    }
    public void setValues1()
    //sets the values for the first grid buttons
    {
        generateRandomValues();
        btn_ub1.setText(s[0]);
        btn_ub2.setText(s[1]);
        btn_ub3.setText(s[2]);
        btn_ub4.setText(s[3]);
        btn_ub5.setText(s[4]);
        btn_ub6.setText(s[5]);
        btn_ub7.setText(s[6]);
        btn_ub8.setText(s[7]);
        btn_ub9.setText(s[8]);

    }

    public void setValues2()
    //sets the values for the second grid buttons
    {
        generateRandomValues();
        btn_fb1.setText(s[0]);
        btn_fb2.setText(s[1]);
        btn_fb3.setText(s[2]);
        btn_fb4.setText(s[3]);
        btn_fb5.setText(s[4]);
        btn_fb6.setText(s[5]);
        btn_fb7.setText(s[6]);
        btn_fb8.setText(s[7]);
        btn_fb9.setText(s[8]);

    }

    int a[]=new int[9];
    String s[]=new String[9];
    int i,j,k;
    Random r=new Random();
    boolean status=false;

    //to generate random numbers
    public void generateRandomValues()
    {
        a[0]=r.nextInt(9);
        for(i=1;i<9;)
        {
            k=r.nextInt(9);
            for(j=0;j<i;j++)
            {
                if(a[j]==k)
                {
                    status=true;
                    break;
                }
            }
            if(status)
            {
                status=false;
            }else
            {
                a[i]=k;
                i++;
            }
        }
        for(i=0;i<9;i++)
        {
            if(a[i]==0)
                s[i]="";
            else
                s[i]=Integer.toString(a[i]);

        }

    }

    //checkButton function
    public void checkButton(Button x,Button y)
    {
        if(x.getText()=="")
        {
            x.setText(y.getText());
            y.setText("");
        }

    }

    //verifyButton to check empty element
    public boolean verifyButton(Button ob1,Button ob2,Button ob3)
    {
        if(ob1.getText().equals("")||ob2.getText().equals("")|| ob3.getText().equals(""))
        {
            return true;
        }
        else
            return false;
    }

    //it compares all buttons from 1st grid with 2nd grid
    public void checkGameOver()
    {
        CharSequence text = "U Won The Game!";
        int duration = Toast.LENGTH_LONG;


        if(btn_ub1.getText()==btn_fb1.getText()&& btn_ub2.getText()==btn_fb2.getText() && btn_ub3.getText()==btn_fb3.getText() && btn_ub4.getText()==btn_fb4.getText() && btn_ub5.getText()==btn_fb5.getText()&& btn_ub6.getText()== btn_fb6.getText() && btn_ub7.getText()==btn_fb7.getText()&& btn_ub8.getText()==btn_fb8.getText()&& btn_ub9.getText()==btn_fb9.getText())
        {
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            showAlert();
        }
    }

    //if game is completed a dialogbox will appear
    public void showAlert()
    {
        DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which){
                    case DialogInterface.BUTTON_POSITIVE:
                        resetGame();
                        break;

                    case DialogInterface.BUTTON_NEGATIVE:
                        disableButtons();
                        break;
                }
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage("To Reset the Game Click on Yes?").setPositiveButton("Yes", dialogClickListener).setNegativeButton("No", dialogClickListener).show();
    }

    //reset whole game
    public void resetGame()
    {
        setValues1();
        setValues2();
    }

    // to disable the movement buttons
    public  void disableButtons()
    {
        west.setEnabled(false);
        east.setEnabled(false);
        north.setEnabled(false);
        south.setEnabled(false);
    }
}

