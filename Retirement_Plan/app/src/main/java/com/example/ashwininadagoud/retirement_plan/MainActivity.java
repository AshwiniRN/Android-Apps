package com.example.ashwininadagoud.retirement_plan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View v)
    {
        EditText inputPrincipalEditText = (EditText) findViewById(R.id.inputPrincipal);
        String inputPrincipal = inputPrincipalEditText.getText().toString();

        EditText inputAnnualAdditionEditText = (EditText) findViewById(R.id.inputAnnualAddition);
        String inputAnnualAddition = inputAnnualAdditionEditText.getText().toString();

        EditText inputYearsEditText = (EditText) findViewById(R.id.inputYears);
        String inputYears = inputYearsEditText.getText().toString();

        EditText inputReturnRateEditText = (EditText) findViewById(R.id.inputReturnRate);
        String returnRate = inputReturnRateEditText.getText().toString();

        //error checking if any input is invalid(null or . operator)
        if(inputPrincipal.equals("")||inputPrincipal.equals(".") || inputAnnualAddition.equals("")||inputAnnualAddition.equals(".")
                ||inputYears.equals("")||inputYears.equals(".")||returnRate.equals("")||returnRate.equals("."))

        {
            inputPrincipalEditText.setBackgroundColor(Color.rgb(255,0,0));
            inputAnnualAdditionEditText.setBackgroundColor(Color.rgb(255,0,0));
            inputYearsEditText.setBackgroundColor(Color.rgb(255,0,0));
            inputReturnRateEditText.setBackgroundColor(Color.rgb(255,0,0));

            String calculateTotal = "";

            TextView outputFinalAmtTextView = (TextView)findViewById(R.id.outputFinalAmount);
            outputFinalAmtTextView.setText(calculateTotal);

        }
        else
        {
            Calculate total = new Calculate(inputPrincipal,inputAnnualAddition,inputYears,returnRate);
            float calculateTotal = total.getTotal();

            TextView outputFinalAmtTextView = (TextView)findViewById(R.id.outputFinalAmount);
            outputFinalAmtTextView.setText(Integer.toString(new Double(Math.round(calculateTotal)).intValue()));
        }

    }

}

