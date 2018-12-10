package com.example.ashwininadagoud.manage_expenses;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class SortByPrice extends AppCompatActivity{

    private DatabaseManager dbManager;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sortbyprice);

        dbManager = new DatabaseManager(this);
    }

    public void add(View v)

    {
        EditText et_priceOneFind = (EditText) findViewById(R.id.inputPriceOne);
        String priceFind = et_priceOneFind.getText().toString();
        float priceOne = Float.parseFloat(priceFind);

        EditText et_priceTwoFind = (EditText) findViewById(R.id.inputPriceTwo);
        String priceTwoFind = et_priceTwoFind.getText().toString();
        float priceTwo = Float.parseFloat(priceTwoFind);

        TextView outputNameText = (TextView) findViewById(R.id.outputPrice);
        ExpenseList expenseList = dbManager.selectCost(priceOne, priceTwo);

        if (expenseList != null) {
            outputNameText.setText(expenseList.getName() + " " + expenseList.getPrice() + " " + expenseList.getDate());

        } else
            outputNameText.setText(" ");
    }


    public void back(View v)
    {
        finish();
    }
}


