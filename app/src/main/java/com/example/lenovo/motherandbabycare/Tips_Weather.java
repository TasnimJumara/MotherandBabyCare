package com.example.lenovo.motherandbabycare;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tips_Weather extends AppCompatActivity {
    private Button general_tips_button,summer_season_button,winter_season_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips__weather);
        getSupportActionBar().setTitle("Tips and Weather");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        general_tips_button=(Button)findViewById(R.id.general_tips_button);
        general_tips_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Tips_Weather.this);
                builder.setTitle("General Tips");
                builder.setMessage("Apply a little mustard oil daily on the navel of  the child to prevent dry lips. To get relief from vomiting boil 1 tsp of powdered cardamon peels in 2 cups of water till it is reduced to half. Cool it and give 1 spoonful of this water at regular intervals. Mix 1 drop of clove oil with 2 teaspoons  of sunflower oil and massage gently on the gums to relieve teething pain in baby. To strengthen bones of the baby , massage the baby's body with mustard oil daily. To get relief in minor burn ,apply mashes ripe banana on it.")

                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });

        summer_season_button=(Button)findViewById(R.id.summer_season_button);
        summer_season_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Tips_Weather.this);
                builder.setTitle("In the Summer");
                builder.setMessage("Dress the baby in cool cotton clothes. Avoid synthetic clothes,as they trap heat and can be uncomfortable. Stay indoors during the hottest time of the day.if you need to step out in the sun, ensure that baby is well covered. Take the baby out for walks early in the morning or late in the evening. Keep the baby hydrated by giving plenty of water or milk.")

                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });

        winter_season_button=(Button)findViewById(R.id.winter_season_button);
        winter_season_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Tips_Weather.this);
                builder.setTitle("In the Winter");
                builder.setMessage("Cover babys feet and head properly as these are the prominent regions form which cold catched fast. Cover babys head with woolens cap. Avoid sudden change of temperature,like going out in clode form hot room. Do not cover babys chest with too many clothes. Make easy babys clothes let air pass easily and do not trap the air. To prevent dry skin massage the baby mustrad oil on navel region in the night. To prevent dry skin massage the baby with olive oil as its help in blood circulation. After the massage bathe the baby with warm water.")

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
