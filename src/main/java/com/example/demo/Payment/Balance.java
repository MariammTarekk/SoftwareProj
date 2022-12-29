package com.example.demo.Payment;

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

    public boolean withdraw(double cost){
        if(cost>amount){
            return false;
        }
        amount-=cost;
        return true;
    }
    public void add(double amount){
        this.amount+=amount;
    }
}
