package com.example.lab08.arrayadapter_autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String> adapter;
    String[] elemanlar = {"bilgisayar", "bim", "bimeks", "bitcoin", "araba", "artist", "telefon", "telgraf"
            , "televizyon", "tel"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        adapter = new ArrayAdapter<>(

                this,
                android.R.layout.simple_dropdown_item_1line,
                elemanlar
        );

        autoCompleteTextView.setThreshold(2);
        autoCompleteTextView.setAdapter(adapter);
    }
}
