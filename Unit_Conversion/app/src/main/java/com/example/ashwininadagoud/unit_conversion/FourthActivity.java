package com.example.ashwininadagoud.unit_conversion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class FourthActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        EditText et_inch = (EditText) findViewById(R.id.inch);
        TextChangeHandler temp = new TextChangeHandler();
        et_inch.addTextChangedListener(temp);

        EditText et_centimeter = (EditText) findViewById(R.id.centimeter);
        TextChangeHandler1 temp1 = new TextChangeHandler1();
        et_centimeter.addTextChangedListener(temp1);

    }

    //conversion of inch to centimeter
    private class TextChangeHandler implements TextWatcher
    {
        public void afterTextChanged(Editable e)
        {
            try {

                EditText et_inch = (EditText) findViewById(R.id.inch);
                String inchString = et_inch.getText().toString();
                float inch = Float.parseFloat(inchString);

                double answerInch = inch * 2.54;

                EditText et_inchOutput = (EditText) findViewById(R.id.inchOutput);
                et_inchOutput.setText(answerInch + "");
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

    //Conversion of centimeter to inch
    private class TextChangeHandler1 implements TextWatcher
    {
        public void afterTextChanged(Editable e)
        {
            try {

                EditText et_centimeter = (EditText) findViewById(R.id.centimeter);
                String centimeterString = et_centimeter.getText().toString();
                float centimeter = Float.parseFloat(centimeterString);

                double answerCentimeter = centimeter * 0.393701;

                EditText et_centmeterOutput = (EditText) findViewById(R.id.centimeterOutput);
                et_centmeterOutput.setText(answerCentimeter + "");
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


