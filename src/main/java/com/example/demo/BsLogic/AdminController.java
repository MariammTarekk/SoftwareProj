package com.example.demo.BsLogic;

import com.example.demo.Entity.Database;
import com.example.demo.Entity.Service_Data;
import com.example.demo.model.Admin;
import com.example.demo.model.Discount;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AdminController {
    private Database data= Database.getInstance();
    private Service_Data dp=Service_Data.getInstance();
    Logic dpp=new Logic();
    @PostMapping(value = "/loginAdmin")
    public String loginUser(@RequestBody Admin admin) {
        data.activeadmin=dpp.loginAdmin(admin);
        if(data.activeadmin!=null){
            return "Welcome "+admin.getName();
        }
        else{
            return "Name or password is not correct";
        }
    }
    @PostMapping(value = "/adddiscount")
    public String Add_Discount(@RequestBody Discount discount){
        if(data.activeadmin!=null){
            dp.view.put(discount.getType(), discount.getPerc());
            return "Discount Added";
        }
        else return "login as admin first";
    }

    @GetMapping("/list_transactions")
    public ArrayList<String> get_trans(@RequestBody String name){
        if(data.activeadmin!=null){
            return dpp.viieww(name);
        }
        else{
            ArrayList<String>elsse=new ArrayList<>();
            elsse.add("login as admin first");
            return elsse;
        }

    }

}
