package com.example.ashwininadagoud.sem_cost;

public class Calculate {
    private int credit;
    private int id;
    private int id1;
    private int status;
    private int optCost;

    //function set is used to set values
    public void set(int credit, int id, int id1, int otherCost)
    {
        this.credit = credit;
        this.id=id;
        this.id1=id1;
        this.optCost = optCost;
    }
//get function to return the values
    public int get()
    {
        int radioAcademicStatus;
        if (id == R.id.graduate)
            radioAcademicStatus = 400;
        
        else if (id == R.id.undergraduate)
            radioAcademicStatus = 300;
       
        else
            radioAcademicStatus = 200;
        
        int academicStatus = (int) (credit * radioAcademicStatus);


        if(id1 == R.id.instate)
            status = academicStatus;
        else
            status = (int) ( 1.5 * academicStatus);

        int total = status + optCost;

        return total;
    }
}
