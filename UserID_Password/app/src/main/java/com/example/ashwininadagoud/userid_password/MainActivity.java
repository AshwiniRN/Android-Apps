package com.example.ashwininadagoud.userid_password;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//this function is called when the generate button is clicked
    public void generate(View v) {

        UserGenerate generate = new UserGenerate(); //creates an object

//to fetch values from the fNameEditText field and parse them into string
        EditText fNameEditText = (EditText) findViewById(R.id.inputFname);
        String fNameString = fNameEditText.getText().toString(); 
        
//to fetch values from the lNameEditText field and parse them into string
        EditText lNameEditText = (EditText) findViewById(R.id.inputLname);
        String lNameString = lNameEditText.getText().toString();

//to fetch values from the bitrhDateEditText field and parse them into string
        EditText birthDateEditText = (EditText) findViewById(R.id.inputBirthDate);
        String birthDateString = birthDateEditText.getText().toString();

        generate.setFirstName(fNameString);
        generate.setLastName(lNameString);
        generate.setDateOfBirth(birthDateString);
        
//object calls getuserId and it is stored in new variable
        String userId = generate.getUserId();

        TextView userIdStr = (TextView) findViewById(R.id.outputUid);
        userIdStr.setText(userId);

//object calls getpassword and it is stored in new variable
        String password = generate.getPassword();

        TextView outputPasswordTextView = (TextView) findViewById(R.id.outputPassword);
        outputPasswordTextView.setText(password);
    }
}


