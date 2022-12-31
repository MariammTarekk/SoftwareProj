package com.example.demo.model;

import com.example.demo.Payment.Balance;

import java.util.ArrayList;

public class User {
    String name="";
    String mail="";
    String user_Pass ="";
    String card_Pass ="";

    public  Balance wallet=new Balance();
    public Balance card=new Balance();
    public  ArrayList<Order> arr;
    public ArrayList<String>wallets;
    public ArrayList<String>messages;

    public String getUser_Pass() {
        return user_Pass;
    }

    public void setUser_Pass(String user_Pass) {
        this.user_Pass = user_Pass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCard_Pass(String card_Pass) {
        this.card_Pass = card_Pass;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }



    public void setArr(ArrayList<Order> arr) {
        this.arr = arr;
    }

    public Balance getWallet() {
        return wallet;
    }

    public void setWallet(Balance wallet) {
        this.wallet = wallet;
    }

    public Balance getCard() {
        return card;
    }

    public void setCard(Balance card) {
        this.card = card;
    }

    public  ArrayList<Order> getArr() {
        return arr;
    }


    public ArrayList<String> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<String> messages) {
        this.messages = messages;
    }

    public User(){

        arr=new ArrayList<Order>();
        wallets=new ArrayList<String>();
        messages=new ArrayList<String>();
    }
    public String getName() {
        return name;
    }


    public String getCard_Pass() {
        return card_Pass;
    }

    public String getMail() {
        return mail;
    }
}
