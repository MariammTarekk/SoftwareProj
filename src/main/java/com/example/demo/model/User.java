package com.example.demo.model;

import com.example.demo.Payment.Balance;
import com.example.demo.Payment.Credit_card;
import com.example.demo.Payment.Wallet;

import java.util.ArrayList;

public class User {
    String name="",mails="",passward="";
    String card_passward="";
    public  Balance wallet;
    public Balance card;
    public static ArrayList<Order> arr;
    public ArrayList<String>messages;
    User(){
        arr=new ArrayList<Order>();
        wallet =new Wallet(200.0);
        card =new Credit_card(100.0);
    }
    public String getName() {
        return name;
    }

    public String getPassward() {
        return passward;
    }

    public String getCard_passward() {
        return card_passward;
    }

    public String getMails() {
        return mails;
    }
}
