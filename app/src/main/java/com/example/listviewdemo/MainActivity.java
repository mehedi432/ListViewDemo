package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);

        final ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Dhaka");
        arrayList.add("Rajshahi");
        arrayList.add("Khulna");
        arrayList.add("Dhaka");
        arrayList.add("Rajshahi");
        arrayList.add("Khulna");
        arrayList.add("Dhaka");
        arrayList.add("Rajshahi");
        arrayList.add("Khulna");
        arrayList.add("Dhaka");
        arrayList.add("Rajshahi");
        arrayList.add("Khulna");
        arrayList.add("Dhaka");
        arrayList.add("Rajshahi");
        arrayList.add("Khulna");
        arrayList.add("Dhaka");
        arrayList.add("Rajshahi");
        arrayList.add("Khulna");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_one, arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, arrayList.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
