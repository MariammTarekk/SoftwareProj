package com.example.demo.Payment;


import com.example.demo.model.User;


public class Credit_payment implements Payment {
//    public boolean req(Credit_card card, String password){
//        if(card.check(password))return true;
//        return false;
//    }
    @Override
    public String pay(User User, double cost) {

        if(User.card.amount>=cost){
            User.card.amount-=cost;
            return "Payment Done from Credit Card";
        }
        else return "Check your Balance";
    }
}
