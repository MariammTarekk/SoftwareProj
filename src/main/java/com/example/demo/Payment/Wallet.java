package com.example.demo.Payment;

import com.example.demo.model.User;

public class Wallet extends Balance {
    public Wallet(double amount) {
        super(amount);
    }

    public Wallet() {
    }

    public String fund(Credit_card card, String pass, double cost, User user){
        if(card.check(pass,user)){
            if(card.withdraw(cost,user)){
                user.wallets.add("add "+cost+" to the wallet");
                user.wallet.amount+=cost;
                return "Operation Done";
            }
            else return "check balance";

        }
        else{
            return "check password";
        }

    }
}
