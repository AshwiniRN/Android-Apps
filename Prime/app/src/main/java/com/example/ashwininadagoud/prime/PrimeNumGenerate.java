package com.example.ashwininadagoud.prime;

import java.util.Arrays;


public class PrimeNumGenerate {

    private int inputPrime;

    public PrimeNumGenerate() {

    }

    //to set the values
    public void set(int inputPrime) {

        this.inputPrime = inputPrime;
    }

    //return the values as a string
    public String get()
    {

        String result = " ";
        int n = 1;
        int c = 0;
        int i;
        int k = 1;

        while(n<=inputPrime) {

            for(i = 1,c = 0; i <= k; i++)
            {
                if(k%i == 0)  //checking for factors
                    c++;
            }
            if(c == 2)
            {
                result+=Integer.toString(k)+"\n";//displaying the result as a string, each number in new line
                n++;
            }

            k++;
        }
        return result; //return result
    }

}
