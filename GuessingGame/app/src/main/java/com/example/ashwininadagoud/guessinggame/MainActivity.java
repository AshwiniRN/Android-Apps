package com.example.ashwininadagoud.guessinggame;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText et_inputGuess;
    Button submit;
    TextView tv_result,guessRem;
    Random r;
    String ans, num;
    int correctGuess;
    int a, num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        correctGuess=7;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();//new random object

        //to access the inputGuess, submit button and the result
        et_inputGuess = (EditText)findViewById(R.id.inputGuess);
        submit = (Button)findViewById(R.id.submit);
        tv_result = (TextView)findViewById(R.id.result);
        guessRem = (TextView)findViewById(R.id.remGuess);
        process(); //The process method is called

        //on hitting the submit button
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ans = et_inputGuess.getText().toString();

                num1 = Integer.parseInt(ans); //num1 has the users answer
                num2 = Integer.parseInt(num); //num2 has therandom number

                //if num1 and num2 are equal
                if (ans.equals(num))
                {
                    tv_result.setText("Correct");
                    showDialogBox();

                    }
                    //if num1>num2
                else if (num1 > num2) {
                    tv_result.setText("Number " + ans + " is greater than Guess");
                    }
                    //if num1<num2
                else if (num1 < num2) {
                    tv_result.setText("Number " + ans + " is less than Guess"); }

                    else
                        {
                            tv_result.setText("wrong");
                        }

                        guessRem.setText("You have " + correctGuess + "" + " chances");
                        correctGuess--;

                        if (correctGuess < 0) {
                            showDialogBox();
                            }
            }
        });
    }

    public void process()
    {
        a = r.nextInt(100-1)+1; //to generate a random system number
        num = Integer.toString(a);
    }
    private void showDialogBox()
    {
        AlertDialog.Builder dialogBox = new AlertDialog.Builder(this);

        dialogBox.setMessage("Do you want to play the game again?"); //if the user wishes to try again

        //to display dialog box with yes, no or cancel
        DialogBoxListner temp = new DialogBoxListner();
        dialogBox.setPositiveButton("Yes", temp);
        dialogBox.setNegativeButton("No",temp);
        dialogBox.setNeutralButton("Cancel",temp);

        dialogBox.show();
    }

    private class DialogBoxListner implements DialogInterface.OnClickListener
    {
        public void onClick(DialogInterface dialog, int id)
        {
            //checks condition for yes, no or cancel options selected by the user
            if(id==-1)
            {
                et_inputGuess = (EditText)findViewById(R.id.inputGuess);
                et_inputGuess.setText("");
                onClear();
            }

            else if(id== -2)
            {
                MainActivity.this.finish(); //app is closed
            }
            else
            {
                et_inputGuess.setEnabled(false);
                submit.setEnabled(false);
            }
        }
    }

    //clears and generates a new random number
    public void onClear() {

        tv_result.setText("Waiting for answer");
        correctGuess = 7;
        a = r.nextInt(100-1)+1;
        num = Integer.toString(a);
        guessRem.setText("You have 8 chances");

    }
}

