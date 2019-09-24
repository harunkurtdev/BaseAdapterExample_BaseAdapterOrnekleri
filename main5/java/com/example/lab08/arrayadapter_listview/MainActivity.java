package com.example.lab08.arrayadapter_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<String> adapter;
    String[] diller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diller = new String[5];
        diller[0] = "Java";
        diller[1] = "Swift";
        diller[2] = "C#";
        diller[3] = "C++";
        diller[4] = "JavaScript";

        listView = findViewById(R.id.listView);
        adapter = new ArrayAdapter<>(

                this,
                android.R.layout.simple_list_item_1,
                diller


        );

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("baslik", diller[position]);
                startActivity(intent);

            }
        });
    }
}
