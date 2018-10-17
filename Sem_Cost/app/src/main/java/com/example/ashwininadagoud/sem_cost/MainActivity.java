package com.example.ashwininadagoud.sem_cost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //onclick calculate function 
    public void calculate(View v)
    {

        EditText creditEditText = (EditText) findViewById(R.id.inputCredits);
        String creditString = creditEditText.getText().toString();

        int credit;
        if(creditString.isEmpty())
            credit = 0;
        else
            credit = Integer.parseInt(creditString);

        RadioGroup radioGroupAcademicStatus = (RadioGroup) findViewById(R.id.radioAcademicStatus);
        int id = radioGroupAcademicStatus.getCheckedRadioButtonId();

        RadioGroup radioGroupStateStatus = (RadioGroup) findViewById(R.id.radioStateStatus);

        int id1 = radioGroupStateStatus.getCheckedRadioButtonId();

        CheckBox checkBoxDorm = (CheckBox) findViewById(R.id.dorm);
        CheckBox checkBoxDining = (CheckBox) findViewById(R.id.dining);
        CheckBox checkBoxParking = (CheckBox) findViewById(R.id.parking);

        int optCost = 0;

        if(checkBoxDorm.isChecked())
            optCost += 1000;
        if(checkBoxDining.isChecked())
            optCost += 500;
        if(checkBoxParking.isChecked())
            optCost += 100;

        Calculate calculate = new Calculate();
        calculate.set(credit, id, id1, optCost);
        int total = calculate.get();

        TextView totalTextView = (TextView) findViewById(R.id.outputTotal);
        totalTextView.setText(total+"");
    }


}
