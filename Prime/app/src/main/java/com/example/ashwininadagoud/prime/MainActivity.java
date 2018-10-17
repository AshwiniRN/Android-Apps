package com.example.ashwininadagoud.prime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //function run refereing to the onclick run button in the layout
    public void run(View v)
    {
        EditText inputPrimeEditText = (EditText) findViewById(R.id.inputPrime);
        String inputPrimeString = inputPrimeEditText.getText().toString();

        int inputPrime = Integer.parseInt(inputPrimeString);

   
        PrimeNumGenerate pg = new PrimeNumGenerate();//creates new object
        pg.set(inputPrime);//the object calls set method
        String prime = pg.get();// the object calls get method

        TextView primeTextView = (TextView)findViewById(R.id.outputFinal);
        primeTextView.setText(prime);
    }
}

