package com.example.ashwininadagoud.direction;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
    }

    public void back(View v)
    {
        finish();
        overridePendingTransition(R.anim.incomingrotatenorth, 0);
        //The animations are created for incoming page and outgoing page
    }

}