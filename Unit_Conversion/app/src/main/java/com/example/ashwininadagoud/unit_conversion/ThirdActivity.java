package com.example.ashwininadagoud.unit_conversion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        EditText et_feet = (EditText) findViewById(R.id.feet);
        TextChangeHandler temp = new TextChangeHandler();
        et_feet.addTextChangedListener(temp);

        EditText et_meter = (EditText) findViewById(R.id.meter);
        TextChangeHandler1 temp1 = new TextChangeHandler1();
        et_meter.addTextChangedListener(temp1);

    }

    //conversion of feet to meter
    private class TextChangeHandler implements TextWatcher
    {
        public void afterTextChanged(Editable e)
        {
            try {

                EditText et_feet = (EditText) findViewById(R.id.feet);
                String feetString = et_feet.getText().toString();
                float feet = Float.parseFloat(feetString);

                double answerFeet = feet * 0.3048;

                EditText et_feetOutput = (EditText) findViewById(R.id.feetOutput);
                et_feetOutput.setText(answerFeet + "");
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

    //conversion  of meter to feet
    private class TextChangeHandler1 implements TextWatcher
    {
        public void afterTextChanged(Editable e)
        {
            try {

                EditText et_meter = (EditText) findViewById(R.id.meter);
                String meterString = et_meter.getText().toString();
                float meter = Float.parseFloat(meterString);

                double answerMeter = meter * 3.28084;

                EditText et_meterOutput = (EditText) findViewById(R.id.meterOutput);
                et_meterOutput.setText(answerMeter + "");
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

