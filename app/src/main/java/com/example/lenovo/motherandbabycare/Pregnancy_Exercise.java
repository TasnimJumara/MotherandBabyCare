package com.example.lenovo.motherandbabycare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pregnancy_Exercise extends AppCompatActivity implements View.OnClickListener {
    private Button exercise_one_button,exercise_two_button,exercise_three_button,
            exercise_four_button,exercise_five_button,exercise_six_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregnancy__exercise);
        getSupportActionBar().setTitle("Pregnancy Exercise");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        exercise_one_button=(Button)findViewById(R.id.exercise_one_button);
        exercise_two_button=(Button)findViewById(R.id.exercise_two_button);
        exercise_three_button=(Button)findViewById(R.id.exercise_three_button);
        exercise_four_button=(Button)findViewById(R.id.exercise_four_button);
        exercise_five_button=(Button)findViewById(R.id.exercise_five_button);
        exercise_six_button=(Button)findViewById(R.id.exercise_six_button);

        exercise_one_button.setOnClickListener(this);
        exercise_two_button.setOnClickListener(this);
        exercise_three_button.setOnClickListener(this);
        exercise_four_button.setOnClickListener(this);
        exercise_five_button.setOnClickListener(this);
        exercise_six_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.exercise_one_button:
                i = new Intent(this,Exercise_One.class);
                startActivity(i);
                break;

            case R.id.exercise_two_button:
                i = new Intent(this,Exercise_Two.class);
                startActivity(i);
                break;

            case R.id.exercise_three_button:
                i = new Intent(this, Exercise_Three.class);
                startActivity(i);
                break;

            case R.id.exercise_four_button:
                i = new Intent(this, Exercise_Four.class);
                startActivity(i);
                break;

            case R.id.exercise_five_button:
                i = new Intent(this,Exercise_Five.class);
                startActivity(i);
                break;

            case R.id.exercise_six_button:
                i = new Intent(this,Exercise_Six.class);
                startActivity(i);
                break;
            default:
                break;
        }

    }
}
