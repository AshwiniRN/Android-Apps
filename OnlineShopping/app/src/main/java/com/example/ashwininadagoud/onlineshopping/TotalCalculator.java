package com.example.ashwininadagoud.onlineshopping;

public class TotalCalculator {

    private double total=0;
    private double totalCost=0;
    private double warranty=0, insurance=0, deliveryNextDay=0, deliverySecondDay=0, deliveryNormal=0;
    private int flagWarranty,flagInsurance,flagDelivery;


    public void set(double total)
    {
        this.total = total;

    }

    public void set(int flagWarranty, int flagInsurance, int flagDelivery)
    {
        this.flagWarranty=flagWarranty;
        this.flagInsurance=flagInsurance;
        this.flagDelivery=flagDelivery;
    }

    public double getTotal()
    {
        insurance=0;
        warranty=0;

        //if total is greater than or equal to zero
        if(total>=0) {

            //if warranty is -1
            if (flagWarranty == -1)
            {
                warranty = 0.1 * total;
            }
            else
            {
                warranty=0;
            }

            //if insurance is -2
            if (flagInsurance == -2)
            {
                insurance = 0.05 * total;
            }
            else
            {
                insurance=0;
            }

            //to check the conditions of spinner and set the values
            if (flagDelivery == -3)
            {
                deliveryNextDay = 20;
            }
            if (flagDelivery == -4)
            {
                deliverySecondDay = 10;
            }
            if (flagDelivery == -5)
            {
                deliveryNormal = 5;
            }

        }
        //to calculate the total cost
        totalCost = total + warranty + insurance + deliveryNextDay + deliverySecondDay + deliveryNormal;
        return totalCost;

    }

}
