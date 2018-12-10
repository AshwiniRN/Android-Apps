package com.example.ashwininadagoud.unit_conversion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        EditText et_mile = (EditText) findViewById(R.id.mile);
        TextChangeHandler temp = new TextChangeHandler();
        et_mile.addTextChangedListener(temp);

        EditText et_kiloMeter = (EditText) findViewById(R.id.kilometer);
        TextChangeHandler1 temp1 = new TextChangeHandler1();
        et_kiloMeter.addTextChangedListener(temp1);

    }

    //conversion of mile to kilometer
    private class TextChangeHandler implements TextWatcher
    {
        public void afterTextChanged(Editable e)
        {
            try {

                EditText et_mile = (EditText) findViewById(R.id.mile);
                String mileString = et_mile.getText().toString();
                float mile = Float.parseFloat(mileString);

                double answerKilometer = mile * 1.609344;

                EditText et_mileOutput = (EditText) findViewById(R.id.mileOutput);
                et_mileOutput.setText(answerKilometer + "");
            }

            catch (Exception a)
            {

            }

        }
        public void beforeTextChanged(CharSequence s, int start, int count, int after)
        {

        }
        public void onTextChanged(CharSequence s, int start, int before, int after)
        {

        }

    }

    //conversion of kilometer to mile
    private class TextChangeHandler1 implements TextWatcher
    {
        public void afterTextChanged(Editable e)
        {
            try {

                EditText et_kiloMeter = (EditText) findViewById(R.id.kilometer);
                String kiloMeterString = et_kiloMeter.getText().toString();
                float kiloMeter = Float.parseFloat(kiloMeterString);

                double answerMile = kiloMeter * 0.621371;

                EditText et_kiloMeterOutput = (EditText) findViewById(R.id.kilometerOutput);
                et_kiloMeterOutput.setText(answerMile + "");
            }

            catch (Exception a)
            {

            }


        }
        public void beforeTextChanged(CharSequence s, int start, int count, int after)
        {

        }
        public void onTextChanged(CharSequence s, int start, int before, int after)
        {

        }

    }


    public void back(View view)
    {
        finish();
    }

}
