package com.example.ashwininadagoud.sorting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Sorting sorting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        sorting = new Sorting(this);
        setContentView(sorting.getAppInterface());

    }

}
