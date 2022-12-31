package com.example.demo.service;


public class Internet implements IService {

    double cost=30.0;
    public Internet(){

    }

    @Override
    public double getcost() {
        return cost ;
    }
    @Override
    public void setCost(double v) {

    }

}
