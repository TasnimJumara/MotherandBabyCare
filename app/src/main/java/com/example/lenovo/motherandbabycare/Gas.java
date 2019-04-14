package com.example.lenovo.motherandbabycare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Gas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gas);
        getSupportActionBar().setTitle("Gas");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
