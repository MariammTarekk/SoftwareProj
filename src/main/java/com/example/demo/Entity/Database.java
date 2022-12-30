package com.example.demo.Entity;

import com.example.demo.model.Admin;
import com.example.demo.model.SignIn;
import com.example.demo.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class Database {
    public ArrayList<User> users = new ArrayList<User>();
    private static Database instance=new Database();
    private Database(){}
    public User activeuser;
    public Admin activeadmin;

    public static Database getInstance(){
        return instance;
    }
    public Admin[]admins={
            new Admin("Ahmed","1234"),
            new Admin("Aliah","123"),
            new Admin("Mariam","12345")
    };


}
