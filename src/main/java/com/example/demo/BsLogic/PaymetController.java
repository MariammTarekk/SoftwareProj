package com.example.demo.BsLogic;

import com.example.demo.Entity.Database;
import com.example.demo.Payment.*;
import com.example.demo.model.Form;
import com.example.demo.model.Order;
import com.example.demo.service.Discount_Service;
import com.example.demo.service.IService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymetController {
    Database dp=Database.getInstance();
    Wallet ob=new Wallet();
    Credit_card obb=new Credit_card();
    @PutMapping(value = "/addtowallet")
    public String Add(@RequestBody Credit_card card){
        if(dp.activeuser!=null){
            return  ob.fund(obb,card.pass,card.cost,dp.activeuser);
        }
        else return "login as user first";
    }


}
