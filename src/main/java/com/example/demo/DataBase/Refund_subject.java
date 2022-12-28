package com.example.demo.DataBase;


import com.example.demo.model.User;
import com.example.demo.model.User_info;

import java.util.HashMap;

public class Refund_subject {
    //list of observers
    HashMap<User,String>refund_list=new HashMap<User,String>();
    public void Set_State(User User, String s){
        refund_list.put(User,s);
        System.out.println("Refund request sent");
    }
    public double refund_value(User User, String s){
        double x=0.0;
        for(int i = 0; i< User_info.arr.size(); i++){
            if(User_info.arr.get(i).service.equals(s)){
                x= User_info.arr.get(i).cost;break;
            }
        }
        return x;
    }
    public void notify_observers(User_info user,String x){
        user.messages.add(x);
    }
}
