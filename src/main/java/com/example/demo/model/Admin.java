package com.example.demo.model;

public class Admin {
    String name="";
    String password="";

    public Admin(String name, String pass) {
        this.name=name;
        this.password=pass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
