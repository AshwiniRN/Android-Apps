package com.example.ashwininadagoud.gasolineapp;

import android.text.InputType;
import android.view.Gravity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.util.TypedValue;
import android.graphics.Color;
import android.content.Context;
import android.view.View;

public class AppInterface extends RelativeLayout //to create a relative layout
{
    private EditText inputPrice, inputGallons, inputSalesTax;
    private TextView outputCost;
    private Button button;

    public AppInterface(Context context, View.OnClickListener buttonHandler)
    {
        super(context);

        final int DP = (int)(getResources().getDisplayMetrics().density);

        //to create a TextView  for labelPrice
        TextView labelPrice = new TextView(context);
        labelPrice.setId(TextView.generateViewId());
        labelPrice.setTextColor(Color.parseColor("#000000"));
        labelPrice.setBackgroundColor(Color.parseColor("#D1F2EB"));
        labelPrice.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        labelPrice.setPadding(10*DP, 10*DP, 10*DP, 10*DP);
        labelPrice.setText("Price");
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(0, 0);
        params.width = 200*DP;
        params.height = RelativeLayout.LayoutParams.WRAP_CONTENT;
        params.leftMargin = 70*DP;
        params.topMargin = 100*DP;
        labelPrice.setLayoutParams(params);
        addView(labelPrice);

        //to create EditText for the user to enter the price
        inputPrice = new EditText(context);
        inputPrice.setId(TextView.generateViewId());
        inputPrice.setTextColor(Color.parseColor("#000000"));
        inputPrice.setBackgroundColor(Color.parseColor("#FCF3CF"));
        inputPrice.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        inputPrice.setPadding(10*DP, 10*DP, 10*DP, 10*DP);
        inputPrice.setHint("0.0");
        inputPrice.setGravity(Gravity.CENTER);
        inputPrice.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
        params = new RelativeLayout.LayoutParams(0, 0);
        params.width = 200*DP;
        params.height = RelativeLayout.LayoutParams.WRAP_CONTENT;
        params.addRule(RelativeLayout.RIGHT_OF, labelPrice.getId());
        params.addRule(RelativeLayout.ALIGN_BOTTOM, labelPrice.getId());
        inputPrice.setLayoutParams(params);
        addView(inputPrice);

        //to create TextView for Gallons
        TextView labelGallons = new TextView(context);
        labelGallons.setId(TextView.generateViewId());
        labelGallons.setTextColor(Color.parseColor("#000000"));
        labelGallons.setBackgroundColor(Color.parseColor("#D1F2EB"));
        labelGallons.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        labelGallons.setPadding(10*DP, 10*DP, 10*DP, 10*DP);
        labelGallons.setText("Gallons");
        params = new RelativeLayout.LayoutParams(0, 0);
        params.width = 200*DP;
        params.height = RelativeLayout.LayoutParams.WRAP_CONTENT;
        params.addRule(RelativeLayout.BELOW, labelPrice.getId());
        params.addRule(RelativeLayout.ALIGN_LEFT, labelPrice.getId());
        params.topMargin = 30*DP;
        labelGallons.setLayoutParams(params);
        addView(labelGallons);

        //to create EditText for the user to enter number of gallons
        inputGallons = new EditText(context);
        inputGallons.setId(TextView.generateViewId());
        inputGallons.setTextColor(Color.parseColor("#000000"));
        inputGallons.setBackgroundColor(Color.parseColor("#FCF3CF"));
        inputGallons.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        inputGallons.setPadding(10*DP, 10*DP, 10*DP, 10*DP);
        inputGallons.setHint("0.0");
        inputGallons.setGravity(Gravity.CENTER);
        inputGallons.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
        params = new RelativeLayout.LayoutParams(0, 0);
        params.width = 200*DP;
        params.height = RelativeLayout.LayoutParams.WRAP_CONTENT;
        params.addRule(RelativeLayout.RIGHT_OF, labelGallons.getId());
        params.addRule(RelativeLayout.ALIGN_BOTTOM, labelGallons.getId());
        inputGallons.setLayoutParams(params);
        addView(inputGallons);

        //to create TextView for sales tax label
        TextView labelSalesTax = new TextView(context);
        labelSalesTax.setId(TextView.generateViewId());
        labelSalesTax.setTextColor(Color.parseColor("#000000"));
        labelSalesTax.setBackgroundColor(Color.parseColor("#D1F2EB"));
        labelSalesTax.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        labelSalesTax.setPadding(10*DP, 10*DP, 10*DP, 10*DP);
        labelSalesTax.setText("Sales Tax");
        params = new RelativeLayout.LayoutParams(0, 0);
        params.width = 200*DP;
        params.height = RelativeLayout.LayoutParams.WRAP_CONTENT;
        params.addRule(RelativeLayout.BELOW, labelGallons.getId());
        params.addRule(RelativeLayout.ALIGN_LEFT, labelGallons.getId());
        params.topMargin = 30*DP;
        labelSalesTax.setLayoutParams(params);
        addView(labelSalesTax);

        //to create EditText for the user to enter sales tax in percentage
        inputSalesTax = new EditText(context);
        inputSalesTax.setId(TextView.generateViewId());
        inputSalesTax.setTextColor(Color.parseColor("#000000"));
        inputSalesTax.setBackgroundColor(Color.parseColor("#FCF3CF"));
        inputSalesTax.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        inputSalesTax.setPadding(10*DP, 10*DP, 10*DP, 10*DP);
        inputSalesTax.setHint("0.0");
        inputSalesTax.setGravity(Gravity.CENTER);
        inputSalesTax.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
        params = new RelativeLayout.LayoutParams(0, 0);
        params.width = 200*DP;;
        params.height = RelativeLayout.LayoutParams.WRAP_CONTENT;
        params.addRule(RelativeLayout.RIGHT_OF, labelSalesTax.getId());
        params.addRule(RelativeLayout.ALIGN_BOTTOM, labelSalesTax.getId());
        inputSalesTax.setLayoutParams(params);
        addView(inputSalesTax);

        //to create a TextView for label cost
        TextView labelCost = new TextView(context);
        labelCost.setId(TextView.generateViewId());
        labelCost.setTextColor(Color.parseColor("#000000"));
        labelCost.setBackgroundColor(Color.parseColor("#D1F2EB"));
        labelCost.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        labelCost.setPadding(10*DP, 10*DP, 10*DP, 10*DP);
        labelCost.setText("Cost");
        params = new RelativeLayout.LayoutParams(0, 0);
        params.width = 200*DP;
        params.height = RelativeLayout.LayoutParams.WRAP_CONTENT;
        params.addRule(RelativeLayout.BELOW, labelSalesTax.getId());
        params.addRule(RelativeLayout.ALIGN_LEFT, labelSalesTax.getId());
        params.topMargin = 30*DP;
        labelCost.setLayoutParams(params);
        addView(labelCost);

        //to create TextView to dispay the total cost
        outputCost = new TextView(context);
        outputCost.setId(TextView.generateViewId());
        outputCost.setTextColor(Color.parseColor("#000000"));
        outputCost.setBackgroundColor(Color.parseColor("#FCF3CF"));
        outputCost.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        outputCost.setPadding(10*DP, 10*DP, 10*DP, 10*DP);
        outputCost.setText("0.0");
        outputCost.setGravity(Gravity.CENTER);
        params = new RelativeLayout.LayoutParams(0, 0);
        params.width = 200*DP;;
        params.height = RelativeLayout.LayoutParams.WRAP_CONTENT;
        params.addRule(RelativeLayout.RIGHT_OF, labelCost.getId());
        params.addRule(RelativeLayout.ALIGN_BOTTOM, labelCost.getId());
        outputCost.setLayoutParams(params);
        addView(outputCost);

        // a button for calculate the output
        button = new Button(context);
        button.setId(TextView.generateViewId());
        button.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        button.setTextColor(Color.parseColor("#000000"));
        button.setPadding(10*DP, 10*DP, 10*DP, 10*DP);
        button.setText("Submit");
        params = new RelativeLayout.LayoutParams(0, 0);
        params.width = 200*DP;;
        params.height = 100*DP;
        params.topMargin = 40*DP;
        params.addRule(RelativeLayout.BELOW, labelCost.getId());
        params.addRule(RelativeLayout.CENTER_HORIZONTAL);
        button.setLayoutParams(params);
        params.topMargin=60*DP;
        button.setOnClickListener(buttonHandler);
        addView(button);
    }

    public void setEvenHandlers(View.OnClickListener buttonHandler)
    {
        button.setOnClickListener(buttonHandler);
    }

    public float getPrice() //get method for price
    {
        String priceString = inputPrice.getText().toString();
        float price = Float.parseFloat(priceString);
        return price;
    }

    public float getGallons() //get method for gallons
    {
        String gallonsString = inputGallons.getText().toString();
        float gallons = Float.parseFloat(gallonsString);
        return gallons;
    }

    public float getSaleTax() //get method for sales tax
    {
        String salesTaxString = inputSalesTax.getText().toString();
        float salesTax = Float.parseFloat(salesTaxString);
        return salesTax;
    }

    public void setCost(float cost) //set method for final cost
    {
        outputCost.setText(cost+"");
    }
}
