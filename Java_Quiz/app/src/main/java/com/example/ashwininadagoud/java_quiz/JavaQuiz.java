package com.example.ashwininadagoud.java_quiz;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class JavaQuiz {
    Button submit,next;
    TextView question,score,result;
    RadioButton option1,option2,option3,option4;
    RadioButton checkedRadioButton;
    int a,count,i,answercount=0,totalcount=1 ;
    String questions[]=new String[10];
    String options[][]=new String[10][4];
    String answer[]=new String[10];
    RadioGroup rbg;
    final MainActivity mfinal;
    boolean radioStatus=true;
    public JavaQuiz(MainActivity m)
    {
        mfinal=m;
        //questions
        questions[0] = "1. What is the range of short data type in Java?";
        questions[1] = "2. Which data type value is returned by all \ntranscendental math functions?";
        questions[2] = "3. An expression involving byte, int, and literal \nnumbers is promoted to which of these?";
        questions[3] = "4. What is the output of relational operators?";
        questions[4] = "5. Which of these operators can skip evaluating \nright hand operand?";
        questions[5] = "6. Generics does not work with?";
        questions[6] = "7. How to sort an array?";
        questions[7] = "8. An array elements are always stored in ________\nmemory locations?";
        questions[8] = "9. Which of these standard collection classes \nimplements a dynamic array?";
        questions[9] = "10. Which of these method is used to reduce the \ncapacity of an ArrayList object?";

        //options
        options[0][0] = "-128 to 127";
        options[0][1] = "-32768 to 32767";
        options[0][2] = "-2147483648 to 2147483647";
        options[0][3] = "None of the above";

        options[1][0] = "int";
        options[1][1] = "float";
        options[1][2] = "double";
        options[1][3] = "long";

        options[2][0] = "int";
        options[2][1] = "long";
        options[2][2] = "byte";
        options[2][3] = "float";

        options[3][0] = "Integer";
        options[3][1] = "Boolean";
        options[3][2] = "Characters";
        options[3][3] = "Double";

        options[4][0] = "!";
        options[4][1] = "|";
        options[4][2] = "&";
        options[4][3] = "&&";

        options[5][0] = "Set";
        options[5][1] = "List";
        options[5][2] = "Tree";
        options[5][3] = "Array";

        options[6][0] = "Array.sort()";
        options[6][1] = "Arrays.sort()";
        options[6][2] = "Collection.sort()";
        options[6][3] = "System.sort()";

        options[7][0] = "Sequential";
        options[7][1] = "Random";
        options[7][2] = "Sequential and Random";
        options[7][3] = "Binary Search";

        options[8][0] = "AbstractList";
        options[8][1] = "LinkedList";
        options[8][2] = "ArrayList";
        options[8][3] = "AbstractSet";

        options[9][0] = "trim()";
        options[9][1] = "trimSize()";
        options[9][2] = "trimTozise()";
        options[9][3] = "trimToSize()";

        // answer keys

        answer[0] = "-32768 to 32767";
        answer[1] = "double";
        answer[2] = "int";
        answer[3] = "Boolean";
        answer[4] = "&&";
        answer[5] = "Array";
        answer[6] = "Arrays.sort()";
        answer[7] = "Sequential";
        answer[8] = "ArrayList";
        answer[9] = "trimToSize()";



        submit=(Button)m.findViewById(R.id.btnSubmit);
        next=(Button)m.findViewById(R.id.btnNext);

        rbg=(RadioGroup)m.findViewById(R.id.radioAnswers);
        option1=(RadioButton)m.findViewById(R.id.option1);
        option2=(RadioButton)m.findViewById(R.id.option2);
        option3=(RadioButton)m.findViewById(R.id.option3);
        option4=(RadioButton)m.findViewById(R.id.option4);

        result=(TextView)m.findViewById(R.id.status);
        score=(TextView)m.findViewById(R.id.score);
        question=(TextView)m.findViewById(R.id.question);
        count=0;
        question.setText(questions[count]);
        option1.setText(options[count][0]);
        option2.setText(options[count][1]);
        option3.setText(options[count][2]);
        option4.setText(options[count][3]);
        a=count;
        count++;
        
        next.setEnabled(false);

        submit.setEnabled(false);

        //onclick event for next button

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count>=10)
                {
                    Context context = mfinal.getApplicationContext();  //set context
                    CharSequence text = "Quiz Completed!";   //set text
                    int duration = Toast.LENGTH_SHORT;  //set duration

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else {
                    nextQuestion();
                }
            }
        });

        //radiobutton change event

        rbg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup,  int checkedId) {

                checkedRadioButton = (RadioButton)mfinal.findViewById(checkedId);

                boolean isChecked = checkedRadioButton.isChecked();

                if (isChecked && radioStatus)
                {
                    submit.setEnabled(true);
                    radioStatus=false;
                }
            }
        });

        //onClick event for submit button

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submit.setEnabled(false); //submit button is inactive
                next.setEnabled(true);  //next button is active
                checkAnswer();

            }
        });
    }
    
    //to go on to next question or returns completion message if all the 10 questions are attempted
    public void nextQuestion()
    {
        question.setText(questions[count]);
        option1.setText(options[count][0]);
        option2.setText(options[count][1]);
        option3.setText(options[count][2]);
        option4.setText(options[count][3]);
        a = count;
        count++;

        next.setEnabled(false);

        onClear();
        radioStatus=true;

    }
    
    //checks answers for the respective question
    public void checkAnswer()
    {
        String getAnswer=checkedRadioButton.getText().toString();
        if(getAnswer.equalsIgnoreCase(answer[a]))
        {
            result.setTextColor(Color.rgb(0,255,0));
            result.setText("Correct");
            answercount++;
        }
        else
        {
            result.setTextColor(Color.rgb(255,0,0));
            result.setText("Incorrect");
        }
        score.setText("Score :"+answercount+"/"+totalcount);
        totalcount++;
    }
    
    //clears the selected radio buttons to default
    public void onClear() {

        rbg.setOnCheckedChangeListener(null);
        rbg.clearCheck();

        rbg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup,  int checkedId) {
                checkedRadioButton = (RadioButton)mfinal.findViewById(checkedId);
                boolean isChecked = checkedRadioButton.isChecked();
                if (isChecked && radioStatus)
                {
                    submit.setEnabled(true);
                    radioStatus=false;
                }
            }
        });

    }

}
