package com.example.ashwininadagoud.manage_expenses;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SortByName extends AppCompatActivity {

    private DatabaseManager dbManager;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sortbyname);

        dbManager = new DatabaseManager(this);
    }
    public void add(View v)

    {
        EditText et_nameFind = (EditText) findViewById(R.id.inputFindName);
        String nameFind = et_nameFind.getText().toString();

        TextView tv_outputName = (TextView) findViewById(R.id.outputName);
        ExpenseList expenseList = dbManager.select(nameFind);

        if (expenseList != null) {
            tv_outputName.setText(expenseList.getName() + " " + expenseList.getPrice() + " " + expenseList.getDate());

        } else
            tv_outputName.setText(" ");
    }


    public void back(View v)
    {
        finish();
    }
}

