package com.example.demo.Payment;

import com.example.demo.model.User;

public class Cache_payment implements Payment {
    @Override
    public String pay(User user, double cost) {
        return "Thank You";
    }
}
