package com.example.lenovo.motherandbabycare;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Healthy_Pregnancy extends AppCompatActivity {
    private Button balanced_diet_button,checkup_time_button,doables_avoidables_button,
            foods_avoid_button,importance_scanning_button,importance_water_button,
            medicines_avoid_button,taking_rest_button,toxoplasmosis_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthy__pregnancy);
        getSupportActionBar().setTitle("Healthy Pregnancy");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        balanced_diet_button=(Button)findViewById(R.id.balanced_diet_button);
        balanced_diet_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Healthy_Pregnancy.this);
                builder.setTitle("Balanced Diet");
                builder.setMessage("A pregnant woman should eat fruits, vegetables, meat, fish and egg. In the morning, you can take some of the soft foods like chapathi, dosa, idli, oats. On lunch, vegetable is must like spinach. If you are a non-vegetarian then you can take any one of boiled egg white, chicken, fish. In the evening, a cup of juice is a must. On night, you can take the similar food like you take in the morning. Finally you have to take a cup of milk 30 mintues before you go to sleep.")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });

        checkup_time_button=(Button)findViewById(R.id.checkup_time_button);
        checkup_time_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Healthy_Pregnancy.this);
                builder.setTitle("Checkup Time");
                builder.setMessage("During your pregnancy you will be offered a range of tests including blood tests, altrasound scans. These tests are designed to check for anything that may cause a problem during you pregnancy or after birth. If you are unwell, bleeding, swelling on hand, leg or face, any changes in your eyesight like more brightness, abdominal pain, headache then you must consult with your doctor immediately.")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });

        doables_avoidables_button=(Button)findViewById(R.id.doables_avoidables_button);
        doables_avoidables_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Healthy_Pregnancy.this);
                builder.setTitle("Doables and Avoidables");
                builder.setMessage("Fully cooked fish or seafood, split peas, black beans, chick peas, milk, egg, cabbage, almonds, fruits, nuts, peas these are the items you can take to balance your calorie level. Do not take unnecessary drugs, unboiled foods and meats. Avoid going outside and exposing yourself to dust. Avoid stress factors, smoking and drinking alcohol. Do not stop eating your regular foods except few which will cause problems to your baby")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });

        foods_avoid_button=(Button)findViewById(R.id.foods_avoid_button);
        foods_avoid_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Healthy_Pregnancy.this);
                builder.setTitle("Foods to Avoid");
                builder.setMessage("Certain seafood and fish, raw or uncooked eggs, raw vegetable sprouts, nuts that cause allergies, unpasteurized soft cheese, unpasteurized dairy products, undercooked milk, poultry, some foods like raw papaya, aloe vera, hing, methi dana, pineapple, high salt items, street foods, chinese foods like noodles or maggie, foods made of flour, raw and uncooked meat and chicken are stricty avoidable during the pregnancy. Stop drinking coffee, drinking more coffee can cause abortion.")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });

        importance_scanning_button=(Button)findViewById(R.id.importance_scanning_button);
        importance_scanning_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Healthy_Pregnancy.this);
                builder.setTitle("Importance of Scanning");
                builder.setMessage("Scanning is used to determine viability of pregnancy. The purpose of the scan is to check the number of babies present, growth and physical development of your baby, position of placenta and assess amount of amniotic fluid around the baby, monitor the pregnancy if there have been complications such as bleeding, fluid loss, hypertension and gestational diabetes, monitor placental health and function and work out the age of baby in a dating scan.")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });

        importance_water_button=(Button)findViewById(R.id.importance_water_button);
        importance_water_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Healthy_Pregnancy.this);
                builder.setTitle("Importance of Water");
                builder.setMessage("Drinking enough water prevents dehydration. Dehydration during pregnancy can lead to many complications such as headaches, nausea, cramps, oedema and dizziness. This is especially important in the third trimester when dehydration can actually cause contractions that can trigger preterm labour.")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });

        medicines_avoid_button=(Button)findViewById(R.id.medicines_avoid_button);
        medicines_avoid_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Healthy_Pregnancy.this);
                builder.setTitle("Medicines to Avoid");
                builder.setMessage("Without the permission of doctor, you should not take any medicine. Medicines like aspirin, ibuprofen and some certain antidepressants will cause serious problem for your baby during pregnancy. So, it is always advisable to consult with your doctor before taking any drugs.")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });

        taking_rest_button=(Button)findViewById(R.id.taking_rest_button);
        taking_rest_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Healthy_Pregnancy.this);
                builder.setTitle("Taking Rest");
                builder.setMessage("It is always good to take rest at least 8 hours to get a smooth delivery. For the first six month, a pregnnt woman should not work more and always needs time to relax her body. Overdoing work will cause you deliver your baby early in 8 months. Once you cross 6 months then do some simple work which makes your body flexible.")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });

        toxoplasmosis_button=(Button)findViewById(R.id.toxoplasmosis_button);
        toxoplasmosis_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Healthy_Pregnancy.this);
                builder.setTitle("Toxoplasmosis");
                builder.setMessage("Experts estimate that about half of toxoplasmosis infections are caused by eating raw or undercooked infected meat but you can also get the parasite by eating unwashed contaminated produce, drinking contaminated water or handling contaminated soil, cat litter or meat and then touching your eyes, mouth or nose. To protect yourself from this, avoid stray cats especially kittens. Do not get a new cat while you are pregnant. Wear gloves when gardening and during contact with soil or sand")
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
