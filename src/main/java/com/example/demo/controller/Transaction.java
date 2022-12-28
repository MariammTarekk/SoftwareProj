package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.model.User_info;

public class Transaction extends Observer{
    public void update(User User, double value){
        User_info.wallet.amount+=value;
        System.out.println("Upadte Done");
    }
}
