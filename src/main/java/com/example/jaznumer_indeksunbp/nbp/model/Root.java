package com.example.jaznumer_indeksunbp.nbp.model;


import java.util.List;

public class Root{

    public String data;
    public double cena;

    public List<Rate> rates;

    public List<Rate> getRates() {
        return rates;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }


}

