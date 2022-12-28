package com.example.demo.controller;

import com.example.demo.Entity.Database;
import com.example.demo.Payment.Credit_payment;
import com.example.demo.Payment.Payment;
import com.example.demo.Payment.Wallet_payment;
import com.example.demo.Providers.*;
import com.example.demo.model.Form;
import com.example.demo.model.Order;
import com.example.demo.service.Discount_Service;
import com.example.demo.service.IService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
    private Database data= Database.getInstance();
    @PostMapping(value = "/pay")
    public String Client(@RequestBody Form form){
        System.out.println(form.getServiceName());
        if(form.ServiceName.equals("Internet")){
            if(form.CompanyName.equals("Vodafone")){
                Companies objj=new Vodafone();
                IService s =objj.createInternet();
                if(form.PayMethod==1){
                    Payment paye=new Wallet_payment();
                    double cost=s.getcost();
                    if(form.data.view.get("Overall")>0.0){
                        s=new Discount_Service(s,form.data,"Overall");cost= s.getcost();
                    }
                    if(form.data.view.get("Internet")>0.0){
                        s=new Discount_Service(s,form.data,"Internet");cost= s.getcost();
                    }
                    data.activeuser.wallet.amount=240.0;
                    // active user , cost
                    paye.pay(data.activeuser,cost);

                    Order ord=new Order();ord.service=form.getServiceName();ord.cost=cost;
                    data.activeuser.arr.add(ord);
                    return form.getServiceName()+" "+form.getCompanyName();
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
                    paye.pay(data.activeuser,cost);

                    Order ord=new Order();ord.service=form.getServiceName();ord.cost=cost;
                    data.activeuser.arr.add(ord);
                    return form.getServiceName()+" "+form.getCompanyName();
                }
                else{
                    Payment paye=new Wallet_payment();
                    double cost=s.getcost();
                    if(form.data.view.get("Overall")>0.0){
                        s=new Discount_Service(s,form.data,"Overall");cost= s.getcost();
                    }
                    if(form.data.view.get("Internet")>0.0){
                        s=new Discount_Service(s,form.data,"Internet");cost= s.getcost();
                    }
                    // active user , cost
                    paye.pay(data.activeuser,cost);

                    Order ord=new Order();ord.service=form.getServiceName();ord.cost=cost;
                    data.activeuser.arr.add(ord);
                    return form.getServiceName()+" "+form.getCompanyName();
                }

            }
            else if(form.getCompanyName().equals("Etisalat")){
                Companies objj=new Etisalat();
                IService s =objj.createInternet();
                return "";
            }
            else if(form.getCompanyName().equals("We")){
                Companies objj=new We();
                IService s =objj.createInternet();
                return "";
            }
            else if(form.getCompanyName().equals("Orange")){
                Companies objj=new Orange();
                IService s =objj.createInternet();
                return "";
            }
            else return "Not Found";

        }
        else if(form.getServiceName().equals("Mobile")){
            if(form.getCompanyName().equals("Vodafone")){
                Companies objj=new Vodafone();
                IService s =objj.createMobile();
                return "";
            }
            else if(form.getCompanyName().equals("Etisalat")){
                Companies objj=new Etisalat();
                objj.createMobile();
                return "";
            }
            else if(form.getCompanyName().equals("We")){
                Companies objj=new We();
                IService s =objj.createMobile();
                return "";
            }
            else if(form.getCompanyName().equals("Orange")){
                Companies objj=new Orange();
                IService s=objj.createMobile();
                return "";
            }
            else return "Not Found";

        }
        else if(form.getServiceName().equals("LandLine")){
            if(form.getCompanyName().equals("Month")){
                return "";
            }
            else if(form.getCompanyName().equals("Quarter")){
                return "";
            }
           else  return "Not Found";
        }
        else if(form.getServiceName().equals("Donations")){
            if(form.getCompanyName().equals("school")){
                return "";
            }
            else if(form.getCompanyName().equals("NGOS")){
                return "";
            }
            else if(form.getCompanyName().equals("Hospital")){
                return "";
            }
            else return "Not Found";

        }
        else{
            return "Not Found";
        }

    }
}
