package com.example.demo.service;


public class Donations implements IService {
    double cost=40.0;
    public Donations(){
        System.out.println("Pay 40 dollars for donations");
    }

    @Override
    public double getcost() {
        return cost;
    }
}
