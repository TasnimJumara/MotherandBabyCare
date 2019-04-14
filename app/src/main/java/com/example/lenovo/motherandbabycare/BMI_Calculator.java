package com.example.lenovo.motherandbabycare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BMI_Calculator extends AppCompatActivity {
    private EditText weight_text,height_text;
    private Button calculate_button;
    private TextView result_textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi__calculator);
        getSupportActionBar().setTitle("BMI Calculator");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        weight_text=(EditText)findViewById(R.id.weight_text);
        height_text=(EditText)findViewById(R.id.height_text);
        calculate_button=(Button)findViewById(R.id.calculate_button);
        result_textview=(TextView)findViewById(R.id.result_textView);

        calculate_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                body_mass_index();
            }
        });
    }

    private void body_mass_index()
    {
        float height,weight,result;

        height= (float) (Float.parseFloat(height_text.getText().toString())*0.3048);
        weight=Float.parseFloat(weight_text.getText().toString());
        result=weight/(height*height);
        result_textview.setText(" "+result);

        if(result<16.5)
        {
            Toast.makeText(getApplicationContext(),"You are severly underweight.",Toast.LENGTH_SHORT).show();
        }
        else if(result<18.5)
        {
            Toast.makeText(getApplicationContext(),"You are underweight.",Toast.LENGTH_SHORT).show();
        }
        else if(result>=18.5 && result<=24.9)
        {
            Toast.makeText(getApplicationContext(),"You are normal.",Toast.LENGTH_SHORT).show();
        }
        else if(result>=25 && result<=29.9)
        {
            Toast.makeText(getApplicationContext(),"You are overweight.",Toast.LENGTH_SHORT).show();
        }
        else if(result>=30)
        {
            Toast.makeText(getApplicationContext(),"You are obese.",Toast.LENGTH_SHORT).show();
        }

    }
}
