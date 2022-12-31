package com.example.demo.service;

public class Mobile implements IService {
    double cost=20.0;
    public Mobile(){
        System.out.println("Pay 20 dollar for mobile recharge");
    }

    @Override
    public double getcost() {
        return cost;
    }
    @Override
    public void setCost(double v) {

    }

}
