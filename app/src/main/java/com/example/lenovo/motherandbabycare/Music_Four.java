package com.example.lenovo.motherandbabycare;

import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class Music_Four extends AppCompatActivity {
    Button playButton;
    SeekBar positionBar,volumeBar;
    TextView elapsedTimeLabel,remainingTimeLabel;

    MediaPlayer mp;
    int total_time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music__four);
        getSupportActionBar().setTitle("Piano Sonata Music");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        playButton=(Button)findViewById(R.id.playButton);
        elapsedTimeLabel=(TextView)findViewById(R.id.elapsedTimeLabel);
        remainingTimeLabel=(TextView)findViewById(R.id.remainingTimeLabel);

        mp=MediaPlayer.create(this,R.raw.piano_sonata_music);
        mp.setLooping(true);
        mp.seekTo(0);
        mp.setVolume(0.5f,0.5f);
        total_time=mp.getDuration();

        positionBar=(SeekBar)findViewById(R.id.positionBar);
        positionBar.setMax(total_time);
        positionBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        if(fromUser)
                        {
                            mp.seekTo(progress);
                            positionBar.setProgress(progress);
                        }
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );

        volumeBar=(SeekBar)findViewById(R.id.volumeBar);
        volumeBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        float volumenum=progress/100f;
                        mp.setVolume(volumenum,volumenum);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(mp!=null)
                {
                    try
                    {
                        Message msg=new Message();
                        msg.what=mp.getCurrentPosition();
                        handler.sendMessage(msg);
                        Thread.sleep(1000);

                    }catch (InterruptedException e) {}

                }
            }
        }).start();
    }
    private Handler handler=new Handler()
    {
        @Override
        public void handleMessage(Message msg) {
            int currentPosition=msg.what;
            positionBar.setProgress(currentPosition);

            String elapsedTime=createTimeLabel(currentPosition);
            elapsedTimeLabel.setText(elapsedTime);

            String remainingTime=createTimeLabel(total_time-currentPosition);
            remainingTimeLabel.setText("-"+remainingTime);
        }
    };

    public String createTimeLabel(int time)
    {
        String timeLabel="";
        int minute=time/1000/60;
        int second=time/1000%60;

        timeLabel=minute+":";
        if(second<10)timeLabel += "0";
        timeLabel+=second;

        return timeLabel;

    }

    public void playButtonClick(View view)
    {
        if(!mp.isPlaying())
        {
            mp.start();
            playButton.setBackgroundResource(R.drawable.sound_stop_image);
        }
        else
        {
            mp.pause();
            playButton.setBackgroundResource(R.drawable.sound_play_image);
        }

    }
}
