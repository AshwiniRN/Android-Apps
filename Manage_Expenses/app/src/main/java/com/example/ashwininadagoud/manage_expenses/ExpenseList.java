package com.example.ashwininadagoud.manage_expenses;

public class ExpenseList {

    private String name;
    private float price;
    private String date;

    public ExpenseList(String name, float price, String date)
    {
        this.name=name;
        this.price=price;
        this.date=date;
    }
    public String getName()//Get method for name
    {
        return name;
    }
    public float getPrice()//Get method for price
    {
        return price;
    }

    public String getDate()//Get method for date
    {
        return date;
    }

}

