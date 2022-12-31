package com.example.demo.BsLogic;

import com.example.demo.Entity.Database;
import com.example.demo.Entity.Refund_subject;
import com.example.demo.model.Admin;
import com.example.demo.model.SignIn;
import com.example.demo.model.User;

import java.util.ArrayList;
import java.util.Map;

public class Display {
    Database dp=Database.getInstance();
    Refund_subject data=Refund_subject.getInstance();
    public String SignUp(User person) {
        for (User persons : dp.users) {
            if(persons.getMail().equals(person.getMail()) ){
                return "Email already exists";
            }
            if(persons.getName().equals(person.getName())){
                return "User name already exists";
            }
        }
        dp.users.add(person);
        return "Added Successfully";
    }

    public User loginUser(SignIn user) {
        for(User persons:dp.users){
            if(persons.getMail().equals(user.getMail())){
                if(persons.getUser_Pass().equals(user.getUser_Pass())){
                    return persons;
                }
            }
        }
        return null;
    }
    public Admin loginAdmin(Admin admin) {
        for(Admin persons:dp.admins){
            if(persons.getName().equals(admin.getName())){
                if(persons.getPassword().equals(admin.getPassword())){
                    return persons;
                }
            }
        }
        return null;
    }
    public ArrayList<String> viieww(String s){
        ArrayList<String>any=new ArrayList<>();
        int indx=-1;
        for (int i=0;i<dp.users.size();i++){
            if(dp.users.get(i).getName().equals(s)){
                indx=i;break;
            }
        }
        for (int i=0;i<dp.users.get(indx).getArr().size();i++){
            any.add("user do service "+dp.users.get(indx).arr.get(i).service+" cost "+dp.users.get(indx).arr.get(i).cost);
        }
        for (int i=0;i<dp.users.get(indx).wallets.size();i++){
            any.add(dp.users.get(indx).wallets.get(i));
        }
        for(Map.Entry<User,String> entry :data.refund_list.entrySet()){
            if(entry.getKey().getName().equals(s)){
                any.add("user do refund for "+entry.getValue()+" service");
            }
        }
        return any;
    }
}
