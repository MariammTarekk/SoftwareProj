package com.example.demo.model;

import com.example.demo.Entity.Service_Data;

public class Form {
    public String ServiceName;
    public String CompanyName;
    public int PayMethod;
    public Service_Data data=Service_Data.getInstance();
    public int getPayMethod() {
        return PayMethod;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public String getServiceName() {
        return ServiceName;
    }
}
