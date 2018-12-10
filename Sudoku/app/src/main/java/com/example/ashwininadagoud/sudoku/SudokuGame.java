package com.example.ashwininadagoud.sudoku;

public class SudokuGame {
    private int[][] nums=new int[9][9];
    private int[][] initialNums=new int[9][9];
    int number;

    public void setNums(int[][] nums){
        for(int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                this.nums[i][j]=nums[i][j];
            }
        }
    }

    public void setNum(int x, int y, int number)
    {
        this.nums[x][y]=number;
    }
    public int[][] getNums(){ return nums; }
    public void setInitialNums(int[][] nums)
    {
        for(int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                this.initialNums[i][j] = nums[i][j];
            }
        }
    }
    public int[][] getInitialNums()
    {
        return initialNums;
    }
    public void removeNum(int x, int y)
    {
        this.nums[x][y]=0;
    }
    public boolean isValid(int x, int y, int number)
    {
        if(isPresentRow(x,number) || isPresentCol(y,number) || isPresentGrid(x,y,number))
            return true;
        else
            return false;
    }
    public boolean isPresentRow(int row,int number){
        boolean isPresent=false;
        for(int i=0;i<9;i++){
            if(nums[row][i]==number) {
                isPresent = true;
            }
        }
        return isPresent;
    }
    public boolean isPresentCol(int col, int number){
        boolean isPresent=false;
        for(int i=0;i<9;i++){
            if(nums[i][col]==number) {
                //System.out.println(i+" "+col);
                isPresent = true;
            }
        }
        return isPresent;
    }
    public boolean isPresentGrid(int row, int col, int number){
        boolean isPresent=false;
        int x1 = 3*(row/3);
        int y1 = 3*(col/3);
        int x2 = x1+2;
        int y2 = y1+2;
        for(int k=x1;k<=x2;k++) {
            for (int l = y1; l <= y2; l++) {
                if (nums[k][l] == number) {
                    isPresent = true;
                }
            }
        }
        return isPresent;
    }
    public boolean solved(){
        boolean isBoardFull = true;
        for(int i = 0; i < 9; i++)
            for(int j = 0; j < 9; j++) {
                if(nums[i][j] == 0){
                    isBoardFull = false;
                }
            }
        return isBoardFull;
    }
}
