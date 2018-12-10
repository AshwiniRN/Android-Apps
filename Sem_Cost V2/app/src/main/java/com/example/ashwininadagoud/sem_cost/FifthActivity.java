package com.example.ashwininadagoud.sem_cost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;


public class FifthActivity extends AppCompatActivity {

    public static int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        updateView();
    }

    public void updateView()
    {
        //Formula that calculate the total cost
        total = (SecondActivity.credits * ThirdActivity.status) + FourthActivity.optCost;

        //To access the textview that displays number of credits
        TextView tv_credits = (TextView) findViewById(R.id.outputCredits);
        tv_credits.setText(SecondActivity.credits+"");

        //To access the radio group that displays academic status
        RadioGroup rg_AcademicStatus = (RadioGroup) findViewById(R.id.radioAcademicStatus);
        rg_AcademicStatus.check(ThirdActivity.id);

        //To access check boxes that displays optional expenses
        CheckBox cb_Dorm = (CheckBox) findViewById(R.id.cb_dorm); //get id for dorm
        cb_Dorm.setChecked(FourthActivity.checkId);

        CheckBox cb_Dining = (CheckBox) findViewById(R.id.cb_dining); //get id for dining
        cb_Dining.setChecked(FourthActivity.checkId1);

        //The text view that diplays the total cost
        TextView tv_total = (TextView) findViewById(R.id.outputTotal);
        tv_total.setText(total+"");

    }

    public void backToFour(View v) {

        FifthActivity.this.finish();

    }
}
