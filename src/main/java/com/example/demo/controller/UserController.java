package com.example.demo.controller;

import com.example.demo.DataBase.Application;
import com.example.demo.model.Admin;
import com.example.demo.model.SignIn;
import com.example.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    private Application data=new Application();
    User activeuser;
    Admin activeadmin;

    @PostMapping(value = "/signup")
    public String Signup(@RequestBody User user){
        return data.SignUp(user);
    }

    @PostMapping(value = "/loginUser")
    public String loginUser(@RequestBody SignIn user) {
        activeuser = data.loginUser(user);
        if(activeuser!=null){
            return "Welcome to Fawry System";
        }
        else{
            return"Email or password is not correct";
        }
    }
    @PostMapping(value = "/loginAdmin")
    public String loginUser(@RequestBody Admin admin) {
        activeadmin=data.loginAdmin(admin);
        if(activeadmin!=null){
            return "Welcome "+admin.getName();
        }
        else{
            return "Name or password is not correct";
        }
    }
    @PostMapping(value = "/signout")
    public String SignOut(){
        if(activeuser==null){
            activeadmin=null;
            return "SignOut successfully";
        }
        else{
            activeuser=null;
            return "SignOut successfully";
        }
    }

    @GetMapping("/dummy")
    public ArrayList<User> getAll() {
        return data.users;
    }

}

