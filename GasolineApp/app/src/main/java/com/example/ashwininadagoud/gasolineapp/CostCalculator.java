package com.example.ashwininadagoud.gasolineapp;

public class CostCalculator {
    private float price, gallons, salesTax;
    private float sum=0,amount=0,total_Cost=0;

    public void setPrice(float price) //set method for price
    {
        this.price = price;
    }
    public void setGallons(float gallons) //set method for Gallons
    {
        this.gallons = gallons;
    }
    public void setSalesTax(float salesTax) //set method for sales tax
    {
        this.salesTax = salesTax;
    }
    public float getCost()
    {
        //calculates sum and amount then add them
        sum = price*gallons;
        amount = (sum * (salesTax /100));
        total_Cost = sum + amount;

        float totalCost = total_Cost;

        totalCost = Math.round(totalCost * 100);
        totalCost = totalCost/100;
        return totalCost; //return call for  total cost
    }
}
