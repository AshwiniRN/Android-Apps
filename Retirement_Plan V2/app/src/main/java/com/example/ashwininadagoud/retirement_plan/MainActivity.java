package com.example.ashwininadagoud.retirement_plan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calculate(View v)
    {
        //To access the current principal edit text field
        EditText et_CurrentPrincipal = (EditText) findViewById(R.id.inputCurrentPrincipal); //takes input from edittext
        String inputCurrentPrincipal = et_CurrentPrincipal.getText().toString();
        float currentPrincipal = Float.parseFloat(inputCurrentPrincipal); //parse it into string

        //To access the annual addition edit text field
        EditText et_AnnualAddition = (EditText) findViewById(R.id.inputAnnualAddition); //takes input from edittext
        String inputAnnualAddition = et_AnnualAddition.getText().toString();
        float annualAddition = Float.parseFloat(inputAnnualAddition); //parse it into string

        //To access the years edit text field
        EditText et_Years = (EditText) findViewById(R.id.inputYears); //takes input from iedit text
        String inputYears = et_Years.getText().toString();
        int years = Integer.parseInt(inputYears); //parse it into string

        //gTo access invest rate edit text field
        EditText et_InvestmentRate = (EditText) findViewById(R.id.inputInvestment); //takes input from edit text
        String inputInvestRate = et_InvestmentRate.getText().toString();
        float investRate = Float.parseFloat(inputInvestRate); //parse it into string

        //Intent is used to create second activity and the inputs are sent to the second activity using extras
        Intent secondActivity = new Intent(this, SecondActivity.class);
        secondActivity.putExtra("currentPrincipal", currentPrincipal);
        secondActivity.putExtra("annualAddition",annualAddition);
        secondActivity.putExtra("years",years);
        secondActivity.putExtra("investRate",investRate);

        startActivity(secondActivity);
    }
}
