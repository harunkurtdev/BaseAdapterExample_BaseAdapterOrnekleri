package com.example.lab08.arrayadapter_listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.tvBaslik);

        String ad = getIntent().getStringExtra("baslik");
        textView.setText(ad);
        /*
        intent ile bir önceki sayfadan putExtra içerisine gönderilen veriyi,
        key-value formatında açılan sayfa içerisinde yakalayabiliriz.
         */

    }
}
