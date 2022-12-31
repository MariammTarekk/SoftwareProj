package com.example.demo.Entity;


import com.example.demo.model.User;

import java.util.HashMap;

public class Refund_subject {
    //list of observers
    public HashMap<User,String>refund_list=new HashMap<User,String>();
    public static Refund_subject instance=new Refund_subject();
    public static Refund_subject getInstance(){
        return instance;
    }
    private Refund_subject(){}
    public String Set_State(User User, String s){
        refund_list.put(User,s);
        return "Refund request sent";
    }
    public double refund_value(User User, String s){
        double x=0.0;
        for(int i = 0; i< User.arr.size(); i++){
            if(User.arr.get(i).service.equals(s)){
                x= User.arr.get(i).cost;break;
            }
        }
        return x;
    }
    public void notify_observers(User user,String x){
        user.messages.add(x);
    }
}
