package com.example.ashwininadagoud.course_grades;

public class ScoreCalculator {
    private float assignment;
    private float midterm;
    private float finals;
    private float finalScore=0;

    // to set the values for assignment, midterm and final exam
    public void setValues(float assignment, float midterm, float finals) {
        this.assignment = assignment;
        this.midterm = midterm;
        this.finals = finals;

    }

    public float get() {

        //if the inputs are greater than or equal to zero
        if(assignment>=0 && midterm>=0 && finals>=0)
        {
            finalScore = (float) ((60 * (assignment / 200)) + (15 * (midterm / 100)) + (25 * (finals / 100)));
        }
        else
        {
            //if the inputs are less than zero
            finalScore = -1;
        }

        return finalScore;

    }

    public String getGrade()
    {
        //to check the given conditions for grading
        if(finalScore >= 90 && finalScore <= 100)
        {
            return "A";

        }
        else if (finalScore >= 80 && finalScore <90)
        {
            return "B";
        }
        else if (finalScore >= 70 && finalScore < 80)
        {
            return "C";
        }
        else if(finalScore >=0 && finalScore < 70)
        {
            return "D";
        }
        else
        {
            return "Invalid";
        }
    }
}
