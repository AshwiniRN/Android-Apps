package com.example.ashwininadagoud.wordguessinggame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView status,outputWord;
    EditText userGuess;
    Button btnCheck, btnNext;
    Random r;
    String currentWord;
    //array of words that are in the game
    String[] words = {
            "apple",
            "grapes",
            "mango",
            "watermelon",
            "pineapple",
            "carrot",
            "tomato",
            "potato",
            "onion",
            "lettuce"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Access the input and parse them to string
        outputWord = (TextView) findViewById(R.id.outputWord);
        status = (TextView) findViewById(R.id.status);

        userGuess = (EditText) findViewById(R.id.userGuess);

        btnCheck = (Button) findViewById(R.id.btnCheck);
        btnNext = (Button) findViewById(R.id.btnNext);

        r = new Random();//New random generation

        newGame();//newgame function is called

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //to check is the guess is correct or incorrect
                if (userGuess.getText().toString().equalsIgnoreCase(currentWord)){
                    status.setText("Correct");

                    //switch buttons if answer is correct
                    btnCheck.setEnabled(false);
                    btnNext.setEnabled(true);
                }
                else {
                    status.setText("Incorrect");
                }
            }
        });
        //move to next word
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newGame();

            }
        });
    }
    //function to shuffle the letters
    private String mixedWord(String word){
        List<String> letters = Arrays.asList(word.split(""));
        Collections.shuffle(letters);
        String shuffled = "";
        for (String letter : letters) {
            shuffled += letter;

        }
        return shuffled;

    }

    //newgame method
    private void newGame(){
        //to get random words from the list of words
        currentWord = words[r.nextInt(words.length)];

        //to show the word with mixed letters
        outputWord.setText(mixedWord(currentWord));

        //to set user guess field to null
        userGuess.setText("");

        //to switch buttons
        btnNext.setEnabled(false);
        btnCheck.setEnabled(true);
    }
}
