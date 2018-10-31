package com.example.ashwininadagoud.gasolineapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CostCalculator costCalculator;
    AppInterface appInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        costCalculator = new CostCalculator(); //to create an object to cost calculator

        ButtonHandler buttonHandler = new ButtonHandler();

        appInterface = new AppInterface(this, buttonHandler);//to create an object for AppInterface

        setContentView(appInterface);//setContentView as appInterface
    }

    //on button click
    private class ButtonHandler implements View.OnClickListener{
        public void onClick(View v)
        {
            //object calls getPrice,getGallons,getSaleTax
            float price = appInterface.getPrice();
            float gallons = appInterface.getGallons();
            float salesTax = appInterface.getSaleTax();

            //object calls setPrice,setGallons,setSalesTax
            costCalculator.setPrice(price);
            costCalculator.setGallons(gallons);
            costCalculator.setSalesTax(salesTax);
            float cost = costCalculator.getCost();

            //cost is displayed through appInteface
            appInterface.setCost(cost);
        }
    }
}
