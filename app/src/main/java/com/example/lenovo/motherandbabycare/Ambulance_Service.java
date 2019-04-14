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

public class Ambulance_Service extends AppCompatActivity {
    ListView listView;
    String mTitle[]={"Ahad Ambulance Service","Al Amin Ambulance","Al Amin Ambulance","Al Amin Ambulance","Al Amin Ambulance",
            "Anjumand Mufidul Islam","Barishal Ambulance Service","Gazi Ambulance Service","HASBD","SP Ambulance Service","Sylhet Ambulance Service"};
    String mDescription[]={"Dhaka","Cox's Bazar","Dhaka","Mymensingh","Rajshahi","Dhaka","Barishal","Khulna","Dhaka","Chittagong","Sylhet"};
    int images[] ={R.drawable.phone_image,R.drawable.phone_image,R.drawable.phone_image, R.drawable.phone_image,R.drawable.phone_image,R.drawable.phone_image,
            R.drawable.phone_image,R.drawable.phone_image,R.drawable.phone_image,R.drawable.phone_image,R.drawable.phone_image};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulance__service);

        getSupportActionBar().setTitle("Ambulance Service");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView=findViewById(R.id.listView);
        MyAdapter adapter=new MyAdapter(this,mTitle,mDescription,images);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    String number0="01767732599";
                    Intent intent=new Intent(Intent.ACTION_CALL);

                    intent.setData(Uri.parse("tel:"+number0));

                    if(ActivityCompat.checkSelfPermission(Ambulance_Service.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                    {
                        return;
                    }

                    startActivity(intent);
                }
                if(position==1)
                {
                    String number1="01720448666";
                    Intent intent=new Intent(Intent.ACTION_CALL);

                    intent.setData(Uri.parse("tel:"+number1));

                    if(ActivityCompat.checkSelfPermission(Ambulance_Service.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                    {
                        return;
                    }

                    startActivity(intent);

                }
                if(position==2)
                {
                    String number2="01819137479";
                    Intent intent=new Intent(Intent.ACTION_CALL);

                    intent.setData(Uri.parse("tel:"+number2));

                    if(ActivityCompat.checkSelfPermission(Ambulance_Service.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                    {
                        return;
                    }

                    startActivity(intent);

                }
                if(position==3)
                {
                    String number3="01720448666";
                    Intent intent=new Intent(Intent.ACTION_CALL);

                    intent.setData(Uri.parse("tel:"+number3));

                    if(ActivityCompat.checkSelfPermission(Ambulance_Service.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                    {
                        return;
                    }

                    startActivity(intent);

                }
                if(position==4)
                {
                    String number4="01819137479";
                    Intent intent=new Intent(Intent.ACTION_CALL);

                    intent.setData(Uri.parse("tel:"+number4));

                    if(ActivityCompat.checkSelfPermission(Ambulance_Service.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                    {
                        return;
                    }

                    startActivity(intent);

                }
                if(position==5)
                {
                    String number5="029336611";
                    Intent intent=new Intent(Intent.ACTION_CALL);

                    intent.setData(Uri.parse("tel:"+number5));

                    if(ActivityCompat.checkSelfPermission(Ambulance_Service.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                    {
                        return;
                    }

                    startActivity(intent);

                }

                if(position==6)
                {
                    String number6="01707805432";
                    Intent intent=new Intent(Intent.ACTION_CALL);

                    intent.setData(Uri.parse("tel:"+number6));

                    if(ActivityCompat.checkSelfPermission(Ambulance_Service.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                    {
                        return;
                    }

                    startActivity(intent);

                }
                if(position==7)
                {
                    String number7="01779656810";
                    Intent intent=new Intent(Intent.ACTION_CALL);

                    intent.setData(Uri.parse("tel:"+number7));

                    if(ActivityCompat.checkSelfPermission(Ambulance_Service.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                    {
                        return;
                    }

                    startActivity(intent);

                }
                if(position==8)
                {
                    String number8="01701777782";
                    Intent intent=new Intent(Intent.ACTION_CALL);

                    intent.setData(Uri.parse("tel:"+number8));

                    if(ActivityCompat.checkSelfPermission(Ambulance_Service.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                    {
                        return;
                    }

                    startActivity(intent);

                }

                if(position==9)
                {
                    String number9="01765555770";
                    Intent intent=new Intent(Intent.ACTION_CALL);

                    intent.setData(Uri.parse("tel:"+number9));

                    if(ActivityCompat.checkSelfPermission(Ambulance_Service.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                    {
                        return;
                    }

                    startActivity(intent);

                }
                if(position==10)
                {
                    String number10="017215205851";
                    Intent intent=new Intent(Intent.ACTION_CALL);

                    intent.setData(Uri.parse("tel:"+number10));

                    if(ActivityCompat.checkSelfPermission(Ambulance_Service.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
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
            super(c,R.layout.row_data_three,R.id.textView1,title);
            this.context=c;
            this.rTitle=title;
            this.rDescription=description;
            this.rImages=imags;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row=layoutInflater.inflate(R.layout.row_data_three,parent,false);
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
