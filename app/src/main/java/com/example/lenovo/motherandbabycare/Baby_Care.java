package com.example.lenovo.motherandbabycare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Baby_Care extends AppCompatActivity implements View.OnClickListener {
    private Button baby_ailments_button,common_problems_button,eating_habits_button,
            tips_weather_button,baby_vaccination_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baby__care);
        getSupportActionBar().setTitle("Baby Care");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        baby_ailments_button=(Button)findViewById(R.id.baby_ailments_button);
        common_problems_button=(Button)findViewById(R.id.common_problems_button);
        eating_habits_button=(Button)findViewById(R.id.eating_habits_button);
        tips_weather_button=(Button)findViewById(R.id.tips_weather_button);
        baby_vaccination_button=(Button)findViewById(R.id.baby_vaccination_button);

        baby_ailments_button.setOnClickListener(this);
        common_problems_button.setOnClickListener(this);
        eating_habits_button.setOnClickListener(this);
        tips_weather_button.setOnClickListener(this);
        baby_vaccination_button.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.baby_ailments_button:
                i = new Intent(this,Baby_Ailments.class);
                startActivity(i);
                break;

            case R.id.common_problems_button:
                i = new Intent(this,Common_Problems.class);
                startActivity(i);
                break;

            case R.id.eating_habits_button:
                i = new Intent(this, Eating_Habits.class);
                startActivity(i);
                break;

            case R.id.tips_weather_button:
                i = new Intent(this, Tips_Weather.class);
                startActivity(i);
                break;

            case R.id.baby_vaccination_button:
                i = new Intent(this,Baby_Vaccinations.class);
                startActivity(i);
                break;

            default:
                break;
        }
    }
}
