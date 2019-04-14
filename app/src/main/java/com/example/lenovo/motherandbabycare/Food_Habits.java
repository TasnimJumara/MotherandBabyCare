package com.example.lenovo.motherandbabycare;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Food_Habits extends AppCompatActivity {
    private Button calcium_button,carbohydrates_button,folic_acid_button,iron_nutrition_button,
            phosphorus_button,vitamins_button,water_content_button,weight_monitoring_button,
            zinc_nutrition_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food__habits);
        getSupportActionBar().setTitle("Food Habits");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        calcium_button=(Button)findViewById(R.id.calcium_button);
        calcium_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Food_Habits.this);
                builder.setTitle("Calcium");
                builder.setMessage("Egg, milk, oats and vegetables are rich in calcium. This helps to strengthen born,teeth and regularize heart beat. 1 glass of milk has 1200 mg calcium.Two out of threee times it is required during pregnancy third trimester.")

                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });

        carbohydrates_button=(Button)findViewById(R.id.carbohydrates_button);
        carbohydrates_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Food_Habits.this);
                builder.setTitle("Carbohydrates");
                builder.setMessage("Rice, wholemeal, pasta, bread, noodles, maize, oats, cereal, potato, sweet potato,bulgar wheat,couscous these are good sources of carbohydrate")

                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();

            }
        });

        folic_acid_button=(Button)findViewById(R.id.folic_acid_button);
        folic_acid_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Food_Habits.this);
                builder.setTitle("Folic Acid");
                builder.setMessage("Lentils, deied beans, peas, nuts, avocado, dark green vegetables such as spinach, broccoli, turnip greens, okra, brussels sprouts, citrus fruit and juice are folic acid foods. This helps increasing blood count and avoiding nerve disorders of the baby.")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();

            }
        });

        iron_nutrition_button=(Button)findViewById(R.id.iron_nutrition_button);
        iron_nutrition_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Food_Habits.this);
                builder.setTitle("Iron Nutrition");
                builder.setMessage("Red meat, pork, poultry, seafood, beans, dark green leafy vegetables such as spinach, dried fruit such as raisins and apricots, iron fortified cereals, breads, pastas, peas all these are iron rich foods. These foods are important in first and last three moths of pregnancy. This helps for complete growth of the mother and baby.")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();

            }
        });

        phosphorus_button=(Button)findViewById(R.id.phosphorus_button);
        phosphorus_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Food_Habits.this);
                builder.setTitle("Phosphorus");
                builder.setMessage("Egg, dumplings, milk, meats, vegetables are phosphorous foods. This helps in cell growth of the baby.")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();

            }
        });

        vitamins_button=(Button)findViewById(R.id.vitamins_button);
        vitamins_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Food_Habits.this);
                builder.setTitle("Vitamins");
                builder.setMessage("Green vegetables, fruits, milk contain more vitamin A. Pork, poultry fidh,bread, wholegrain cereals such as oatmeal, weheatgerm and brown rice, eggs, vegetables, soya beans are vitamin B foods. Oranges,red peppers,brussels sprouts,broccoli,strawberries, grapefruit, guava are vitamin C foods. Fatty fish like tuna, mackerel and salmon foods fortified with vitamin D like some dairy products, orange juice, soy milk and cereals, egg yolks these are the foods that contain vitamin D. Almonds, raw seeds, spinach, green turnips, kale, plant oils,,hazelnuts, raw chards, mustard greens, pine nuts, avocado, broccoli, parsley, olives, eggs, fortified cereals, soya beans all these foods are vitamin E. Almonds, spinach, swiss chard, mustard greens, turnip greens, kale, avocado, broccoli these are vitamin K foods.")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();

            }
        });

        water_content_button=(Button)findViewById(R.id.water_content_button);
        water_content_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Food_Habits.this);
                builder.setTitle("Water Content");
                builder.setMessage("Daily 8 glass of water is required. Juices are the main source of water content. Avoid drinking coffee or tea.")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();

            }
        });

        weight_monitoring_button=(Button)findViewById(R.id.weight_monitoring_button);
        weight_monitoring_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Food_Habits.this);
                builder.setTitle("Weight Monitoring");
                builder.setMessage("A pregnant woman should not exceed more than 10 to 12 kg during pregnancy. For the proper growth of the baby you should gain 0.5 to 2 kg of weight in your first 3 months.")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();

            }
        });

        zinc_nutrition_button=(Button)findViewById(R.id.zinc_nutrition_button);
        zinc_nutrition_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Food_Habits.this);
                builder.setTitle("Weight Monitoring");
                builder.setMessage("Spinach, beef, shrimp, kidney beans, wheat germ, shellfish, squash seeds, cereals, fruits are zinc nutrition foods. If this nutrition deficiency happens then the baby may get hyploplasia.")
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
