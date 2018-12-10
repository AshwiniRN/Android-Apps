package com.example.ashwininadagoud.sudoku;

import android.content.Context;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    private final int SIZE=9;
    private AppInterface appInterface;
    private SudokuGame game;
    private int[][] nums=new int[9][9];
    private final String FILE_NAME="SudokuGame";
    Button newButton, saveButton, resumeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        newGame();

    }
    private void newGame()
    {
        Point screenSize=new Point();
        getWindowManager().getDefaultDisplay().getSize(screenSize);
        int width = screenSize.x/SIZE;
        appInterface=new AppInterface(this,SIZE,width);
        nums=appInterface.drawInitialBoard();

        game= new SudokuGame();
        game.setInitialNums(nums);
        game.setNums(nums);
        for(int i = 0; i < 9; i++)
            for(int j = 0; j < 9; j++) {
                TextChangeHandler temp = new TextChangeHandler(i,j);
                appInterface.setTextChangeHandler(temp, i, j);
            }
        setContentView(appInterface);

        ButtonHandler buttonHandler=new ButtonHandler();
        newButton=(Button)findViewById(appInterface.getIdButtonNew());
        newButton.setOnClickListener(buttonHandler);
        saveButton=(Button)findViewById(appInterface.getIdButtonSave());
        saveButton.setOnClickListener(buttonHandler);
        resumeButton=(Button)findViewById(appInterface.getIdButtonResume());
        resumeButton.setOnClickListener(buttonHandler);
    }
    private void resumeGame(int[][] nums, int[][] initialNums)
    {
        Point screenSize=new Point();
        getWindowManager().getDefaultDisplay().getSize(screenSize);
        int width = screenSize.x/SIZE;
        appInterface=new AppInterface(this,SIZE,width);
        appInterface.drawBoard(nums,initialNums);
        for(int i = 0; i < 9; i++)
            for(int j = 0; j < 9; j++) {
                TextChangeHandler temp = new TextChangeHandler(i,j);
                appInterface.setTextChangeHandler(temp, i, j);
            }
        setContentView(appInterface);

        ButtonHandler buttonHandler=new ButtonHandler();
        newButton=(Button)findViewById(appInterface.getIdButtonNew());
        newButton.setOnClickListener(buttonHandler);
        saveButton=(Button)findViewById(appInterface.getIdButtonSave());
        saveButton.setOnClickListener(buttonHandler);
        resumeButton=(Button)findViewById(appInterface.getIdButtonResume());
        resumeButton.setOnClickListener(buttonHandler);
    }
    private class ButtonHandler implements View.OnClickListener
    {
        public void onClick(View v)
        {
            Button b=(Button)v;
            if(b.getId()==appInterface.getIdButtonNew())
            {
                newGame();
            }
            else if(b.getId()==appInterface.getIdButtonSave())
            {
                try
                {
                    FileOutputStream fout = openFileOutput(FILE_NAME, Context.MODE_PRIVATE);
                    String sudoku="";
                    int[][] nums = game.getNums();
                    int[][] initialNums = game.getInitialNums();
                    for(int i=0;i<9;i++)
                    {
                        for(int j=0;j<9;j++)
                        {
                            sudoku=sudoku+nums[i][j]+"";
                            if(initialNums[i][j]!=0)
                                sudoku=sudoku+"F";
                            sudoku=sudoku+" ";
                        }
                        sudoku=sudoku+"\n";
                    }
                    //System.out.println(sudoku);
                    fout.write(sudoku.getBytes());
                    fout.close();
                }
                catch(Exception e){}
            }
            else if(b.getId()==appInterface.getIdButtonResume())
            {
                try
                {
                    FileInputStream fin=openFileInput(FILE_NAME);
                    InputStreamReader inputStreamReader=new InputStreamReader(fin);
                    BufferedReader bufferedReader=new BufferedReader(inputStreamReader);

                    String sudokuLine="";
                    String token="";
                    int[][] nums=new int[9][9];
                    int[][] initialNums=new int[9][9];
                    int i=0,j=0;
                    while((sudokuLine=bufferedReader.readLine())!=null)
                    {
                        StringTokenizer st=new StringTokenizer(sudokuLine);
                        j=0;
                        while(st.hasMoreTokens()) {
                            token = st.nextToken();
                            if((token.charAt(token.length()-1))=='F') {
                                initialNums[i][j] = Character.getNumericValue(token.charAt(0));
                            }
                            else {
                                initialNums[i][j] = 0;
                            }
                            nums[i][j]=Character.getNumericValue(token.charAt(0));
                            j++;
                        }
                        i++;
                    }

                    game.setInitialNums(initialNums);
                    game.setNums(nums);
                    resumeGame(nums,initialNums);

                }
                catch(Exception e){}
            }
        }
    }
    private class TextChangeHandler implements TextWatcher{
        private int x;
        private int y;

        public TextChangeHandler(int x, int y){
            this.x=x;
            this.y=y;
        }
        public void afterTextChanged(Editable e){
            int number;
            String numString=e.toString();
            try{
                number=Integer.parseInt(numString);
            }catch(Exception ex){
                number=0;
            }

            boolean isPresent=game.isValid(x,y,number);
            if(!isPresent)
            {
                if(number>0 && number<=9)
                {
                    game.setNum(x,y,number);
                    appInterface.removeTextchangehandler(this, x, y);
                    appInterface.setText(x, y, number);
                    appInterface.setTextchangehandler(this, x, y);
                }
                else{
                    game.removeNum(x,y);
                    appInterface.removeTextchangehandler(this,x,y);
                    appInterface.removeText(x, y);
                    appInterface.setTextchangehandler(this,x,y);
                }
            }
            else{
                game.removeNum(x,y);
                appInterface.removeTextchangehandler(this,x,y);
                appInterface.removeText(x,y);
                appInterface.setTextChangeHandler(this,x,y);
            }
            if(game.solved()){
                displayMessage("Game won");
            }
        }
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2){

        }
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2){

        }
    }
    private void displayMessage(String message){

        Toast toast = Toast.makeText(this,message, Toast.LENGTH_SHORT);
        toast.show();
    }
}
