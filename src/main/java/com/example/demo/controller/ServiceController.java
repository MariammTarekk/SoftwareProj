package com.example.demo.controller;

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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
    private Database data= Database.getInstance();
    @PostMapping(value = "/pay")
    public String Client(@RequestBody Form form){
        GetCost obb=new GetCost();
        if(form.ServiceName.equals("Internet")){
            if(form.CompanyName.equals("Vodafone")){
                Companies objj=new Vodafone();
                IService s =objj.createInternet();
                return obb.get(form,s,data);
            }
            else if(form.getCompanyName().equals("Etisalat")){
                Companies objj=new Etisalat();
                IService s =objj.createInternet();
                return obb.get(form,s,data);
            }
            else if(form.getCompanyName().equals("We")){
                Companies objj=new We();
                IService s =objj.createInternet();
                return obb.get(form,s,data);
            }
            else if(form.getCompanyName().equals("Orange")){
                Companies objj=new Orange();
                IService s =objj.createInternet();
                return obb.get(form,s,data);
            }
            else return "Not Found";

        }
        else if(form.getServiceName().equals("Mobile")){
            if(form.getCompanyName().equals("Vodafone")){
                Companies objj=new Vodafone();
                IService s =objj.createMobile();
                return obb.get(form,s,data);
            }
            else if(form.getCompanyName().equals("Etisalat")){
                Companies objj=new Etisalat();
                IService s =objj.createMobile();
                return obb.get(form,s,data);
            }
            else if(form.getCompanyName().equals("We")){
                Companies objj=new We();
                IService s =objj.createMobile();
                return obb.get(form,s,data);
            }
            else if(form.getCompanyName().equals("Orange")){
                Companies objj=new Orange();
                IService s=objj.createMobile();
                return obb.get(form,s,data);
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
