package com.example.demo.Payment;

import com.example.demo.model.User;


public interface Payment {
    Balance b=new Balance(0.0);
    public String pay(User user, double cost);
}
