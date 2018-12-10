package com.example.ashwininadagoud.manage_passwords;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.LinkedList;


public class MainActivity extends AppCompatActivity {

    private DatabaseManager dbManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        dbManager = new DatabaseManager(this);

        updateView();
    }

    protected void onRestart()
    {
        super.onRestart();
        updateView();
    }

    private void updateView()
    {
        LinkedList<ManagePasswords> list = dbManager.all();
        if(list.size()>0)
        {
            Point size = new Point();
            getWindowManager().getDefaultDisplay().getSize(size);
            int textWidth = size.x/2;
            int DP =(int)(getResources().getDisplayMetrics().density);
            int rows = (list.size() +1)/2;
            int columns = 2;

            GridLayout grid = new GridLayout(this);
            grid.setRowCount(rows);
            grid.setColumnCount(columns);
            ScrollView.LayoutParams params = new ScrollView.LayoutParams(0,0);
            params.width = columns*textWidth;
            params.height=rows*textWidth;
            grid.setLayoutParams(params);

            TextView[] textView = new TextView[list.size()];

            for(int i=0;i<list.size();i++)
            {
                //To create textViews
                ManagePasswords managePasswords = list.get(i);

                textView[i] = new TextView(this);
                textView[i].setText(managePasswords.getAccount() + "\n" + managePasswords.getPassword());
                textView[i].setTextSize(TypedValue.COMPLEX_UNIT_SP, 22);
                textView[i].setTextColor(Color.parseColor("#000000"));
                textView[i].setBackgroundColor(Color.parseColor("#AED6F1"));
                textView[i].setPadding(10*DP, 10*DP, 10*DP, 10*DP);
                textView[i].setGravity(Gravity.CENTER);

                GridLayout.LayoutParams params1 =new GridLayout.LayoutParams();
                params1.width = textWidth;
                params1.height =textWidth;
                params1.rowSpec =GridLayout.spec(i/columns, 1);
                params1.columnSpec =GridLayout.spec(i%columns, 1);
                params1.topMargin = params1.bottomMargin =1;
                params1.leftMargin =params1.rightMargin=1;
                textView[i].setLayoutParams(params1);

                grid.addView(textView[i]);
            }

            //textviews are added on scrollView
            ScrollView scroll = (ScrollView)findViewById(R.id.scroll);
            scroll.removeAllViewsInLayout();
            scroll.addView(grid);
        }

        else
        {
            ScrollView scroll = (ScrollView)findViewById(R.id.scroll);
            scroll.removeAllViewsInLayout();
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu and add items to the action bar
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //To handle action bar item. The action bar will automatically handle clicks
        int id = item.getItemId();

        //Add redirects to new page insert activity
        if (id == R.id.add) {
            Intent insertActivity = new Intent(this, InsertActivity.class);
            startActivity(insertActivity);

        }
        //Delete redirects to new page delete activity
        else if(id==R.id.delete)
        {
            Intent deleteActivity = new Intent(this, DeleteActivity.class);
            startActivity(deleteActivity);
        }

        //Update redirects to new page update activity
        else if(id==R.id.update)
        {
            Intent updateActivity = new Intent(this, UpdateActivity.class);
            startActivity(updateActivity);
        }

        return true;
    }
}
