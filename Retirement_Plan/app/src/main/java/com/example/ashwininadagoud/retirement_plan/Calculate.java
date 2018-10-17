package com.example.ashwininadagoud.retirement_plan;

public class Calculate {
    private float inputPrincipal;
    private float inputAnnualAddition;
    private float inputYears;
    private float returnRate;

    public Calculate(String principal, String annualAddition, String years, String rate)
    {  //set values
        this.inputPrincipal=Float.parseFloat(principal);
        this.inputAnnualAddition = Float.parseFloat(annualAddition);
        this.inputYears = Float.parseFloat(years);
        this.returnRate = Float.parseFloat(rate);
    }
    public float getTotal()
    { //formula to calculate compound interest which is rounded to the nearest integer
        return (float) ((inputPrincipal * Math.pow((1 + returnRate / 100), inputYears) + (inputAnnualAddition * (Math.pow((1 + returnRate / 100), inputYears) - 1) / (returnRate / 100))));
    }
}
