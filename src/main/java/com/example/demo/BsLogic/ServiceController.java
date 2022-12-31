package com.example.demo.BsLogic;

import com.example.demo.Entity.Database;
import com.example.demo.Payment.Cache_payment;
import com.example.demo.Payment.Credit_payment;
import com.example.demo.Payment.Payment;
import com.example.demo.Payment.Wallet_payment;
import com.example.demo.Providers.*;
import com.example.demo.model.Form;
import com.example.demo.model.Order;
import com.example.demo.service.Discount_Service;
import com.example.demo.service.IService;
import com.example.demo.service.LandLine;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ServiceController {
    private Database data= Database.getInstance();
    @PostMapping(value = "/pay")
    public String Client(@RequestBody Form form){
        if(data.activeuser!=null){
            if(form.ServiceName.equals("Internet")){
                if(form.CompanyName.equals("Vodafone")){
                    Companies objj=new Vodafone();
                    IService s =objj.createInternet();
                    return getCost(form,s,data);
                }
                else if(form.getCompanyName().equals("Etisalat")){
                    Companies objj=new Etisalat();
                    IService s =objj.createInternet();
                    return getCost(form,s,data);
                }
                else if(form.getCompanyName().equals("We")){
                    Companies objj=new We();
                    IService s =objj.createInternet();
                    return getCost(form,s,data);
                }
                else if(form.getCompanyName().equals("Orange")){
                    Companies objj=new Orange();
                    IService s =objj.createInternet();
                    return getCost(form,s,data);
                }
                else return "Not Found";

            }
            else if(form.getServiceName().equals("Mobile")){
                if(form.getCompanyName().equals("Vodafone")){
                    Companies objj=new Vodafone();
                    IService s =objj.createMobile();
                    return getCost(form,s,data);
                }
                else if(form.getCompanyName().equals("Etisalat")){
                    Companies objj=new Etisalat();
                    IService s =objj.createMobile();
                    return getCost(form,s,data);
                }
                else if(form.getCompanyName().equals("We")){
                    Companies objj=new We();
                    IService s =objj.createMobile();
                    return getCost(form,s,data);
                }
                else if(form.getCompanyName().equals("Orange")){
                    Companies objj=new Orange();
                    IService s=objj.createMobile();
                    return getCost(form,s,data);
                }
                else return "Not Found";
            }
            else if(form.getServiceName().equals("LandLine")){
                if(form.getCompanyName().equals("Month")){
                    IService ob=new LandLine();
                    return getCost(form,ob,data);
                }
                else if(form.getCompanyName().equals("Quarter")){
                    IService ob=new LandLine();
                    ob.setCost(ob.getcost()*4);
                    return getCost(form,ob,data);
                }
                else  return "Not Found";
            }
            else if(form.getServiceName().equals("Donations")){
                if(form.getCompanyName().equals("school")){
                    Companies objj=new Schools();
                    IService s=objj.createDonations();
                    return getCost(form,s,data);
                }
                else if(form.getCompanyName().equals("NGOS")){
                    Companies objj=new NGOS();
                    IService s=objj.createDonations();
                    return getCost(form,s,data);
                }
                else if(form.getCompanyName().equals("Hospital")){
                    Companies objj=new Hospitals();
                    IService s=objj.createDonations();
                    return getCost(form,s,data);
                }
                else return "Not Found";

            }
            else{
                return "Not Found";
            }
        }
        else return "login as user first";
    }
    public String getCost(Form form, IService s, Database data){
        if(form.PayMethod==1){
            Payment paye=new Wallet_payment();
            double cost=s.getcost();
            if(form.data.view.get("Overall")>0.0){
                s=new Discount_Service(s,form.data,"Overall");cost= s.getcost();
            }
            if(form.data.view.get("Internet")>0.0){
                s=new Discount_Service(s,form.data,"Internet");cost= s.getcost();
            }
            // active user , cost
            String res=paye.pay(data.activeuser,cost);


            Order ord=new Order();ord.service=form.getServiceName();ord.cost=cost;
            data.activeuser.arr.add(ord);
            return res+" your wallet : "+data.activeuser.wallet.amount;
        }
        else if(form.getPayMethod()==2){
            Payment paye=new Credit_payment();
            double cost=s.getcost();
            if(form.data.view.get("Overall")>0.0){
                s=new Discount_Service(s,form.data,"Overall");cost= s.getcost();
            }
            if(form.data.view.get("Internet")>0.0){
                s=new Discount_Service(s,form.data,"Internet");cost= s.getcost();
            }
            // active user , cost
            String res= paye.pay(data.activeuser,cost);

            Order ord=new Order();ord.service=form.getServiceName();ord.cost=cost;
            data.activeuser.arr.add(ord);
            return res+" your credit card : "+data.activeuser.card.amount;
        }
        else{
            Payment paye=new Cache_payment();
            double cost=s.getcost();
            if(form.data.view.get("Overall")>0.0){
                s=new Discount_Service(s,form.data,"Overall");cost= s.getcost();
            }
            if(form.data.view.get("Internet")>0.0){
                s=new Discount_Service(s,form.data,"Internet");cost= s.getcost();
            }
            // active user , cost
            String res=paye.pay(data.activeuser,cost);


            Order ord=new Order();ord.service=form.getServiceName();ord.cost=cost;
            data.activeuser.arr.add(ord);
            return res;
        }
    }

}
