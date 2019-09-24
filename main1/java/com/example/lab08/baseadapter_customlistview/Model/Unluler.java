package com.example.lab08.baseadapter_customlistview.Model;

public class Unluler {

    private int dogumYili;
    private String adSoyad;
    private String resimUrl;
    private String sehir;


    public Unluler() {
    }

    public Unluler(int dogumYili, String adSoyad, String resimUrl, String sehir) {
        this.dogumYili = dogumYili;
        this.adSoyad = adSoyad;
        this.resimUrl = resimUrl;
        this.sehir = sehir;
    }

    public int getDogumYili() {
        return dogumYili;
    }

    public void setDogumYili(int dogumYili) {
        this.dogumYili = dogumYili;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getResimUrl() {
        return resimUrl;
    }

    public void setResimUrl(String resimUrl) {
        this.resimUrl = resimUrl;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }




}


