package com.example.lenovo.motherandbabycare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Extra_Care extends AppCompatActivity implements View.OnClickListener {
    private Button age_calculator_button,bmi_calculator_button,
    set_reminder_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra__care);
        getSupportActionBar().setTitle("Extra Care");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        age_calculator_button=(Button)findViewById(R.id.age_calculator_button);
        bmi_calculator_button=(Button)findViewById(R.id.bmi_calculator_button);
        set_reminder_button=(Button)findViewById(R.id.set_reminder_button);

        age_calculator_button.setOnClickListener(this);
        bmi_calculator_button.setOnClickListener(this);
        set_reminder_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId()) {
            case R.id.age_calculator_button:
                i = new Intent(this,Age_Calculator.class);
                startActivity(i);
                break;

            case R.id.bmi_calculator_button:
                i = new Intent(this, BMI_Calculator.class);
                startActivity(i);
                break;

            case R.id.set_reminder_button:
                i = new Intent(this, Set_Reminder.class);
                startActivity(i);
                break;

            default:
                break;
        }

    }
}
