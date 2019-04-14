package com.example.lenovo.motherandbabycare;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pregnancy_Pains extends AppCompatActivity {
    private Button abdominal_back_pain_button,bleeding_white_discharge_button,breathing_diffficulty_button,
            chest_pain_headache_button,constipation_frequent_urine_button,gaining_weight_heartburn_button,
            leg_swelling_button,morning_sickness_button,vomiting_sense_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregnancy__pains);
        getSupportActionBar().setTitle("Pregnancy Pains");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        abdominal_back_pain_button=(Button)findViewById(R.id.abdominal_back_pain_button);
        abdominal_back_pain_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Pregnancy_Pains.this);
                builder.setTitle("Abdominal and Back Pain");
                builder.setMessage("Round ligament pain can occur during second trimester and can cause a sharp pain in the abdomen on either or both sides. The pain is caused by the stretching of the ligament that supports the uterus as the uterus grows. Some women get cramps with a little bleeding when the embryo implants itself into the wall of the womb. During a healthy pregnancy, women typically gain between 25 to 35 pounds. The spine has to support that weight. That can cause lower back pain. The weight of the growing baby and uterus also puts pressure on the blood vessels and nerves in the pelvis and back.")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });

        bleeding_white_discharge_button=(Button)findViewById(R.id.bleeding_white_discharge_button);
        bleeding_white_discharge_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Pregnancy_Pains.this);
                builder.setTitle("Bleeding and White Discharge");
                builder.setMessage("About 20% of women have some bleeding during the first 12 weeks of pregnancy due to implantation bleeding which is usually bengin.You may experience some normal spotting within the first 6 to 12 days after you conceive as the fertilized egg implants itself in the lining of the uterus. Normal vaginal discharge during pregnancy is called leucorrhea and it is thin, white, milky and mild smelling. For the first two trimesters, leucorrhea will often be noticed in the panties. The pregnant women can wear a maxi pad, disposable underwear if she is concerned about the vaginal discharge. Do not use tampons during pregnancy as they can introduce new germs into the vagina.")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });

        breathing_diffficulty_button=(Button)findViewById(R.id.breathing_diffficulty_button);
        breathing_diffficulty_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Pregnancy_Pains.this);
                builder.setTitle("Breathing Difficulty");
                builder.setMessage("As a normal prt of pregnancy, your breathing may be affected by the increase in the hormone progesterone which causes you to breath in more deeply. s if you are working harder to get air. If you have gained a lot of weight or expecting twins or more you may feel particularly breathless. In the last trimester of pregnancy, your growing baby pushes your uterus against your diaphragm. Hence breathing may become more difficult as your enlarging uterus takes up more space resulting in pressure against your diaphragm which is moved up about 4 cm from its pre pregnancy position.")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });

        chest_pain_headache_button=(Button)findViewById(R.id.chest_pain_headache_button);
        chest_pain_headache_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Pregnancy_Pains.this);
                builder.setTitle("Chest Pain and Headache");
                builder.setMessage("If your chest pain is severe, persistent and accompanied by shortness of breath, dizziness and weakness, you should call your doctor immediately. Treatment may include making sure you are taking enough vitamins and nutrients especially iron,calcium and magnesium. Also taking a yoga or adopting some stress relief technique can reduce the pain.During the first trimester, your body experiences a surge of hormones and an increase in blood volume. These two changes can cause more frequent headaches. During the third trimester, headaches tend to be related more often to poor posture and tension for carrying extra weight.")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });

        constipation_frequent_urine_button=(Button)findViewById(R.id.constipation_frequent_urine_button);
        constipation_frequent_urine_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Pregnancy_Pains.this);
                builder.setTitle("Constipation and Frequent Urine");
                builder.setMessage("Constipation is a common problem during pregnancy. Half of pregnant women get constipated at some point due to an increase in the hormone progesterone which relaxes smooth muscles throughout the body including the digestive tract. This means that food passes through the intestines more slowly. The extra blood flow makes your kidneys produce up to 25% more urine soon after conception. This increased urine production peaks by about 9 to 16 weeks. of the pregnancy and then settles down. Passing urine frequently can also be influenced by pressure on the bladder of the woman from her growing uterus.")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });

        gaining_weight_heartburn_button=(Button)findViewById(R.id.gaining_weight_heartburn_button);
        gaining_weight_heartburn_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Pregnancy_Pains.this);
                builder.setTitle("Gaining Weight and Heartburn");
                builder.setMessage("Most woman should gain somewhere between 25 to 35 pounds during pregnancy. If a woman does not gain enough weight, there maybe health problems for the mother and baby. Heartburn is also called acid indigestionis a burning sensation of the esophagus caused by stomach contents that reflux from the stomach. More than half of all pregnant woman report symptoms of severe heartburn particularly during their second and third trimesters.")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });

        leg_swelling_button=(Button)findViewById(R.id.leg_swelling_button);
        leg_swelling_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Pregnancy_Pains.this);
                builder.setTitle("Leg Swelling");
                builder.setMessage("Swelling is a normal part of pregnancy that is caused by additional blood and fluid. Normal swelling which is also called edema is experienced in the hands, face, legs, ankles and feet. During pregnancy, your body produces more fluid, causing frequent trips to the bathroom and swelling in the feet and ankles. The weight of the growing baby and uterus also causes pressure on the veins that pass through the pelvis carrying blood back to the heart impeding circulation and contributing further to the swelling.")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });

        morning_sickness_button=(Button)findViewById(R.id.morning_sickness_button);
        morning_sickness_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Pregnancy_Pains.this);
                builder.setTitle("Morning Sickness");
                builder.setMessage("Morning sickness is a misnormer. The medical term for morning sickness is nausea and vomiting.Up to 3 quarters of pregnant women have at least some nausea or vomiting during pregnancy. The nausea usually starts around 6 weeks of pregnancy. About half of the women who get nausea feel complete relief around 14 weeks. A small perchantage of women have symptomes that persist until delivery. Even a mild case of nausea can wear you down. Talk with your doctor about your symptomes and the possibilities for relief.")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });

        vomiting_sense_button=(Button)findViewById(R.id.vomiting_sense_button);
        vomiting_sense_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Pregnancy_Pains.this);
                builder.setTitle("Vomiting Sense");
                builder.setMessage("Most pregnant woman feel sick and vomit during early pregnancy. Symptoms are mild in most cases. Feelings of sickness typically come and go. They usually last for between 1 and 4 hours at a time. Some woman have more severe symptomes and have frequent or longer bouts of vomiting. You may just have nausea and no vomiting. It can affect your mood, work, home situation and your ability to care for your family. Help and support from your family and friends can make coping easier.")
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
