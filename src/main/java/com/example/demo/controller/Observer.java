package com.example.demo.controller;

import com.example.demo.DataBase.Refund_subject;
import com.example.demo.model.User;

public  abstract class Observer {
    Refund_subject subject;
    public abstract void update(User User, double value);
}
