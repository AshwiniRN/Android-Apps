package com.example.ashwininadagoud.arithmetic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

 //For addition
    public void add(View v)
    {
        EditText operand1EditText = (EditText)findViewById(R.id.labelOperand1);
        EditText operand2EditText = (EditText)findViewById(R.id.labelOperand2);

        String operand1String = operand1EditText.getText().toString();
        String operand2String = operand2EditText.getText().toString();

        float operand1 = Float.parseFloat(operand1String);
        float operand2 = Float.parseFloat(operand2String);

        double sum = operand1 + operand2;
        sum = Math.round(sum * 100);
        sum = sum/100;

        TextView sumTextView = (TextView)findViewById(R.id.output);
        sumTextView.setText(sum+"");
    }
 
 //For subtraction
    public void subtract(View v)
    {
        EditText operand1EditText = (EditText)findViewById(R.id.labelOperand1);
        EditText operand2EditText = (EditText)findViewById(R.id.labelOperand2);

        String operand1String = operand1EditText.getText().toString();
        String operand2String = operand2EditText.getText().toString();

        float operand1 = Float.parseFloat(operand1String);
        float operand2 = Float.parseFloat(operand2String);

        double difference = operand1 - operand2;
        difference = Math.round(difference * 100);
        difference = difference/100;

        TextView differenceTextView = (TextView)findViewById(R.id.output);
        differenceTextView.setText(difference+"");
    }
  
  //For multiplication
    public void multiply(View v)
    {
        EditText operand1EditText = (EditText)findViewById(R.id.labelOperand1);
        EditText operand2EditText = (EditText)findViewById(R.id.labelOperand2);

        String operand1String = operand1EditText.getText().toString();
        String operand2String = operand2EditText.getText().toString();

        float operand1 = Float.parseFloat(operand1String);
        float operand2 = Float.parseFloat(operand2String);

        double product = operand1 * operand2;
        product = Math.round(product * 100);
        product = product/100;

        TextView productTextView = (TextView)findViewById(R.id.output);
        productTextView.setText(product+"");
    }

    //For division
    public void divide(View v)
    {
        EditText operand1EditText = (EditText)findViewById(R.id.labelOperand1);
        EditText operand2EditText = (EditText)findViewById(R.id.labelOperand2);

        String operand1String = operand1EditText.getText().toString();
        String operand2String = operand2EditText.getText().toString();

        float operand1 = Float.parseFloat(operand1String);
        float operand2 = Float.parseFloat(operand2String);

        double quotient = operand1 / operand2;
        quotient = Math.round(quotient * 100);
        quotient = quotient/100;

        TextView quotientTextView = (TextView)findViewById(R.id.output);
        quotientTextView.setText(quotient+"");
    }
}
