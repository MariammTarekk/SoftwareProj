package com.example.demo.Payment;

import com.example.demo.model.User;

public class Wallet_payment implements Payment{
    @Override
    public String pay(User user, double cost) {
        if(user.wallet.amount>=cost){
            user.wallet.amount-=cost;
            return "Payment Done from Wallet";
        }
        else return "Check your balance !";
    }
}
