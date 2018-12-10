package com.example.ashwininadagoud.encrypt_decrypt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private Message message = MainActivity.message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_two);
        updateView();
    }
    public void back(View v)
    {
        updateMessage();
        SecondActivity.this.finish();
    }
    private void updateView()
    {
        EditText et_message =(EditText)findViewById(R.id.inputKey);
        et_message.setText(message.getKey()+"");

    }
    private void updateMessage()
    {
        EditText et_key =(EditText)findViewById(R.id.inputKey);
        String msgString = et_key.getText().toString();
        int key = Integer.parseInt(msgString);
        message.setKey(key);
    }
}
