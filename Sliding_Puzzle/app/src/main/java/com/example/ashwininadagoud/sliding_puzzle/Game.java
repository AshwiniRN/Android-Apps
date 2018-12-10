package com.example.ashwininadagoud.sliding_puzzle;

import java.util.Random;

public class Game {
    private final int TOTAL = 3;
    private final int SIZE = 9;

    private Random random;

    private String[][] solutions = {{"1", "2", "3", "4", "5", "6", "7", "8", ""},
            {"1", "2", "3", "4", "5", "6", "7", "8", ""},
            {"1", "2", "3", "4", "5", "6", "7", "8", ""}};

    private String[][] problems;
    private String[] current;
    private String[] solution;

    public Game() {
        random = new Random(); //Creates a random game

        problems = new String[TOTAL][SIZE];
        mix(solutions, problems);

        int select = random.nextInt(TOTAL);

        current = new String[SIZE];
        solution = new String[SIZE];


        for (int i = 0; i < SIZE; i++) {
            current[i] = problems[select][i];
            solution[i] = solutions[select][i];
        }


    }

    public String[] getCurrent() {
        return current;
    }

    public boolean solved() {
        for (int i = 0; i < SIZE; i++)
            if (!current[i].equals(solution[i]))
                return false;

        return true;
    }


    private void mix(String[][] solutions, String[][] problems) {
        for (int i = 0; i < TOTAL; i++)
            mix(solutions[i], problems[i]);

    }

    private void mix(String[] solution, String[] problem) {
        for (int i = 0; i < solution.length; i++)
            problem[i] = solution[i];
        for (int i = problem.length - 1; i >= 0; i--) {
            int j = random.nextInt(i + 1);
            String temp = problem[i];
            problem[i] = problem[j];
            problem[j] = temp;

        }
    }

    //A method exchange checks for each combinations and compares them to the solutions
    public void exchange(int i, int j) {

        if(i==0 && j==1)
        {
            if(current[i].equals("") || current[j].equals("")) {
                String temp = current[i];
                current[i] = current[j];
                current[j] = temp;
            }
            else
            {
                current[i]=current[i];
                current[j]=current[j];
            }

        }
        if(i==0 && j==3)
        {
            if (current[i].equals("") || current[j].equals("")) {
                String temp = current[i];
                current[i] = current[j];
                current[j] = temp;
            } else {
                current[i] = current[i];
                current[j] = current[j];
            }
        }
        if(i==1 && j==0)
        {
            if(current[i].equals("") || current[j].equals("")) {
                String temp = current[i];
                current[i] = current[j];
                current[j] = temp;
            }
            else
            {
                current[i]=current[i];
                current[j]=current[j];
            }


        }
        if(i==1 && j==2)
        {
            if(current[i].equals("") || current[j].equals("")) {
                String temp = current[i];
                current[i] = current[j];
                current[j] = temp;
            }
            else
            {
                current[i]=current[i];
                current[j]=current[j];
            }


        }
        if(i==1 && j==4)
        {
            if(current[i].equals("") || current[j].equals("")) {
                String temp = current[i];
                current[i] = current[j];
                current[j] = temp;
            }
            else
            {
                current[i]=current[i];
                current[j]=current[j];
            }


        }

        if(i==2 && j==1)
        {
            if(current[i].equals("") || current[j].equals("")) {
                String temp = current[i];
                current[i] = current[j];
                current[j] = temp;
            }
            else
            {
                current[i]=current[i];
                current[j]=current[j];
            }

        }
        if(i==2 && j==5)
        {
            if(current[i].equals("") || current[j].equals("")) {
                String temp = current[i];
                current[i] = current[j];
                current[j] = temp;
            }
            else
            {
                current[i]=current[i];
                current[j]=current[j];
            }
        }
        if(i==3 && j==0)
        {
            if(current[i].equals("") || current[j].equals("")) {
                String temp = current[i];
                current[i] = current[j];
                current[j] = temp;
            }
            else
            {
                current[i]=current[i];
                current[j]=current[j];
            }
        }
        if(i==3 && j==4)
        {
            if(current[i].equals("") || current[j].equals("")) {
                String temp = current[i];
                current[i] = current[j];
                current[j] = temp;
            }
            else
            {
                current[i]=current[i];
                current[j]=current[j];
            }
        }
        if(i==3 && j==6)
        {
            if(current[i].equals("") || current[j].equals("")) {
                String temp = current[i];
                current[i] = current[j];
                current[j] = temp;
            }
            else
            {
                current[i]=current[i];
                current[j]=current[j];
            }
        }
        if(i==4 && j==3)
        {
            if(current[i].equals("") || current[j].equals("")) {
                String temp = current[i];
                current[i] = current[j];
                current[j] = temp;
            }
            else
            {
                current[i]=current[i];
                current[j]=current[j];
            }
        }
        if(i==4 && j==1)
        {
            if(current[i].equals("") || current[j].equals("")) {
                String temp = current[i];
                current[i] = current[j];
                current[j] = temp;
            }
            else
            {
                current[i]=current[i];
                current[j]=current[j];
            }
        }
        if(i==4 && j==5)
        {
            if(current[i].equals("") || current[j].equals("")) {
                String temp = current[i];
                current[i] = current[j];
                current[j] = temp;
            }
            else
            {
                current[i]=current[i];
                current[j]=current[j];
            }
        }
        if(i==4 && j==7)
        {
            if(current[i].equals("") || current[j].equals("")) {
                String temp = current[i];
                current[i] = current[j];
                current[j] = temp;
            }
            else
            {
                current[i]=current[i];
                current[j]=current[j];
            }
        }
        if(i==5 && j==4)
        {
            if(current[i].equals("") || current[j].equals("")) {
                String temp = current[i];
                current[i] = current[j];
                current[j] = temp;
            }
            else
            {
                current[i]=current[i];
                current[j]=current[j];
            }
        }
        if(i==5 && j==2)
        {
            if(current[i].equals("") || current[j].equals("")) {
                String temp = current[i];
                current[i] = current[j];
                current[j] = temp;
            }
            else
            {
                current[i]=current[i];
                current[j]=current[j];
            }
        }
        if(i==5 && j==8)
        {
            if(current[i].equals("") || current[j].equals("")) {
                String temp = current[i];
                current[i] = current[j];
                current[j] = temp;
            }
            else
            {
                current[i]=current[i];
                current[j]=current[j];
            }
        }
        if(i==6 && j==3)
        {
            if(current[i].equals("") || current[j].equals("")) {
                String temp = current[i];
                current[i] = current[j];
                current[j] = temp;
            }
            else
            {
                current[i]=current[i];
                current[j]=current[j];
            }
        }
        if(i==6 && j==7)
        {
            if(current[i].equals("") || current[j].equals("")) {
                String temp = current[i];
                current[i] = current[j];
                current[j] = temp;
            }
            else
            {
                current[i]=current[i];
                current[j]=current[j];
            }
        }
        if(i==7 && j==6)
        {
            if(current[i].equals("") || current[j].equals("")) {
                String temp = current[i];
                current[i] = current[j];
                current[j] = temp;
            }
            else
            {
                current[i]=current[i];
                current[j]=current[j];
            }
        }
        if(i==7 && j==4)
        {
            if(current[i].equals("") || current[j].equals("")) {
                String temp = current[i];
                current[i] = current[j];
                current[j] = temp;
            }
            else
            {
                current[i]=current[i];
                current[j]=current[j];
            }
        }
        if(i==7 && j==8)
        {
            if(current[i].equals("") || current[j].equals("")) {
                String temp = current[i];
                current[i] = current[j];
                current[j] = temp;
            }
            else
            {
                current[i]=current[i];
                current[j]=current[j];
            }
        }
        if(i==8 && j==7)
        {
            if(current[i].equals("") || current[j].equals("")) {
                String temp = current[i];
                current[i] = current[j];
                current[j] = temp;
            }
            else
            {
                current[i]=current[i];
                current[j]=current[j];
            }
        }
        if(i==8 && j==5)
        {
            if(current[i].equals("") || current[j].equals("")) {
                String temp = current[i];
                current[i] = current[j];
                current[j] = temp;
            }
            else
            {
                current[i]=current[i];
                current[j]=current[j];
            }
        }
    }
}
