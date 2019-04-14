package com.example.lenovo.motherandbabycare;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class Set_Reminder extends AppCompatActivity implements View.OnClickListener {

    private int notificationId=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set__reminder);
        getSupportActionBar().setTitle("Set Reminder");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        findViewById(R.id.setBtn).setOnClickListener(this);
        findViewById(R.id.cancelBtn).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        EditText editText=(EditText)findViewById(R.id.editText);
        TimePicker timePicker=(TimePicker)findViewById(R.id.timePicker);

        Intent intent=new Intent(Set_Reminder.this,AlarmReceiver.class);
        intent.putExtra("notificationId",notificationId);
        intent.putExtra("todo",editText.getText().toString());
        notificationId++;

        PendingIntent alarmIntent=PendingIntent.getBroadcast(Set_Reminder.this,0,
                intent,PendingIntent.FLAG_CANCEL_CURRENT);

        AlarmManager alarm=(AlarmManager)getSystemService(ALARM_SERVICE);

        switch(view.getId())
        {
            case R.id.setBtn:
                int hour=timePicker.getCurrentHour();
                int minute=timePicker.getCurrentMinute();

                Calendar startTime=Calendar.getInstance();
                startTime.set(Calendar.HOUR_OF_DAY,hour);
                startTime.set(Calendar.MINUTE,minute);
                startTime.set(Calendar.SECOND,0);
                long alrmStartTime=startTime.getTimeInMillis();

                alarm.set(AlarmManager.RTC_WAKEUP,alrmStartTime,alarmIntent);

                Toast.makeText(this,"Done",Toast.LENGTH_SHORT).show();
                break;

            case R.id.cancelBtn:
                alarm.cancel(alarmIntent);
                Toast.makeText(this,"Canceled",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
