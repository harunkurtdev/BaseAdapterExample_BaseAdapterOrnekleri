package com.example.lab08.baseadapter_customlistview.Adapter;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.lab08.baseadapter_customlistview.Model.Unluler;
import com.example.lab08.baseadapter_customlistview.R;

import java.util.List;

public class ListeAdapter extends BaseAdapter {

    private List<Unluler> unluler;
    private Context context;
    private LayoutInflater layoutInflater;

    /*
    LayoutInflater sınıfı sayesinde adapter içerisinde kullanacağımız xml layout dosyasını
    tanımlayabiliriz.
     */

    public ListeAdapter() {
    }

    public ListeAdapter(List<Unluler> unluler, Context context) {

        /*
        Dolu constructor'u üretme amacımız Adapter sınıfını çağıracağımız Activity
        sınıfında Adapter'in List <Unluler> değerini Activity'den çağırmaktadır.
         */

        this.unluler = unluler;
        this.context = context;
        layoutInflater = (LayoutInflater)
                context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

    }


    @Override
    public int getCount() {
        //listenin eleman sayısı kadar yer döndürür.
        return unluler.size();
    }

    @Override
    public Object getItem(int position) {
        // listenin kaçıncı değerindeysem ilgili satıra Object olarak döndürür.
        return unluler.get(position);
    }

    @Override
    public long getItemId(int position) {
        // bulunduğumuz satırın indisini yakalamak amacıyla kullanılır.
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /* satır görüntüsünün üretilmesi, satır içerisindeki nesnelerin tanımlanması ve nesne olaylarını
tanımlamak amaçlı kullanılır.
         */

        View v = layoutInflater.inflate(R.layout.listview_satir_goruntusu, null);
        TextView tvAdSoyad, tvSehir, tvYas;
        ImageView ivResim = v.findViewById(R.id.ivResim);
        tvSehir = v.findViewById(R.id.tvSehir);
        tvAdSoyad = v.findViewById(R.id.tvAdSoyad);
        tvYas = v.findViewById(R.id.tvYas);

        tvAdSoyad.setText(unluler.get(position).getAdSoyad());
        tvSehir.setText(unluler.get(position).getSehir());
        tvYas.setText("" + unluler.get(position).getDogumYili());
        Glide

                .with(v.getContext())
                .load(unluler.get(position).getResimUrl())
                .into(ivResim);

        return v;


        /*
            Glide kütüphanesi:
     -bir resmi web üzerinden url'den yükleyip, ImageView içerisinde göstermek istiyorsak,Glide kullanabiliriz.
     - Image Caching işlemi sayesinde resimleri hızlı açar.
         */
    }
}
