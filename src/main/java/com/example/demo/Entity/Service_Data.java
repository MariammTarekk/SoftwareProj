package com.example.demo.Entity;


import java.util.HashMap;
import java.util.Map;

public class Service_Data {
    public HashMap<String,Double>view;
    String test="";
    private Service_Data(){
        view=new HashMap<String,Double>();
        view.put("Mobile",0.0);
        view.put("Internet",0.0);
        view.put("LandLine",0.0);
        view.put("Donations",0.0);
        view.put("Overall",0.0);
    }
    private static Service_Data instance=new Service_Data();
    public static Service_Data getInstance(){
        return instance;
    }
    public String getTest() {
        return test;
    }


    public String search(String s){
        for (Map.Entry<String,Double> entry :view.entrySet()){
            if(entry.getKey().equals(s)){
                return s+" Service Available" ;
            }
        }
        return "Service Not Found";
    }
    public void list(){
        for (Map.Entry<String,Double> entry :view.entrySet()){
            System.out.println(entry.getKey());
        }
    }

}

