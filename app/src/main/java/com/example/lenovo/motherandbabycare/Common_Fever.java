package com.example.lenovo.motherandbabycare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Common_Fever extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common__fever);
        getSupportActionBar().setTitle("Common Fever");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
