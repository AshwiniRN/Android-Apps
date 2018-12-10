package com.example.ashwininadagoud.sem_cost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;

public class FourthActivity extends AppCompatActivity{

    public static int optCost=0;
    public static boolean checkId;
    public static boolean checkId1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

    }

    public void nextToFive(View v)
    {
        //To access the checkboxes
        CheckBox cb_Dorm = (CheckBox) findViewById(R.id.cbDorm); //To access id for dorm
        checkId = cb_Dorm.isChecked();
        CheckBox cb_Dining = (CheckBox) findViewById(R.id.cbDining); //To access id for dining
        checkId1 = cb_Dining.isChecked();

        int optCostExpenses = 0;
        if(cb_Dorm.isChecked()) //if dorm is checked
            optCostExpenses += 1000;
        if(cb_Dining.isChecked())  //if dining is selected
            optCostExpenses += 500;

        optCost = optCostExpenses;

        //Creates and redirects inputs to next page
        Intent fifthActivity = new Intent(this, FifthActivity.class);
        startActivity(fifthActivity);
    }

    public void backToThree(View v)
    {
        FourthActivity.this.finish();
    }

}

