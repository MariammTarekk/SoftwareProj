package com.example.demo.Payment;

import com.example.demo.model.User;
import com.example.demo.model.User_info;

public class Cache_payment implements Payment {
    @Override
    public void pay(User_info User, double cost) {
        System.out.println("Done");
    }
}
