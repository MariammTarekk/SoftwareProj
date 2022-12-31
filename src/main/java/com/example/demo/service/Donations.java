package com.example.demo.service;


public class Donations implements IService {
    double cost=40.0;
    public Donations(){
    }

    @Override
    public double getcost() {
        return cost;
    }

    @Override
    public void setCost(double v) {

    }
}
