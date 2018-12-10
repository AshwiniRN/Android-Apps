package com.example.ashwininadagoud.encrypt_decrypt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static Message message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        message = new Message("", 0); //initial key is 0
        setContentView(R.layout.activity_main);
    }
    public void onStart()
    {
        super.onStart();

    }
    public void encrypt(View v)
    {
        updateView();
    }
    public void decrypt(View v)
    {
        updateView1();
    }

    public void key(View v)
    {
        //Intent redirects to next page and creates a key
        Intent secondActivity = new Intent(this, SecondActivity.class);
        startActivity(secondActivity);
    }

    private void updateView()
    {
        //To access the message edit text field
        EditText et_message = (EditText)findViewById(R.id.msg);
        String msg = et_message.getText().toString();

        int key = message.getKey();
        message = new Message(msg, key);
        //key and msg are passed to encryption
        String ans = message.encryption();

        et_message.setText(ans+"");
    }

    private void updateView1()
    {

        //To access the message edit text field
        EditText et_message = (EditText)findViewById(R.id.msg);
        String msg = et_message.getText().toString();

        int key = message.getKey();
        message = new Message(msg, key);
        //key and msg are passed to decryption
        String ans = message.decryption();

        et_message.setText(ans+"");

    }
}
