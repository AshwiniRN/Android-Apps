package com.example.ashwininadagoud.direction;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class FifthActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
    }

    public void back(View v)
    {
        finish();
        overridePendingTransition(R.anim.incomingrotatenorth, 0);
        //The animations are created for incoming and outgoing pages
    }
}
