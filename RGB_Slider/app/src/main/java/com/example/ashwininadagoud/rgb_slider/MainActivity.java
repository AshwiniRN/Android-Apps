package com.example.ashwininadagoud.rgb_slider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    int red,green,blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //to access the Red seekbar
        SeekBar redSlider = (SeekBar) findViewById(R.id.slideRed);
        ChangeHandler temp = new ChangeHandler(); // to create an object for ChangeHandler
        redSlider.setOnSeekBarChangeListener(temp); //to attach object to red slider

        //to access the Green seekbar
        SeekBar greenSlider = (SeekBar) findViewById(R.id.slideGreen);
        ChangeHandler1 temp1 = new ChangeHandler1(); //to create an object for ChangeHandler
        greenSlider.setOnSeekBarChangeListener(temp1); //to attach object to green slider

        //to access the Blue seekbar
        SeekBar blueSlider = (SeekBar) findViewById(R.id.slideBlue);
        ChangeHandler2 temp2 = new ChangeHandler2(); //to create an object for ChangeHandler
        blueSlider.setOnSeekBarChangeListener(temp2); //to attach object to blue slider

    }

    private class ChangeHandler implements SeekBar.OnSeekBarChangeListener {
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
        {
            //to check the condition for red
            if (progress >= 0) {

                red = progress;

                TextView redTextView = (TextView)findViewById(R.id.inputRed);
                redTextView.setText(red+"");

                TextView colorView = (TextView) findViewById(R.id.outputText);
                colorView.setBackgroundColor(Color.rgb(red, green, blue));// to add color to the colorView


            }

        }


        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    }


    private class ChangeHandler1 implements SeekBar.OnSeekBarChangeListener {
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
        {
            //to check the condition for green
            if (progress >= 0) {

                green = progress;

                TextView redTextView = (TextView)findViewById(R.id.inputGreen);
                redTextView.setText(green+"");

                TextView colorView = (TextView) findViewById(R.id.outputText);
                colorView.setBackgroundColor(Color.rgb(red, green, blue)); // to add color to the colorView
            }

        }


        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    }

    private class ChangeHandler2 implements SeekBar.OnSeekBarChangeListener {
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
        {
            //to check the condition for blue
            if (progress >= 0) {

                blue = progress;

                TextView redTextView = (TextView)findViewById(R.id.inputBlue);
                redTextView.setText(blue+"");

                TextView colorView = (TextView) findViewById(R.id.outputText);
                colorView.setBackgroundColor(Color.rgb(red, green, blue)); // to add color to the colorView

            }

        }


        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    }
}
