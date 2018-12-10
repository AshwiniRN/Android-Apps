package com.example.ashwininadagoud.retirement_plan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        updateView();
    }
    private void updateView()
    {
        //Accessing the inputs given in the main activity
        Intent intent = getIntent();
        float currentPrincipal=intent.getFloatExtra("currentPrincipal", 0);
        float annualAddition=intent.getFloatExtra("annualAddition", 0);
        int years=intent.getIntExtra("years", 0);
        float investRate =intent.getFloatExtra("investRate", 0);

        //To create an object for calculate method
        Calculate calculate = new Calculate();

        float n = 0;
        int count = 1;
        String result = ""; //Takes an empty string
        //This loop is repeated until it matches the years entered by the user
        for (int i = 1; i <= years; i++) {
            n=((investRate / 100) * (currentPrincipal + annualAddition)) + (currentPrincipal +annualAddition);
            result = result + count++ + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+"\t\t" +(int)n+ "\n"+"\n";

            //The result of n is set as new current principal
            calculate.setCurrentPrincipal(n);
            currentPrincipal = calculate.getCurrentPrincipal();
        }
        TextView finalAmount = (TextView) findViewById(R.id.outputFinalAmount);
        finalAmount.setText(result); //Displays the output


    }
    public void back(View v)
    {
        //Second activity killed and redirected to the main activity
        SecondActivity.this.finish();

    }
}