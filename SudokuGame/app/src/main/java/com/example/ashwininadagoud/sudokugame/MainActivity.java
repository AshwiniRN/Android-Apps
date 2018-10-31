package com.example.ashwininadagoud.sudokugame;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

public class MainActivity extends AppCompatActivity {

    private final int SIZE = 9;
    private Game gameBoard;
    private AppInterface appInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Point screenSize = new Point();
        getWindowManager().getDefaultDisplay().getSize(screenSize);
        int width = screenSize.x / SIZE;

        gameBoard = new Game();
        appInterface = new AppInterface(this, SIZE, width);

        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++) {
                TextChangeHandler temp = new TextChangeHandler(i, j);
                appInterface.setTextChangeHandler(temp, i, j);
            }
        setContentView(appInterface); //set the content view to the appinterface
    }


    private class TextChangeHandler implements TextWatcher {
        private int x = 0, y = 0;

        public TextChangeHandler(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void afterTextChanged(Editable e) {

        }

        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        public void onTextChanged(CharSequence s, int start, int before, int after) {

        }

    }

}