package com.example.lenovo.motherandbabycare;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash_Screen extends AppCompatActivity {

    private ImageView splash_screen_imageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);

        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        splash_screen_imageview=(ImageView) findViewById(R.id.splash_screen_imageview);

        Animation myanimation=AnimationUtils.loadAnimation(this,R.anim.mytransition);
        splash_screen_imageview.startAnimation(myanimation);

        final Intent i=new Intent(this,MainActivity.class);

        Thread timer=new Thread()
        {
            public void run()
            {
                try{
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally
                {
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();

    }
}
