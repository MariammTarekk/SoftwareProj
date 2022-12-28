package com.example.demo.Payment;

import com.example.demo.model.User;
import com.example.demo.model.User_info;

public interface Payment {
    Balance b=new Balance(0.0);
    public void pay(User_info User, double cost);
}
