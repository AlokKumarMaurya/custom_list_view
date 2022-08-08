package com.example.custom_list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String a[]={"alok","avinsh","Anil","Sunil","Devesh","Vandan di","Arti di","Pooja Di"};

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);
        alok_adapter data=new alok_adapter(this,R.layout.custom_layput,a);
        listView.setAdapter(data);
    }
}