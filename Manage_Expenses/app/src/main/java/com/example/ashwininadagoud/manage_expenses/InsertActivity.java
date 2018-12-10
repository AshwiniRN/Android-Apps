package com.example.ashwininadagoud.manage_expenses;



import android.icu.text.SimpleDateFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import java.util.Date;

public class InsertActivity extends AppCompatActivity {

    private DatabaseManager dbManager;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        dbManager = new DatabaseManager(this);
    }
    public void add(View v)

    {
        EditText et_name = (EditText)findViewById(R.id.inputName);
        String name = et_name.getText().toString();

        EditText et_price =(EditText)findViewById(R.id.inputPrice);
        String priceString = et_price.getText().toString();
        float price = Float.parseFloat(priceString);

        EditText et_date =(EditText)findViewById(R.id.inputDate);
        String date = et_date.getText().toString();

        ExpenseList expenseList= new ExpenseList(name, price, date);
        dbManager.insert(expenseList);
    }

    public void back(View v)
    {
        finish();
    }
}

