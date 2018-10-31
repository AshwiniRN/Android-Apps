package com.example.ashwininadagoud.onlineshopping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.submit);  //to access the button
        ButtonHandler temp = new ButtonHandler(); //to create an object for ButtonHandler
        button.setOnClickListener(temp);
    }

    private class ButtonHandler implements View.OnClickListener {

        private int flagWarranty,flagInsurance,flagDelivery;
        public void onClick(View v) {

            //to access the inputprice and parse it to String
            EditText priceEditText = (EditText) findViewById(R.id.inputPrice);
            String priceString = priceEditText.getText().toString();

            //if the input is invalid
            if(priceString.equals("")||priceString.equals("."))
            {
                TextView outputCostTextView = (TextView) findViewById(R.id.outputCost);
                outputCostTextView.setText("");
            }

            //if the input is valid
            else {

                double total = Double.parseDouble(priceString);

                //to access the toggle button
                ToggleButton warrantyToggleButton = (ToggleButton) findViewById(R.id.inputWarranty);
                if (warrantyToggleButton.isChecked()) //if the toggle button is checked
                {
                    flagWarranty = -1;
                }
                else  //if the toggle button is not checked
                {
                    flagWarranty = 0;
                }

                //to access the switch
                Switch insuranceSwitch = (Switch) findViewById(R.id.inputInsurance);
                if (insuranceSwitch.isChecked()) //if the switch is checked
                {
                    flagInsurance = -2;
                }
                else //if the switch is not checked
                {
                    flagInsurance = 0;
                }

                //to access the spinner

                Spinner deliverySpinner = (Spinner) findViewById(R.id.inputDelivery);
                String delivery = (String) deliverySpinner.getSelectedItem();


                //if selected item is next day
                if (delivery.equals("Next day")) {

                    flagDelivery = -3;

                }
                //if delivery is second day
                else if (delivery.equals("Second day")) {
                    flagDelivery = -4;

                }
                //if delivery is normal day
                else {
                    flagDelivery = -5;

                }

                //to create an object for TotalCost
                TotalCalculator cost = new TotalCalculator();
                cost.set(total);
                cost.set(flagWarranty, flagInsurance, flagDelivery);
                double finalCost = cost.getTotal();

                double finalTotal = finalCost;

                finalTotal = Math.round(finalTotal * 100);
                //to round the output to two decimal places
                finalTotal = finalTotal / 100;

                //to access the outputCost and display the output
                TextView outputCostTextView = (TextView) findViewById(R.id.outputCost);
                outputCostTextView.setText(finalTotal + "");
            }


        }
    }
}
