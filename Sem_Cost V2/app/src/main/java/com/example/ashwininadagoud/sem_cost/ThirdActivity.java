package com.example.ashwininadagoud.sem_cost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class ThirdActivity extends AppCompatActivity {

    public static int status = 0;
    public static int id = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

    }

    public void nextToFour(View v)
    {

        //To access the academic status edit text field
        RadioGroup rg_AcademicStatus = (RadioGroup) findViewById(R.id.radioAcademicStatus);
        id = rg_AcademicStatus.getCheckedRadioButtonId(); //takes the id and accesses checkedRadioButton for radioGroupAcademicStatus

        int radio_AcademicStatus;
        if (id == R.id.graduate)  //if id is equal to graduate
            radio_AcademicStatus = 400;
        else
            radio_AcademicStatus = 300; //if id is equal to undergraduate
        status = radio_AcademicStatus;

        //Creates and redirects inputs to next page
        Intent fourthActivity = new Intent(this, FourthActivity.class);
        startActivity(fourthActivity);
    }

    public void backToTwo(View v)
    {

        ThirdActivity.this.finish();
    }

}


