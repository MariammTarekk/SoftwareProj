package com.example.demo.service;

import com.example.demo.Entity.Service_Data;

public class Discount_Service implements IService {
    IService service;
    double percent;
    public Discount_Service(IService service, Service_Data serve, String name){
        this.service=service;
        this.percent=serve.view.get(name);
    }

    @Override
    public double getcost() {
        double x=service.getcost();
        x-=(x/100.0)* percent;
        return x;
    }
}
