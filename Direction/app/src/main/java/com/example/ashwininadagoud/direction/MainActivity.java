package com.example.ashwininadagoud.direction;

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

    public void north(View v)
    {
        //The animations are created incoming page and outgoing page
        Intent secondActivity = new Intent(this, SecondActivity.class);
        startActivity(secondActivity);
        overridePendingTransition(R.anim.incoming, R.anim.outgoing);
    }

    public void south(View v)
    {
        //The animations are created incoming page and outgoing page
        Intent thirdActivity = new Intent(this, ThirdActivity.class);
        startActivity(thirdActivity);
        overridePendingTransition(R.anim.incomingsouth, R.anim.outgoingsouth);
    }

    public void east(View v)
    {
        //The animations are created incoming page and outgoing page
        Intent fourthActivity = new Intent(this, FourthActivity.class);
        startActivity(fourthActivity);
        overridePendingTransition(R.anim.incomingeast, R.anim.outgoingeast);
    }

    public void west(View v)
    {
        //The animations are created incoming page and outgoing page
        Intent fifthActivity = new Intent(this, FifthActivity.class);
        startActivity(fifthActivity);
        overridePendingTransition(R.anim.incomingwest, R.anim.outgoingwest);
    }

}
