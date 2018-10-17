package com.example.ashwininadagoud.color_code;

import android.widget.EditText;
import android.widget.TextView;
import android.text.TextWatcher;
import android.text.Editable;
import android.graphics.Color;

public class ColorCode {

    EditText red,green,blue;

    int r,g,b;

    TextView textViewSquare;

    public ColorCode(MainActivity m)
    { //fetches input values form red, green and blue edittext fields
        red =(EditText)m.findViewById(R.id.inputRed);
        green=(EditText)m.findViewById(R.id.inputGreen);
        blue=(EditText)m.findViewById(R.id.inputBlue);

        textViewSquare=(TextView)m.findViewById(R.id.labelColor);

        //text watcher for red
        red.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void afterTextChanged(Editable s)
            {
                if(red.getText().length()>0)
                {
                    r = Integer.parseInt(red.getText().toString());
                    if (r>=0 && r<=255)
                    {
                    }
                    else if(r<0)
                    {

                        red.setText("0");
                        r=0;

                    }
                    else
                        {

                        red.setText("255");
                        r=255;

                    }
                    textViewSquare.setBackgroundColor(Color.rgb(r,g,b));

                }

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start,int count, int after)
            {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,int before, int count)
            {

            }
        });

//text watcher for green
        green.addTextChangedListener(new TextWatcher()
        {

            @Override
            public void afterTextChanged(Editable s)
            {
                if(green.getText().length()>0)
                {
                    g = Integer.parseInt(green.getText().toString());
                    if (g>=0 && g<=255)
                    {
                    }
                    else if(g<0)
                    {

                        green.setText("0");
                        g=0;

                    }
                    else
                        {
                        green.setText("255");
                        g=255;
                    }

                    textViewSquare.setBackgroundColor(Color.rgb(r,g,b));
                }

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start,int count, int after)
            {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,int before, int count)
            {

            }
        });

    //text watcher for blue
        blue.addTextChangedListener(new TextWatcher()
        {

            @Override
            public void afterTextChanged(Editable s)
            {
                if(blue.getText().length()>0)
                {
                    b= Integer.parseInt(blue.getText().toString());
                    if (b>=0 && b<=255)
                    {
                    }
                    else if(b<0)
                    {
                        blue.setText("0");
                        b=0;

                    }
                    else
                    {
                        blue.setText("255");
                        b=255;
                    }
                    textViewSquare.setBackgroundColor(Color.rgb(r,g,b));
                }

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start,int count, int after)
            {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,int before, int count)
            {

            }
        });
    }


}
