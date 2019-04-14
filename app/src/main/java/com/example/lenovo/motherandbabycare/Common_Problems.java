package com.example.lenovo.motherandbabycare;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Common_Problems extends AppCompatActivity {
    private Button diaper_rashes_button,excess_hair_button,loss_appetite_button,
            teething_pain_button,worm_infestation_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common__problems);
        getSupportActionBar().setTitle("Common Problems");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

       diaper_rashes_button=(Button)findViewById(R.id.diaper_rashes_button);
       diaper_rashes_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Common_Problems.this);
                builder.setTitle("Diaper Rashes");
                builder.setMessage("Diaper rash is caused by soiled wet diaper or if the baby's skin is not properly dried after a bath .To prevent it check diapers frequently and pat the baby dry after bath. Generally with proper care these rashes will heal with time.")

                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });

       excess_hair_button=(Button)findViewById(R.id.excess_hair_button);
       excess_hair_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Common_Problems.this);
                builder.setTitle("Excess Body Hair");
                builder.setMessage("Often there is excess of body hair on some babies from birth,through with time the hair growth gets controlles and it becomes normal. To expedite the reduction of hair,mixture of milk and besan(Chicken flour)can be applied gently on the skin.")

                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });

       loss_appetite_button=(Button)findViewById(R.id.loss_appetite_button);
       loss_appetite_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Common_Problems.this);
                builder.setTitle("Loss of Appetite");
                builder.setMessage("If the child is not taking food and showing dislike to drink or eat then this may be due to loss of appetite. To treat it naturally ,add two pinches of ginger powder in a glass of milk and boil it.Give the warm milk to child to drink.This will get relief.")

                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });

       teething_pain_button=(Button)findViewById(R.id.teething_pain_button);
       teething_pain_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Common_Problems.this);
                builder.setTitle("Teething Pain");
                builder.setMessage("Teething pain comes when baby's first set of teeth comes. For relief mix one drop of clove oil in 1-2 tablespoons of saffalower oil.Gently massage the gums with this mixture using a clean finger this will give a lot of relief.")

                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });

       worm_infestation_button=(Button)findViewById(R.id.worm_infestation_button);
       worm_infestation_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Common_Problems.this);
                builder.setTitle("Worm Infestation");
                builder.setMessage("To get relief in intestinal worms,give 3 to 5 drops of fresh onion juice diluted in one tsp of water, 3 times daily.")

                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });
    }
}
