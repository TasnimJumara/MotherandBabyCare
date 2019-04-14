package com.example.lenovo.motherandbabycare;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

public class Appearance_Listdata extends AppCompatActivity {

    Toolbar toolBar;
    ImageView weeks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appearance__listdata);

        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        toolBar=(Toolbar)findViewById(R.id.toolBar);
        weeks=(ImageView)findViewById(R.id.imageView);

        Bundle bundle=getIntent().getExtras();
        if(bundle != null)
        {
            toolBar.setTitle(bundle.getString("Week_Name"));

            if(toolBar.getTitle().toString().equalsIgnoreCase("First Trimester"))
            {
                weeks.setImageDrawable(ContextCompat.getDrawable(Appearance_Listdata.this,
                        R.drawable.first_trimester_image));
            }
            else if(toolBar.getTitle().toString().equalsIgnoreCase("Second Trimester"))
            {
                weeks.setImageDrawable(ContextCompat.getDrawable(Appearance_Listdata.this,
                        R.drawable.second_trimester_image));
            }
            else if(toolBar.getTitle().toString().equalsIgnoreCase("Third Trimester"))
            {
                weeks.setImageDrawable(ContextCompat.getDrawable(Appearance_Listdata.this,
                        R.drawable.third_trimester_image));
            }
            else if(toolBar.getTitle().toString().equalsIgnoreCase("Eighth Week"))
            {
                weeks.setImageDrawable(ContextCompat.getDrawable(Appearance_Listdata.this,
                        R.drawable.pregnancy_8_week_image));
            }
            else if(toolBar.getTitle().toString().equalsIgnoreCase("Twelfth Week"))
            {
                weeks.setImageDrawable(ContextCompat.getDrawable(Appearance_Listdata.this,
                        R.drawable.pregnancy_12_week_image));
            }
            else if(toolBar.getTitle().toString().equalsIgnoreCase("Sixteenth Week"))
            {
                weeks.setImageDrawable(ContextCompat.getDrawable(Appearance_Listdata.this,
                        R.drawable.pregnancy_16_week_image));
            }
            else if(toolBar.getTitle().toString().equalsIgnoreCase("Twentieth Week"))
            {
                weeks.setImageDrawable(ContextCompat.getDrawable(Appearance_Listdata.this,
                        R.drawable.pregnancy_20_week_image));
            }
            else if(toolBar.getTitle().toString().equalsIgnoreCase("Twenty Fourth Week"))
            {
                weeks.setImageDrawable(ContextCompat.getDrawable(Appearance_Listdata.this,
                        R.drawable.pregnancy_24_week_image));
            }
            else if(toolBar.getTitle().toString().equalsIgnoreCase("Twenty Eighth Week"))
            {
                weeks.setImageDrawable(ContextCompat.getDrawable(Appearance_Listdata.this,
                        R.drawable.pregnancy_28_week_image));
            }
            else if(toolBar.getTitle().toString().equalsIgnoreCase("Thirty Second Week"))
            {
                weeks.setImageDrawable(ContextCompat.getDrawable(Appearance_Listdata.this,
                        R.drawable.pregnancy_32_week_image));
            }
            else if(toolBar.getTitle().toString().equalsIgnoreCase("Thirty Sixth Week"))
            {
                weeks.setImageDrawable(ContextCompat.getDrawable(Appearance_Listdata.this,
                        R.drawable.pregnancy_36_week_image));
            }
            else if(toolBar.getTitle().toString().equalsIgnoreCase("Fortieth Week"))
            {
                weeks.setImageDrawable(ContextCompat.getDrawable(Appearance_Listdata.this,
                        R.drawable.pregnancy_40_week_image));
            }
        }


    }
}
