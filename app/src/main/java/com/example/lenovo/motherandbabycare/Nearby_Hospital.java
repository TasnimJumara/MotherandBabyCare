package com.example.lenovo.motherandbabycare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Nearby_Hospital extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearby__hospital);
        getSupportActionBar().setTitle("Nearby Hospital");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
