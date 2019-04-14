package com.example.lenovo.motherandbabycare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Baby_Vaccinations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baby__vaccinations);
        getSupportActionBar().setTitle("Vaccinations");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
