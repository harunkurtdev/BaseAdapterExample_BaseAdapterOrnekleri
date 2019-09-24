package com.example.lab08.baseadapter_customlistview.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.lab08.baseadapter_customlistview.Adapter.ListeAdapter;
import com.example.lab08.baseadapter_customlistview.Model.Unluler;
import com.example.lab08.baseadapter_customlistview.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView liste;
    ListAdapter adapter;
    List<Unluler> unluler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        liste = findViewById(R.id.listview) ;
        unluler = new ArrayList<>();
        /*
        int dogumYili, String adSoyad, String resimUrl, String sehir
         */

        unluler.add(new Unluler(1954,"Sezen Aksu",
                "https://yt3.ggpht.com/a-/AN66SAyyM11d5Ev7vXi_QJbwm1DMMhPAL-UctPaJ9w=s900-mo-c-c0xffffffff-rj-k-no","İstanbul"));
        adapter = new ListeAdapter(unluler,getApplicationContext());
        liste.setAdapter(adapter);

    }
}
