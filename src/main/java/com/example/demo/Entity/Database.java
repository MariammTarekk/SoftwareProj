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

    public String SignUp(User person) {
        for (User persons : users) {
            if(persons.getMails().equals(person.getMails()) ){
                return "Email already exists";
            }
            if(persons.getName().equals(person.getName())){
                return "User name already exists";
            }
        }
        users.add(person);
        return "Added Successfully";
    }

    public User loginUser(SignIn user) {
        for(User persons:users){
            if(persons.getMails().equals(user.getMail())){
                if(persons.getPassward().equals(user.getPassword())){
                    return persons;
                }
            }
        }
        return null;
    }
    public Admin loginAdmin(Admin admin) {
        for(Admin persons:admins){
            if(persons.getName().equals(admin.getName())){
                if(persons.getPassword().equals(admin.getPassword())){
                    return persons;
                }
            }
        }
        return null;
    }
}
