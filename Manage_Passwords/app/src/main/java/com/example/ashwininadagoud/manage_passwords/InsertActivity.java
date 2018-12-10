package com.example.ashwininadagoud.manage_passwords;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


public class InsertActivity extends AppCompatActivity {

    private DatabaseManager dbManager;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        dbManager = new DatabaseManager(this);
    }

    public void add(View v)  //Method to add new account and its password

    {
        //To access account and password
        EditText et_account = (EditText)findViewById(R.id.inputAccount);
        String account = et_account.getText().toString();

        EditText et_password =(EditText)findViewById(R.id.inputPassword);
        String password = et_password.getText().toString();

        //To pass strings to ManagePasswords
        ManagePasswords managePasswords = new ManagePasswords(account, password);
        dbManager.insert(managePasswords);
    }

    public void back(View v)
    {
        finish();
    }
}
