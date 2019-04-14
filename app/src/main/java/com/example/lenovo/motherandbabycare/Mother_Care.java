package com.example.lenovo.motherandbabycare;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mother_Care extends AppCompatActivity implements View.OnClickListener {
    private Button baby_appearance_button,food_habits_button,healthy_pregnancy_button,
            pregnancy_pain_button,pregnancy_vaccination_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mother__care);
        getSupportActionBar().setTitle("Mother Care");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        baby_appearance_button=(Button)findViewById(R.id.baby_appearance_button);
        food_habits_button=(Button)findViewById(R.id.food_habits_button);
        healthy_pregnancy_button=(Button)findViewById(R.id.healthy_pregnancy_button);
        pregnancy_pain_button=(Button)findViewById(R.id.pregnancy_pain_button);
        pregnancy_vaccination_button=(Button)findViewById(R.id.pregnancy_vaccination_button);

        //Add click listener to the cards
        baby_appearance_button.setOnClickListener(this);
        food_habits_button.setOnClickListener(this);
        healthy_pregnancy_button.setOnClickListener(this);
        pregnancy_pain_button.setOnClickListener(this);
        pregnancy_vaccination_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.baby_appearance_button:
                i = new Intent(this, Baby_Appearance.class);
                startActivity(i);
                break;

            case R.id.food_habits_button:
                i = new Intent(this, Food_Habits.class);
                startActivity(i);
                break;

            case R.id.healthy_pregnancy_button:
                i = new Intent(this, Healthy_Pregnancy.class);
                startActivity(i);
                break;

            case R.id.pregnancy_pain_button:
                i = new Intent(this, Pregnancy_Pains.class);
                startActivity(i);
                break;

            case R.id.pregnancy_vaccination_button:
                i = new Intent(this,Vaccinations.class);
                startActivity(i);
                break;

            default:
                break;
        }
    }

    }

