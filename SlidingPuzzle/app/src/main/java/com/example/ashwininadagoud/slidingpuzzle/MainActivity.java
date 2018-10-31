package com.example.ashwininadagoud.slidingpuzzle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private SlidingPuzzle puzzleGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        puzzleGame = new SlidingPuzzle(this); //to create object for PuzzleGame
        setContentView(puzzleGame.getAppInterface());//Set the contentView to the AppInterface
    }
}

