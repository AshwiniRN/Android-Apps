package com.example.ashwininadagoud.unit_conversion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //To inflate the menu and add items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handles action bar item. The action bar will automatically handle clicks
        int id = item.getItemId();

        // option1 redirects to SecondActivity activity
        if (id == R.id.option1) {
            Intent secondActivity = new Intent(this, SecondActivity.class);
            startActivity(secondActivity);
        }
        //option2 redirect to ThirdActivity activity
        else if(id==R.id.option2)
        {
            Intent thirdActivity = new Intent(this, ThirdActivity.class);
            startActivity(thirdActivity);
        }
        //option3 redirects to FourthActivity activity
        else if(id==R.id.option3)
        {
            Intent fourthActivity = new Intent(this, FourthActivity.class);
            startActivity(fourthActivity);
        }

        return true;
    }
}
