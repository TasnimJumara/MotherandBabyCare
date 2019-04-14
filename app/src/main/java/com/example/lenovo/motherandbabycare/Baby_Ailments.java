package com.example.lenovo.motherandbabycare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Baby_Ailments extends AppCompatActivity implements View.OnClickListener {
    private Button common_cold_button,common_fever_button,constipation_button,
            diarrhoea_button,eczema_button,gas_button,sore_throat_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baby__ailments);
        getSupportActionBar().setTitle("Baby Ailments");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        common_cold_button=(Button)findViewById(R.id.common_cold_button);
        common_fever_button=(Button)findViewById(R.id.common_fever_button);
        constipation_button=(Button)findViewById(R.id.constipation_button);
        diarrhoea_button=(Button)findViewById(R.id.diarrhoea_button);
        eczema_button=(Button)findViewById(R.id.eczema_button);
        gas_button=(Button)findViewById(R.id.gas_button);
        sore_throat_button=(Button)findViewById(R.id.sore_throat_button);

        common_cold_button.setOnClickListener(this);
        common_fever_button.setOnClickListener(this);
        constipation_button.setOnClickListener(this);
       diarrhoea_button.setOnClickListener(this);
       eczema_button.setOnClickListener(this);
       gas_button.setOnClickListener(this);
       sore_throat_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.common_cold_button:
                i = new Intent(this,Common_Cold.class);
                startActivity(i);
                break;

            case R.id.common_fever_button:
                i = new Intent(this,Common_Fever.class);
                startActivity(i);
                break;

            case R.id.constipation_button:
                i = new Intent(this, Constipation.class);
                startActivity(i);
                break;

            case R.id.diarrhoea_button:
                i = new Intent(this, Diarrhoea.class);
                startActivity(i);
                break;

            case R.id.eczema_button:
                i = new Intent(this,Eczema.class);
                startActivity(i);
                break;

            case R.id.gas_button:
                i = new Intent(this,Gas.class);
                startActivity(i);
                break;

            case R.id.sore_throat_button:
                i = new Intent(this,Sore_Throat.class);
                startActivity(i);
                break;

            default:
                break;
        }
    }
}
