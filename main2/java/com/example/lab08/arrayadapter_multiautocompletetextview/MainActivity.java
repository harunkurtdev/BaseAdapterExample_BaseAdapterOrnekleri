package com.example.lab08.arrayadapter_multiautocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    MultiAutoCompleteTextView mactv;
    ArrayAdapter<String> adapter;
    String[] degerler = {"istanbul", "isviçre", "ispanya", "ankara", "antalya", "almanya", "alanya", "elazıg"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mactv = findViewById(R.id.multiAutoCompleteTextView);
        adapter = new ArrayAdapter<>(

                this,
                android.R.layout.simple_dropdown_item_1line,
                degerler
        );
        mactv.setThreshold(2);
        mactv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        mactv.setAdapter(adapter);
    }
}
