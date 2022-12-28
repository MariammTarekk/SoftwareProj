package com.example.demo.controller;

import com.example.demo.model.User;

public class Transaction extends Observer{
    public void update(User User, double value){
        User.wallet.amount+=value;
        System.out.println("Upadte Done");
    }
}
