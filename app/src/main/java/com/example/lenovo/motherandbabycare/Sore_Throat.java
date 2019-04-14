package com.example.lenovo.motherandbabycare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Sore_Throat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sore__throat);
        getSupportActionBar().setTitle("Sore Throat");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
