package com.example.lenovo.motherandbabycare;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout ambulance_service,baby_care,doctor_care,pregnancy_exercise,
            extra_care,mother_care,music_lullaby,nearby_places,todo_list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        ambulance_service=(LinearLayout)findViewById(R.id.ambulance_service);
        baby_care=(LinearLayout)findViewById(R.id.baby_care);
        doctor_care=(LinearLayout)findViewById(R.id.doctor_care);
        extra_care=(LinearLayout) findViewById(R.id.extra_care);
        mother_care=(LinearLayout)findViewById(R.id.mother_care);
        music_lullaby=(LinearLayout) findViewById(R.id.music_lullaby);
        nearby_places=(LinearLayout)findViewById(R.id.nearby_places);
        pregnancy_exercise=(LinearLayout)findViewById(R.id.pregnancy_exercise);
        todo_list=(LinearLayout)findViewById(R.id.todo_list);

        //Add click listeners to the layouts
        ambulance_service.setOnClickListener(this);
        baby_care.setOnClickListener(this);
        doctor_care.setOnClickListener(this);
        extra_care.setOnClickListener(this);
        mother_care.setOnClickListener(this);
        music_lullaby.setOnClickListener(this);
        nearby_places.setOnClickListener(this);
        pregnancy_exercise.setOnClickListener(this);
        todo_list.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch(v.getId()) {

            case R.id.ambulance_service:i=new Intent(this,Ambulance_Service.class);
                startActivity(i);
                break;

            case R.id.baby_care:i=new Intent(this,Baby_Care.class);
                startActivity(i);
                break;

            case R.id.doctor_care:i=new Intent(this,Doctor_Care.class);
                startActivity(i);
                break;

            case R.id.extra_care:
                i = new Intent(this, Extra_Care.class);
                startActivity(i);
                break;

            case R.id.mother_care:i=new Intent(this,Mother_Care.class);
                startActivity(i);
                break;

            case R.id.music_lullaby:i=new Intent(this,Music_Lullaby.class);
                startActivity(i);
                break;

            case R.id.nearby_places:i=new Intent(this,Maps_Activity.class);
                startActivity(i);
                break;

            case R.id.pregnancy_exercise:i=new Intent(this,Pregnancy_Exercise.class);
                startActivity(i);
                break;

            case R.id.todo_list:i=new Intent(this,Todo_List.class);
                startActivity(i);
                break;

            default:break;
        }

    }

    public void onBackPressed() {

        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Do you want to exit?");
        builder.setCancelable(true)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int i) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }
}
