package com.example.lenovo.motherandbabycare;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Doctor_Care extends AppCompatActivity {
    ListView listView;
    String mTitle[]={"Dr.A.K.M. Anwar-ul-Azim","Dr.Amena Majid","Dr.Amreen Sadika Sayeed","Dr.Anowara Begum",
            "Dr.Hafizur Rahman","Dr.Khadiza Nazneen","Dr.Maliha Rashid","Dr.Mrinal Kumar Sarker","Dr.Sabrina Afroze Barsha","Dr.T.A. Chowdhury"};
    String mDescription[]={"Ad-din Hospital","Dhaka Medical College & Hospital","Ibrahim General Hospital","Square Hospitals",
            "Popular Medical College & Hospital","Labaid Cardiac Hospital","Cental Hospitals","Apollo Hospitals","Popular Medical College & Hospital","Farida Clinic"};
    int images[] ={R.drawable.male_doctor_image,R.drawable.female_doctor_image,R.drawable.female_doctor_image,
            R.drawable.female_doctor_image,R.drawable.male_doctor_image,R.drawable.female_doctor_image,
            R.drawable.female_doctor_image,R.drawable.male_doctor_image,R.drawable.female_doctor_image,R.drawable.male_doctor_image};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor__care);
        getSupportActionBar().setTitle("Doctor Care");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView=findViewById(R.id.listView);
        MyAdapter adapter=new MyAdapter(this,mTitle,mDescription,images);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    String number0="029668287";
                    Intent intent=new Intent(Intent.ACTION_CALL);

                    intent.setData(Uri.parse("tel:"+number0));

                    if(ActivityCompat.checkSelfPermission(Doctor_Care.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                    {
                        return;
                    }

                    startActivity(intent);
                }
                if(position==1)
                {
                    String number1="029664028";
                    Intent intent=new Intent(Intent.ACTION_CALL);

                    intent.setData(Uri.parse("tel:"+number1));

                    if(ActivityCompat.checkSelfPermission(Doctor_Care.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                    {
                        return;
                    }

                    startActivity(intent);

                }
                if(position==2)
                {
                    String number2="029146357";
                    Intent intent=new Intent(Intent.ACTION_CALL);

                    intent.setData(Uri.parse("tel:"+number2));

                    if(ActivityCompat.checkSelfPermission(Doctor_Care.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                    {
                        return;
                    }

                    startActivity(intent);

                }
                if(position==3)
                {
                    String number3="01713377774";
                    Intent intent=new Intent(Intent.ACTION_CALL);

                    intent.setData(Uri.parse("tel:"+number3));

                    if(ActivityCompat.checkSelfPermission(Doctor_Care.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                    {
                        return;
                    }

                    startActivity(intent);

                }
                if(position==4)
                {
                    String number4="01553341061";
                    Intent intent=new Intent(Intent.ACTION_CALL);

                    intent.setData(Uri.parse("tel:"+number4));

                    if(ActivityCompat.checkSelfPermission(Doctor_Care.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                    {
                        return;
                    }

                    startActivity(intent);

                }
                if(position==5)
                {
                    String number5="01819213262";
                    Intent intent=new Intent(Intent.ACTION_CALL);

                    intent.setData(Uri.parse("tel:"+number5));

                    if(ActivityCompat.checkSelfPermission(Doctor_Care.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                    {
                        return;
                    }

                    startActivity(intent);

                }

                if(position==6)
                {
                    String number6="029660015";
                    Intent intent=new Intent(Intent.ACTION_CALL);

                    intent.setData(Uri.parse("tel:"+number6));

                    if(ActivityCompat.checkSelfPermission(Doctor_Care.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                    {
                        return;
                    }

                    startActivity(intent);

                }
                if(position==7)
                {
                    String number7="01841276556";
                    Intent intent=new Intent(Intent.ACTION_CALL);

                    intent.setData(Uri.parse("tel:"+number7));

                    if(ActivityCompat.checkSelfPermission(Doctor_Care.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                    {
                        return;
                    }

                    startActivity(intent);

                }
                if(position==8)
                {
                    String number8="01914871418";
                    Intent intent=new Intent(Intent.ACTION_CALL);

                    intent.setData(Uri.parse("tel:"+number8));

                    if(ActivityCompat.checkSelfPermission(Doctor_Care.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                    {
                        return;
                    }

                    startActivity(intent);

                }
                if(position==9)
                {
                    String number9="0248321960";
                    Intent intent=new Intent(Intent.ACTION_CALL);

                    intent.setData(Uri.parse("tel:"+number9));

                    if(ActivityCompat.checkSelfPermission(Doctor_Care.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                    {
                        return;
                    }

                    startActivity(intent);

                }

            }
        });
    }
    class MyAdapter extends ArrayAdapter<String>
    {
        Context context;
        String rTitle[];
        String rDescription[];
        int rImages[];

        MyAdapter(Context c,String title[],String description[],int imags[])
        {
            super(c,R.layout.row_data_four,R.id.textView1,title);
            this.context=c;
            this.rTitle=title;
            this.rDescription=description;
            this.rImages=imags;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row=layoutInflater.inflate(R.layout.row_data_four,parent,false);
            ImageView image1=row.findViewById(R.id.image);
            TextView myTitle=row.findViewById(R.id.textView1) ;
            TextView myDesciption=row.findViewById(R.id.textView2);

            image1.setImageResource(rImages[position]);
            myTitle.setText(rTitle[position]);
            myDesciption.setText(rDescription[position]);

            return row;
        }
    }
}
