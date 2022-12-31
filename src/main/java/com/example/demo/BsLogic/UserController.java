package com.example.demo.BsLogic;

import com.example.demo.Entity.Database;
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
    Display dp=new Display();
    @PostMapping(value = "/signup")
    public String Signup(@RequestBody User user){

        return dp.SignUp(user);
    }

    @PostMapping(value = "/loginUser")
    public String loginUser(@RequestBody SignIn user) {
        data.activeuser = dp.loginUser(user);
        if(data.activeuser!=null){
            return "Welcome to Fawry System";
        }
        else{
            return"Email or password is not correct";
        }
    }

    @PostMapping(value = "/signoutUser")
    public String SignOut(){
        if(data.activeuser!=null){
            data.activeuser=null;
            return "SignOut successfully";
        }
        else{
            return "SignOut successfully";
        }
    }

    @GetMapping("/dummy")
    public ArrayList<User> getAll() {
        return data.users;
    }

}

