package com.example.lenovo.motherandbabycare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Exercise_One extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise__one);
        getSupportActionBar().setTitle("Exercise One");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
