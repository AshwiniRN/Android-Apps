package com.example.ashwininadagoud.statsanalysis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //to create the ButtonHandlers with respect to all the buttons
        Button sum = (Button) findViewById(R.id.sum);
        ButtonHandler temp = new ButtonHandler();
        sum.setOnClickListener(temp);

        Button mean = (Button) findViewById(R.id.mean);
        ButtonHandler2 temp2 = new ButtonHandler2();
        mean.setOnClickListener(temp2);

        Button median = (Button) findViewById(R.id.median);
        ButtonHandler3 temp3 = new ButtonHandler3();
        median.setOnClickListener(temp3);

        Button sdv = (Button) findViewById(R.id.stdDeviation);
        ButtonHandler4 temp4 = new ButtonHandler4();
        sdv.setOnClickListener(temp4);

        Button minimum = (Button) findViewById(R.id.min);
        ButtonHandler5 temp5 = new ButtonHandler5();
        minimum.setOnClickListener(temp5);

        Button maximum = (Button) findViewById(R.id.max);
        ButtonHandler6 temp6 = new ButtonHandler6();
        maximum.setOnClickListener(temp6);
    }

    private class ButtonHandler implements View.OnClickListener {
        double sum = 0, add = 0;


        ArrayList<Double> theArray = new ArrayList<Double>(); //to create an array list

        public void onClick(View v) {
           //to access the input given and parse them into a string
            EditText inputEditText = (EditText) findViewById(R.id.input);
            String inputString = inputEditText.getText().toString();

            String strWithSpace = inputString;
            StringTokenizer strTokenSpace = new StringTokenizer(strWithSpace, " "); //StringTokenizer is used to create spaces between the inputs

            add = 0;
            sum = 0;
            while (strTokenSpace.hasMoreTokens()) {
                double token = Double.parseDouble(strTokenSpace.nextToken());
                //each token is added to the array and then all the tokens are added
                theArray.add(token);
                add = add + token;

                sum = add;
                sum = Math.round(sum * 100);
                sum = sum / 100;

            }
            //to display the sum
            TextView output = (TextView) findViewById(R.id.output);
            output.setText("Sum is" + sum + "");

        }

    }

    private class ButtonHandler2 implements View.OnClickListener {
        double sum = 0, mean = 0, meanOutput = 0;
        int count = 0;

        ArrayList<Double> theArray = new ArrayList<Double>();//to create an array list

        public void onClick(View v) {
            //to access the input given and parse them into a string
            EditText inputEditText = (EditText) findViewById(R.id.input);
            String inputString = inputEditText.getText().toString();

            String strWithSpace = inputString;
            StringTokenizer strTokenSpace = new StringTokenizer(strWithSpace, " ");//StringTokenizer is used to create spaces between the inputs

            //to check if the array has more tokens
            while (strTokenSpace.hasMoreTokens()) {

                double token = Double.parseDouble(strTokenSpace.nextToken());
                sum += token;

                //add each token and sort them
                theArray.add(token);
                Collections.sort(theArray);

                //to count the number of tokens and divide the sum by the count
                count = theArray.size();
                meanOutput = (sum / count);

                mean = meanOutput;
                mean = Math.round(mean * 100);
                mean = mean / 100;
            }
            TextView output = (TextView) findViewById(R.id.output);
            output.setText("Mean is" + mean + "");

        }
    }

    private class ButtonHandler3 implements View.OnClickListener {
        ArrayList<Double> theArray = new ArrayList<Double>();
        int count = 0,pos = 0;
        double median = 0;

        public void onClick(View v) {

            EditText inputEditText = (EditText) findViewById(R.id.input);
            String inputString = inputEditText.getText().toString();

            String strWithSpace = inputString;
            StringTokenizer strTokenSpace = new StringTokenizer(strWithSpace, " "); //SringTokenizer to seperate the string with spaces

            //to check if the array has are more tokens
            while (strTokenSpace.hasMoreTokens()) {

                double token = Double.parseDouble(strTokenSpace.nextToken());

                //add each token and sort them
                theArray.add(token);
                Collections.sort(theArray);

                //To count the size of the array and divide the size by 2
                count = theArray.size();
                pos = (count / 2);
                median = theArray.get(pos);
            }
            TextView output = (TextView) findViewById(R.id.output);
            output.setText("Median is" + median + "");
        }

    }

    private class ButtonHandler4 implements View.OnClickListener {
        double []val;
        int i=0,j=0;
        double mean=0,res=0,s=0,count = 0, sum = 0,stddev=0;;
        public void onClick(View v) {
            try {

                EditText inputEditText = (EditText) findViewById(R.id.input);
                String inputString = inputEditText.getText().toString();

                String strWithSpace = inputString;

                StringTokenizer strTokenSpace = new StringTokenizer(strWithSpace, " "); //SringTokenizer to seperate the string with spaces
                val = new double[strTokenSpace.countTokens()];
                sum = 0;
                count = strTokenSpace.countTokens(); //count tokens

                //check if the array has more tokens
                while (strTokenSpace.hasMoreTokens()) {

                    double token = Double.parseDouble(strTokenSpace.nextToken());
                    val[i] = token;
                    i++;
                    sum += token;
                    mean = (sum / count); //total number of tokens
                }
                for (j = 0; j < count; j++)
                    val[j] = val[j] - mean; // to subtract each token with mean
                for (j = 0; j < count; j++)
                    val[j] = val[j] * val[j]; //to square each token

                for (j = 0, s = 0; j < count; j++)
                    s = s + val[j]; //to add all the tokens

                //to divide the sum with the number of tokens and squareroot them
                double std = s / count;
                res = Math.sqrt(std);

                stddev = res;
                stddev = Math.round(stddev * 100);
                stddev = stddev / 100;

                TextView output = (TextView) findViewById(R.id.output);
                output.setText("Standard Deviation is" + stddev + "");
            }
            catch(Exception e)
            {

            }
        }
    }

    private class ButtonHandler5 implements View.OnClickListener {
        ArrayList<Double> theArray = new ArrayList<Double>();
        double minimum=0;
        public void onClick(View v) {

            EditText inputEditText = (EditText) findViewById(R.id.input);
            String inputString = inputEditText.getText().toString();

            String strWithSpace = inputString;
            StringTokenizer strTokenSpace = new StringTokenizer(strWithSpace, " "); //SringTokenizer  to seperate the string with spaces

            //check if the array has more tokens
            while (strTokenSpace.hasMoreTokens()) {

                double token = Double.parseDouble(strTokenSpace.nextToken());

                //add each token and sort them
                theArray.add(token);
                Collections.sort(theArray);

                theArray.size();
                minimum = theArray.get(0);

                TextView output = (TextView) findViewById(R.id.output);
                output.setText("Minimum is" + minimum + "");
            }
        }
    }

    private class ButtonHandler6 implements View.OnClickListener {
        ArrayList<Double> theArray = new ArrayList<Double>();
        double maximum=0;
        public void onClick(View v) {

            EditText inputEditText = (EditText) findViewById(R.id.input);
            String inputString = inputEditText.getText().toString();

            String strWithSpace = inputString;
            StringTokenizer strTokenSpace = new StringTokenizer(strWithSpace, " ");//SringTokenizer  to seperate the string with spaces

            // to check if the array has more tokens
            while (strTokenSpace.hasMoreTokens()) {

                double token = Double.parseDouble(strTokenSpace.nextToken());

                //to add each token to the array
                theArray.add(token);

                //To find the array size and sort the array
                theArray.size();
                Collections.sort(theArray);
                maximum = theArray.get(theArray.size() - 1);

                TextView output = (TextView) findViewById(R.id.output);
                output.setText("Maximum is" + maximum + "");

            }
        }
    }
}

