package com.example.lenovo.motherandbabycare;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Eating_Habits extends AppCompatActivity {
    private Button baby_diet_button,zero_three_months_button,three_six_months_button,
            six_eight_months_button,eight_ten_months_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eating__habits);
        getSupportActionBar().setTitle("Eating Habits");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        baby_diet_button=(Button)findViewById(R.id.baby_diet_button);
        baby_diet_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Eating_Habits.this);
                builder.setTitle("About Baby Diet");
                builder.setMessage("Proper diet and proper care is necessary for babies from the start.Babies need to be fed properly at different stages in their life,from initial months to later age.Proper diet at each growing stage helps in making the baby strong and healthy.Given below is diet advice for baby at each stage.")

                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });

         zero_three_months_button=(Button)findViewById(R.id.zero_three_months_button);
        zero_three_months_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Eating_Habits.this);
                builder.setTitle("0 to 3 Months Old");
                builder.setMessage("For a newborn,Mother's Milk is the best food.It gives the required nutrients and energy to the baby.Also breastfeeding the baby helps in strengthening the bond of mother and child.Breast milk also strengthens the immune system of the baby to fight infections.")

                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });

         three_six_months_button=(Button)findViewById(R.id.three_six_months_button);
        three_six_months_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Eating_Habits.this);
                builder.setTitle("3 to 6 Months Old");
                builder.setMessage("After 3 months baby needs lots of nutrients for growth which cannot be obtainded from milk alone. Give easily digestible food to the baby.Repeat same diet for one week before giving anything new,as babies tale time to adjust in starting phase. Avoid feeding anything but milk from bottle and feed from spoon.")

                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });

         six_eight_months_button=(Button)findViewById(R.id.six_eight_months_button);
         six_eight_months_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Eating_Habits.this);
                builder.setTitle("6 to 8 Months Old");
                builder.setMessage("6-8 month old baby prefers taking solid food. At this age start giving fruits and vegetables to baby. Mashed boiled potato with pinch of salt with 2-3 drop of lemon juice mixed together can be given to baby. Apart form boiled vegetables like carrot, spinach ect boiled eggs cab be also given to babies.")

                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });

         eight_ten_months_button=(Button)findViewById(R.id.eight_ten_months_button);
         eight_ten_months_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Eating_Habits.this);
                builder.setTitle("8 to 10 Months Old");
                builder.setMessage("At 9-10 month,babies can be given most of eatable things.Meats,fish can be also be givien provided that it is soft and cooked properly. If baby getting 500 ml of milk everyday,then he will not have any nutritional deficiency.")

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
