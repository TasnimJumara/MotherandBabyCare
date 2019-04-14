package com.example.lenovo.motherandbabycare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Diarrhoea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diarrhoea);
        getSupportActionBar().setTitle("Diarrhoea");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
