package com.example.demo.BsLogic;

import com.example.demo.Entity.Refund_subject;
import com.example.demo.model.User;

public  abstract class Observer {
    Refund_subject subject;
    public abstract void update(User User, double value);
}
