package com.example.demo.service;

public class Mobile implements IService {
    double cost=20.0;
    public Mobile(){
    }

    @Override
    public double getcost() {
        return cost;
    }
    @Override
    public void setCost(double v) {

    }

}
