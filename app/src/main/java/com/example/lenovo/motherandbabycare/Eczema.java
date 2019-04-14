package com.example.lenovo.motherandbabycare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Eczema extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eczema);
        getSupportActionBar().setTitle("Eczema");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
