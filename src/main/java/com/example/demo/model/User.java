package com.example.demo.model;

import com.example.demo.Payment.Balance;
import com.example.demo.Payment.Credit_card;
import com.example.demo.Payment.Wallet;

import java.util.ArrayList;

public class User {
    String name="",mail="",passward="";
    String card_passward="";

    public  Balance wallet=new Balance();
    public Balance card=new Balance();
    public  ArrayList<Order> arr;
    public ArrayList<String>messages;

    public void setName(String name) {
        this.name = name;
    }

    public void setMails(String mails) {
        this.mail = mails;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }

    public void setCard_passward(String card_passward) {
        this.card_passward = card_passward;
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

    User(){
        arr=new ArrayList<Order>();
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
        return mail;
    }
}
