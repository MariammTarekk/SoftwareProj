package com.example.demo.Payment;

import com.example.demo.model.User;

public class Balance {
    public double amount=0.0;
    Balance(double amount) {
        this.amount=amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
    public Balance(){}

    public boolean withdraw(double cost, User user){
        if(cost>user.card.amount){
            return false;
        }
        user.card.amount-=cost;
        return true;
    }
    public void add(double amount){
        this.amount+=amount;
    }
}
