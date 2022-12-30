package com.example.demo.model;

public class Discount {
    String Type="";
    double perc=0.0;

    public double getPerc() {
        return perc;
    }

    public String getType() {
        return Type;
    }

    public void setPerc(double perc) {
        this.perc = perc;
    }

    public void setType(String type) {
        Type = type;
    }
}
