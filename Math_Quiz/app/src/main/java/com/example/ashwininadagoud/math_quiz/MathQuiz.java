package com.example.ashwininadagoud.math_quiz;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MathQuiz {

    Button next, submit;
    EditText resultEditText;
    TextView firstNumTextView,secondNumTextView;
    TextView operator,result,score;
    int n1, n2, ans, val, resultingval, totalcount, anscount;
    Random r;

    String resultinganswer;
    public MathQuiz(MainActivity m)
    {
        totalcount = 1;
        r = new Random();

        next = (Button)m.findViewById(R.id.btnNext);
        submit = (Button)m.findViewById(R.id.btnSubmit);

        firstNumTextView=(TextView) m.findViewById(R.id.firstNum);
        secondNumTextView=(TextView) m.findViewById(R.id.secondNum);
        resultEditText=(EditText)m.findViewById(R.id.answer);

        operator =(TextView)m.findViewById(R.id.operator);
        result=(TextView)m.findViewById(R.id.result);
        score=(TextView)m.findViewById(R.id.score);

        processCalculate();

        next.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) //when next button is clicked next.setEnabled dies and submit.setEnabled is made alive
            {
                processCalculate();
                next.setEnabled(false);
                submit.setEnabled(true);
            }
        });

        submit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                resultinganswer=resultEditText.getText().toString();
                if(!resultinganswer.equalsIgnoreCase(""))  //error checking
                {
                    String op = operator.getText().toString();
                    if (op.trim() == "+")
                    {
                        ans = n1 + n2;

                        resultingval = Integer.parseInt(resultEditText.getText().toString());

                        if (ans == resultingval)
                        {
                            result.setTextColor(Color.rgb(0, 255, 0));
                            result.setText("Correct");
                            anscount++;
                        }
                        else
                            {
                            result.setTextColor(Color.rgb(255, 0, 0));
                            result.setText("Incorrect");
                        }
                    }

                    else if (op.trim() == "-")
                    {
                        ans = n1 - n2;
                        resultingval = Integer.parseInt(resultEditText.getText().toString());

                        if (ans == resultingval)
                        {
                            result.setTextColor(Color.rgb(0, 255, 0));
                            result.setText("Correct");
                            anscount++;
                        }
                        else
                            {
                            result.setTextColor(Color.rgb(255, 0, 0));
                            result.setText("Incorrect");
                        }
                    }

                    else if (op.trim() == "*")
                    {
                        ans = n1 * n2;
                        resultingval = Integer.parseInt(resultEditText.getText().toString());
                        if (ans == resultingval) {
                            result.setTextColor(Color.rgb(0, 255, 0));
                            result.setText("Correct");
                            anscount++;
                        }
                        else
                            {
                            result.setTextColor(Color.rgb(255, 0, 0));
                            result.setText("Incorrect");
                        }
                    }

                    else if (op.trim() == "/")
                    {
                        ans = n1 / n2;
                        resultingval = Integer.parseInt(resultEditText.getText().toString());

                        if (ans == resultingval)
                        {
                            result.setTextColor(Color.rgb(0, 255, 0));
                            result.setText("Correct");
                            anscount++;
                        }
                        else
                            {
                            result.setTextColor(Color.rgb(255, 0, 0));
                            result.setText("Incorrect");
                        }
                    }

                    score.setText("Score :" + anscount + "/" + totalcount);
                    totalcount++;
                    submit.setEnabled(false);   //when submit button is clicked submit.setEnabled dies and next.setEnabled is made alive
                    next.setEnabled(true);
                }
            }
        });
    }

    public void processCalculate()
    {
        val = r.nextInt(4);

        if(val==0)
        {
            operator.setText("+");
            n1 = r.nextInt(1000-1)+1;
            n2 = r.nextInt(1000-1)+1;
            firstNumTextView.setText(Integer.toString(n1));
            secondNumTextView.setText(Integer.toString(n2));
            resultEditText.setText("");
        }

        else if(val==1)
        {
            operator.setText("-");
            n1 = r.nextInt(1000-1)+1;
            n2 = r.nextInt(1000-1)+1;
            firstNumTextView.setText(Integer.toString(n1));
            secondNumTextView.setText(Integer.toString(n2));
            resultEditText.setText("");
        }

        else if(val==2)
        {
            operator.setText("*");
            n1 = r.nextInt(100-1)+1;
            n2 = r.nextInt(100-1)+1;
            firstNumTextView.setText(Integer.toString(n1));
            secondNumTextView.setText(Integer.toString(n2));
            resultEditText.setText("");
        }

        else if(val==3)
        {
            operator.setText("/");
            n1 = r.nextInt(1000-1)+1;
            n2 = r.nextInt(100-1)+1;
            firstNumTextView.setText(Integer.toString(n1));
            secondNumTextView.setText(Integer.toString(n2));
            resultEditText.setText("");
        }
    }
    }
