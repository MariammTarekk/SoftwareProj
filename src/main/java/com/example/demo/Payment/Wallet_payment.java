package com.example.demo.Payment;


import com.example.demo.model.User;
import com.example.demo.model.User_info;

public class Wallet_payment implements Payment{
    @Override
    public void pay(User_info User, double cost) {
        if(User_info.wallet.amount>=cost)User.wallet.amount-=cost;
        else System.out.println("Check your balance !");
    }
}
