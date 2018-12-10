package com.example.ashwininadagoud.manage_expenses;

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

import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
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
        LinkedList<ExpenseList> list = dbManager.all();
        if(list.size()>0)
        {
            Point size = new Point();
            getWindowManager().getDefaultDisplay().getSize(size);
            int textWidth = size.x/3;
            int DP =(int)(getResources().getDisplayMetrics().density);


            TableLayout stk = new TableLayout(this);

            TableRow tbrow0 = new TableRow(this);

            TextView tv0 = new TextView(this);
            tv0.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
            tv0.setText(" Name ");
            tv0.setTextColor(Color.BLACK);
            tbrow0.addView(tv0);

            TextView tv1 = new TextView(this);
            tv1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
            tv1.setText(" Price ");
            tv1.setTextColor(Color.BLACK);
            tbrow0.addView(tv1);

            TextView tv2 = new TextView(this);
            tv2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
            tv2.setText(" Date ");
            tv2.setTextColor(Color.BLACK);
            tbrow0.addView(tv2);



            stk.addView(tbrow0);
            for (int i = 0; i < list.size(); i++) {
                ExpenseList expenseList = list.get(i);

                TableRow tbrow = new TableRow(this);

                TextView[] textView = new TextView[list.size()];

                textView[i] = new TextView(this);
                textView[i].setText(expenseList.getName());
                textView[i].setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
                textView[i].setTextColor(Color.parseColor("#000000"));
                textView[i].setBackgroundColor(Color.parseColor("#A3E4D7"));
                textView[i].setPadding(10*DP, 10*DP, 10*DP, 10*DP);
                textView[i].setGravity(Gravity.CENTER);

                tbrow.addView(textView[i]);

                TextView[] textView1 = new TextView[list.size()];

                textView1[i] = new TextView(this);
                textView1[i].setText(expenseList.getPrice()+"");
                textView1[i].setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
                textView1[i].setTextColor(Color.parseColor("#000000"));
                textView1[i].setBackgroundColor(Color.parseColor("#A3E4D7"));
                textView1[i].setPadding(10*DP, 10*DP, 10*DP, 10*DP);
                textView1[i].setGravity(Gravity.CENTER);

                tbrow.addView(textView1[i]);


                TextView[] textView2 = new TextView[list.size()];

                textView2[i] = new TextView(this);
                textView2[i].setText(expenseList.getDate());
                textView2[i].setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
                textView2[i].setTextColor(Color.parseColor("#000000"));
                textView2[i].setBackgroundColor(Color.parseColor("#A3E4D7"));
                textView2[i].setPadding(10*DP, 10*DP, 10*DP, 10*DP);
                textView2[i].setGravity(Gravity.CENTER);

                tbrow.addView(textView2[i]);

                stk.addView(tbrow);


            }

            ScrollView scroll = (ScrollView)findViewById(R.id.scroll);
            scroll.removeAllViewsInLayout();
            scroll.addView(stk);
        }

        else
        {
            ScrollView scroll = (ScrollView)findViewById(R.id.scroll);
            scroll.removeAllViewsInLayout();
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu and add items to action bar
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // To handle action bar item. The action bar will automatically handle clicks
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.add) {
            Intent insertActivity = new Intent(this, InsertActivity.class);
            startActivity(insertActivity);

        }
        else if(id==R.id.delete)
        {
            Intent deleteActivity = new Intent(this, DeleteActivity.class);
            startActivity(deleteActivity);
        }
        else if(id==R.id.sortbyname)
        {
            Intent sortByName = new Intent(this, SortByName.class);
            startActivity(sortByName);
        }

        else if(id==R.id.sortbyPrice)
        {
            Intent sortByPrice = new Intent(this, SortByPrice.class);
            startActivity(sortByPrice);
        }


        return true;
    }
}
