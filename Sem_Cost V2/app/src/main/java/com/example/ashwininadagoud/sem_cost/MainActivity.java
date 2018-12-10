package com.example.ashwininadagoud.sem_cost;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void nextPage(View v)
    {
        //Intent to redirect to the next page
        Intent secondActivity = new Intent(this, SecondActivity.class);
        startActivity(secondActivity);

    }
}

