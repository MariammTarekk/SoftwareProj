package com.example.demo.Payment;


import com.example.demo.model.User;

public class Credit_card extends Balance{
    public double cost=0.0;
    public String pass="";
    public Credit_card(double amount) {
        super(amount);
    }

    public Credit_card() {

    }

    boolean check(String x, User user){
        if(user.getCard_Pass().equals(x))return true;
        else return false;
    }
}
