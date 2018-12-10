package com.example.ashwininadagoud.manage_expenses;


import android.os.Bundle;
import android.support.v4.app.BundleCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;

import java.util.LinkedList;

public class DeleteActivity extends AppCompatActivity {

    private DatabaseManager dbManager;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);

        dbManager =new DatabaseManager(this);

        updateView();
    }

    private void updateView()
    {
        LinkedList<ExpenseList> list = dbManager.all();

        if(list.size()>0)
        {
            RadioGroup group = new RadioGroup(this);

            RadioButton[] buttons = new RadioButton[list.size()];

            for(int i=0;i<list.size();i++)
            {
                ExpenseList expenseList = list.get(i);

                buttons[i] = new RadioButton(this);
                buttons[i].setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
                buttons[i].setText(expenseList.getName().toUpperCase() + " " + expenseList.getPrice() + " " + expenseList.getDate());
                RadioButtonHandler temp = new RadioButtonHandler(expenseList.getName());
                buttons[i].setOnClickListener(temp);

                group.addView(buttons[i]);

            }
            ScrollView scroll = (ScrollView)findViewById(R.id.scroll);
            scroll.removeAllViewsInLayout();
            scroll.addView(group);
        }

        else
        {
            ScrollView scroll = (ScrollView)findViewById(R.id.scroll);
            scroll.removeAllViewsInLayout();
        }

    }

    private class RadioButtonHandler implements View.OnClickListener {
        private String name;

        public RadioButtonHandler(String name)
        {
            this.name=name;
        }
        public void onClick(View view)
        {
            dbManager.delete(name);
            updateView();
        }
    }

    public void back(View view)
    {
        finish();
    }
}

