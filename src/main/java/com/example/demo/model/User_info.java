package com.example.demo.model;

import com.example.demo.Payment.Balance;
import com.example.demo.Payment.Credit_card;
import com.example.demo.Payment.Wallet;

import java.util.ArrayList;

public class User_info extends User{
    public static Balance wallet;
    Balance card;
    public static ArrayList<Order> arr;
     public ArrayList<String>messages;
    User_info(){
        arr=new ArrayList<Order>();
        wallet =new Wallet(0.0);
        card =new Credit_card(0.0);
    }
}
