package com.example.demo.controller;

import com.example.demo.Entity.Database;
import com.example.demo.model.Admin;
import com.example.demo.model.SignIn;
import com.example.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class UserController {
    private Database data= Database.getInstance();

    @PostMapping(value = "/signup")
    public String Signup(@RequestBody User user){
        return data.SignUp(user);
    }

    @PostMapping(value = "/loginUser")
    public String loginUser(@RequestBody SignIn user) {
        data.activeuser = data.loginUser(user);
        if(data.activeuser!=null){
            return "Welcome to Fawry System";
        }
        else{
            return"Email or password is not correct";
        }
    }
    @PostMapping(value = "/loginAdmin")
    public String loginUser(@RequestBody Admin admin) {
        data.activeadmin=data.loginAdmin(admin);
        if(data.activeadmin!=null){
            return "Welcome "+admin.getName();
        }
        else{
            return "Name or password is not correct";
        }
    }
    @PostMapping(value = "/signout")
    public String SignOut(){
        if(data.activeuser==null){
            data.activeadmin=null;
            return "SignOut successfully";
        }
        else{
            data.activeuser=null;
            return "SignOut successfully";
        }
    }

    @GetMapping("/dummy")
    public ArrayList<User> getAll() {
        return data.users;
    }

}

