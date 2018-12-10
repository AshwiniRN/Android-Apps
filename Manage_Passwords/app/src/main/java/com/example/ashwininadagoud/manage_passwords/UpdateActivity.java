package com.example.ashwininadagoud.manage_passwords;

import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.LinkedList;

public class UpdateActivity extends AppCompatActivity {
    private DatabaseManager dbManager;

    private TextView[] accounts;
    private EditText[] passwords;
    private Button[] buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        dbManager = new DatabaseManager(this);

        updateView();
    }

    private void updateView()
    {
        LinkedList<ManagePasswords> list = dbManager.all();
        if(list.size()>0)
        {
            Point size = new Point();
            getWindowManager().getDefaultDisplay().getSize(size);
            int screenWidth = size.x;
            int DP =(int)(getResources().getDisplayMetrics().density);

            int rows = list.size();
            int columns = 3;

            accounts = new TextView[rows];
            passwords = new EditText[rows];
            buttons = new Button[rows];


            //Grid layout with textviews and button
            GridLayout grid = new GridLayout(this);
            grid.setRowCount(rows);
            grid.setColumnCount(columns);
            ScrollView.LayoutParams params = new ScrollView.LayoutParams(0,0);
            params.width = screenWidth;
            params.height=rows * (screenWidth / 5);
            grid.setLayoutParams(params);


            for(int i=0;i<list.size();i++) {
                ManagePasswords managePasswords = list.get(i);

                accounts[i] = new TextView(this);
                accounts[i].setText(managePasswords.getAccount());
                accounts[i].setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
                accounts[i].setTextColor(Color.parseColor("#000000"));
                accounts[i].setPadding(10 * DP, 10 * DP, 10 * DP, 10 * DP);
                accounts[i].setGravity(Gravity.CENTER);
                GridLayout.LayoutParams params1 = new GridLayout.LayoutParams();
                params1.width = (int) (screenWidth * 0.4);
                params1.height = screenWidth / 5;
                params1.rowSpec = GridLayout.spec(i, 1);
                params1.columnSpec = GridLayout.spec(0, 1);
                accounts[i].setLayoutParams(params1);
                grid.addView(accounts[i]);


                passwords[i] = new EditText(this);
                passwords[i].setText(managePasswords.getPassword()+ "");
                passwords[i].setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
                passwords[i].setTextColor(Color.parseColor("#000000"));
                passwords[i].setPadding(10 * DP, 10 * DP, 10 * DP, 10 * DP);
                passwords[i].setGravity(Gravity.CENTER);
                params1 = new GridLayout.LayoutParams();
                params1.width = (int) (screenWidth * 0.3);
                params1.height = screenWidth / 5;
                params1.rowSpec = GridLayout.spec(i, 1);
                params1.columnSpec = GridLayout.spec(1, 1);
                passwords[i].setLayoutParams(params1);
                grid.addView(passwords[i]);


                buttons[i] = new Button(this);
                buttons[i].setText("SUBMIT");
                buttons[i].setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
                buttons[i].setTextColor(Color.parseColor("#000000"));
                buttons[i].setPadding(10 * DP, 10 * DP, 10 * DP, 10 * DP);
                buttons[i].setGravity(Gravity.CENTER);
                params1 = new GridLayout.LayoutParams();
                params1.width = (int) (screenWidth * 0.3);
                params1.height = screenWidth / 5;
                params1.rowSpec = GridLayout.spec(i, 1);
                params1.columnSpec = GridLayout.spec(2, 1);
                buttons[i].setLayoutParams(params1);

                ButtonHandler temp = new ButtonHandler(i);
                buttons[i].setOnClickListener(temp);
                grid.addView(buttons[i]);

            }
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

    private class ButtonHandler implements View.OnClickListener {
        private int rowNumber;

        public ButtonHandler(int rowNumber)

        {
            this.rowNumber = rowNumber;
        }

        public void onClick(View view) {
            String account = accounts[rowNumber].getText().toString();

            String password = passwords[rowNumber].getText().toString();

            ManagePasswords managePasswords = new ManagePasswords(account, password);

            dbManager.update(managePasswords);
        }
    }

    public void back(View view)
    {
        finish();
    }
}


