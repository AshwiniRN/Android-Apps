package com.example.ashwininadagoud.sudokugame;

public class Game {

    public static int board[][];
    Sudoku s = new Sudoku(); // object creation for sudoku

    public Game() {

        board = s.generate(); //to pass the values to the board
    }

}