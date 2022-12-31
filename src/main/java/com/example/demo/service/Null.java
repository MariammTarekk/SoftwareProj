package com.example.demo.service;


public class Null implements IService {
    public Null(){
        System.out.println("Not Available");
    }


    @Override
    public double getcost() {
        return 0;
    }
    @Override
    public void setCost(double v) {

    }
}
