package com.example.lenovo.motherandbabycare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Music_Lullaby extends AppCompatActivity implements View.OnClickListener {
    private Button lullaby_one_button,lullaby_two_button,lullaby_three_button,
            lullaby_four_button,lullaby_five_button,music_one_button,music_two_button,
            music_three_button,music_four_button,music_five_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music__lullaby);
        getSupportActionBar().setTitle("Music and Lullaby");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        lullaby_one_button=(Button)findViewById(R.id.lullaby_one_button);
        lullaby_two_button=(Button)findViewById(R.id.lullaby_two_button);
        lullaby_three_button=(Button)findViewById(R.id.lullaby_three_button);
        lullaby_four_button=(Button)findViewById(R.id.lullaby_four_button);
        lullaby_five_button=(Button)findViewById(R.id.lullaby_five_button);
        music_one_button =(Button)findViewById(R.id.music_one_button);
        music_two_button=(Button)findViewById(R.id.music_two_button);
        music_three_button=(Button)findViewById(R.id.music_three_button);
        music_four_button=(Button)findViewById(R.id.music_four_button);
        music_five_button=(Button)findViewById(R.id.music_five_button);

        lullaby_one_button.setOnClickListener(this);
        lullaby_two_button.setOnClickListener(this);
        lullaby_three_button.setOnClickListener(this);
        lullaby_four_button.setOnClickListener(this);
        lullaby_five_button.setOnClickListener(this);
        music_one_button.setOnClickListener(this);
        music_two_button.setOnClickListener(this);
        music_three_button.setOnClickListener(this);
        music_four_button.setOnClickListener(this);
        music_five_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.lullaby_one_button:
                i = new Intent(this, Lullaby_One.class);
                startActivity(i);
                break;

            case R.id.lullaby_two_button:
                i = new Intent(this, Lullaby_Two.class);
                startActivity(i);
                break;

            case R.id.lullaby_three_button:
                i = new Intent(this, Lullaby_Three.class);
                startActivity(i);
                break;

            case R.id.lullaby_four_button:
                i = new Intent(this, Lullaby_Four.class);
                startActivity(i);
                break;

            case R.id.lullaby_five_button:
                i = new Intent(this,Lullaby_Five.class);
                startActivity(i);
                break;

            case R.id.music_one_button:
                i = new Intent(this, Music_One.class);
                startActivity(i);
                break;

            case R.id.music_two_button:
                i = new Intent(this, Music_Two.class);
                startActivity(i);
                break;

            case R.id.music_three_button:
                i = new Intent(this, Music_Three.class);
                startActivity(i);
                break;

            case R.id.music_four_button:
                i = new Intent(this, Music_Four.class);
                startActivity(i);
                break;

            case R.id.music_five_button:
                i = new Intent(this,Music_Five.class);
                startActivity(i);
                break;

            default:
                break;
        }
    }
}
