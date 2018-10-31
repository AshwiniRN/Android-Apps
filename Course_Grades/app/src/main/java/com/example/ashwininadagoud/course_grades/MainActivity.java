package com.example.ashwininadagoud.course_grades;


import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.calculate); // to access the button
        ButtonHandler temp = new ButtonHandler();  // to create an object for ButtonHandler
        button.setOnClickListener(temp); // to attach the ButtonHandler object to the button calculate
    }

    private class ButtonHandler implements View.OnClickListener {

        float assignment;
        float midterm;
        float finals;
        TextView tv_finalScore;
        TextView tv_grades;

        public void onClick(View v) {
            // to access the input given by user for assignments score
            EditText assignmentEditText = (EditText) findViewById(R.id.inputAssignment);
            String assignmentString = assignmentEditText.getText().toString();

            // to access the input given by user for midterm score
            EditText midTermEditText = (EditText) findViewById(R.id.inputMidTerm);
            String midTermString = midTermEditText.getText().toString();

            // to access input given by user for final exam score
            EditText finalExamEditText = (EditText) findViewById(R.id.inputFinalExam);
            String finalExamString = finalExamEditText.getText().toString();


            if(assignmentString.equals("")) //if the given input is null
            {
                assignment=-1;
                displayErrorEmptyAssignment(); //display error

            }
            else if(assignmentString.equals(".")) //if the given input is . operator
            {
                assignment=-1;
                displayErrorDotAssignment(); //display error

            }
            else
            {
                //if given input exceeds the range
                assignment = Float.parseFloat(assignmentString);

                if (assignment > 200) {
                    assignment=-1;
                    displayErrorRangeAssignment(); //display error

                }
            }


            if(midTermString.equals("")) //if the given input is null
            {
                midterm=-1;
                displayErrorEmptyMidTerm(); //display error
            }
            else
            if(midTermString.equals(".")) //if the given input is . operator
            {
                midterm=-1;
                displayErrorDotMidTerm(); //display error
            }
            else
            {
                //if the given input exceeds the range
                midterm = Float.parseFloat(midTermString);
                if(midterm>100)
                {
                    midterm=-1;
                    displayErrorRangeMidterm(); //display error
                }
            }


            if(finalExamString.equals("")) //if the given input is null
            {
                finals=-1;
                displayErrorEmptyFinal(); //display error
            }
            else if(finalExamString.equals(".")) //if the given input is . operator
            {
                finals=-1;
                displayErrorDotFinal(); //display error
            }
            else {
                //if the given input exceeds the range
                finals = Float.parseFloat(finalExamString);
                if (finals > 100)
                {
                    finals=-1;
                    displayErrorRangeFinal(); //display error
                }
            }

            // to create an object for ScoreCalculator
            ScoreCalculator score = new ScoreCalculator();

            score.setValues(assignment, midterm, finals);
            float scoreFloat = score.get();

            //if the final score is equal or greater than zero
            if(scoreFloat>=0)
            {
                tv_finalScore = (TextView) findViewById(R.id.outputFinalScore);
                tv_finalScore.setText(scoreFloat + "");

                String grade = score.getGrade();
                tv_grades = (TextView) findViewById(R.id.outputLetterGrade);
                tv_grades.setText(grade);

            }

            //if the final score is less than zero
            else
            {
                tv_finalScore = (TextView) findViewById(R.id.outputFinalScore);
                tv_finalScore.setText("");

                String grade = score.getGrade();
                tv_grades = (TextView) findViewById(R.id.outputLetterGrade);
                tv_grades.setText("");
            }


        }

        //Error message if assignments input is null
        private void displayErrorEmptyAssignment()
        {
            Context context = getApplicationContext();
            String message = "Please enter the Input for assignments";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, message, duration);

            toast.show();
        }
        //Error message if midterm input is null
        private void displayErrorEmptyMidTerm()
        {
            Context context = getApplicationContext();
            String message = "Please enter the Input for midterm exam";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, message, duration);

            toast.show();
        }
        //Error message if final exam input is null
        private void displayErrorEmptyFinal()
        {
            Context context = getApplicationContext();
            String message = "Please enter the Input for final exam";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, message, duration);

            toast.show();
        }

        //Error message if assignments input is . operator
        private void displayErrorDotAssignment()
        {
            Context context = getApplicationContext();
            String message = "Invalid Input found . operator for assignments";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, message, duration);

            toast.show();
        }

        //Error message if  midterm input is . operator for
        private void displayErrorDotMidTerm()
        {
            Context context = getApplicationContext();
            String message = "Invalid Input found . operator for midterm exam";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, message, duration);

            toast.show();
        }

        //Error message if final exam input is . operator
        private void displayErrorDotFinal()
        {
            Context context = getApplicationContext();
            String message = "Invalid Input found . operator for final exam";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, message, duration);

            toast.show();
        }

        //Error message if assignments input exceeds the given range
        private void displayErrorRangeAssignment()
        {
            Context context = getApplicationContext();
            String message = "Assignment score range exceeded";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, message, duration);

            toast.show();
        }

        //Error message if midterm input exceeds the given range
        private void displayErrorRangeMidterm()
        {
            Context context = getApplicationContext();
            String message = "Midterm score range exceeded";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, message, duration);

            toast.show();
        }

        //Error message if final exam input exceeds the given range
        private void displayErrorRangeFinal()
        {
            Context context = getApplicationContext();
            String message = "Finals score range exceeded";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, message, duration);

            toast.show();
        }

    }
}
