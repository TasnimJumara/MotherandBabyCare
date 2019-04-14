package com.example.lenovo.motherandbabycare;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class Baby_Appearance extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baby__appearance);

        getSupportActionBar().setTitle("Baby Appearance");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView=(ListView)findViewById(R.id.listView);

        ArrayAdapter<String>mAdapter=new ArrayAdapter<String>(Baby_Appearance.this,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.appearance_week));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(Baby_Appearance.this,Appearance_Listdata.class);
                intent.putExtra("Week_Name",listView.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });

        listView.setAdapter(mAdapter);
    }
}
