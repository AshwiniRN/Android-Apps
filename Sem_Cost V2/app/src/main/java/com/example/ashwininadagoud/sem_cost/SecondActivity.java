package com.example.ashwininadagoud.sem_cost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    public static int credits=0;
    //public static allows the user to access the variable in other java classes

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

    }

    public void nextToThree(View v)
    {
        //To access the credits edit text field
        EditText et_credit = (EditText) findViewById(R.id.inputCredit); //take input from edit text
        String creditString = et_credit.getText().toString(); //parse it to String
        int credit = Integer.parseInt(creditString);
        credits = credit;

        //Creates and redirects inputs to next page
        Intent thirdActivity = new Intent(this, ThirdActivity.class);
        startActivity(thirdActivity);
    }

    public void backToMain(View v)
    {
        SecondActivity.this.finish();
    }
}


