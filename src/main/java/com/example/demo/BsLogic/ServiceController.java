package com.example.demo.BsLogic;

import com.example.demo.Entity.Database;
import com.example.demo.Providers.*;
import com.example.demo.model.Form;
import com.example.demo.model.Order;
import com.example.demo.service.IService;
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
            PaymetController obb=new PaymetController();
            if(form.ServiceName.equals("Internet")){
                if(form.CompanyName.equals("Vodafone")){
                    Companies objj=new Vodafone();
                    IService s =objj.createInternet();
                    return obb.getCost(form,s,data);
                }
                else if(form.getCompanyName().equals("Etisalat")){
                    Companies objj=new Etisalat();
                    IService s =objj.createInternet();
                    return obb.getCost(form,s,data);
                }
                else if(form.getCompanyName().equals("We")){
                    Companies objj=new We();
                    IService s =objj.createInternet();
                    return obb.getCost(form,s,data);
                }
                else if(form.getCompanyName().equals("Orange")){
                    Companies objj=new Orange();
                    IService s =objj.createInternet();
                    return obb.getCost(form,s,data);
                }
                else return "Not Found";

            }
            else if(form.getServiceName().equals("Mobile")){
                if(form.getCompanyName().equals("Vodafone")){
                    Companies objj=new Vodafone();
                    IService s =objj.createMobile();
                    return obb.getCost(form,s,data);
                }
                else if(form.getCompanyName().equals("Etisalat")){
                    Companies objj=new Etisalat();
                    IService s =objj.createMobile();
                    return obb.getCost(form,s,data);
                }
                else if(form.getCompanyName().equals("We")){
                    Companies objj=new We();
                    IService s =objj.createMobile();
                    return obb.getCost(form,s,data);
                }
                else if(form.getCompanyName().equals("Orange")){
                    Companies objj=new Orange();
                    IService s=objj.createMobile();
                    return obb.getCost(form,s,data);
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
                    Companies objj=new Schools();
                    IService s=objj.createDonations();
                    return obb.getCost(form,s,data);
                }
                else if(form.getCompanyName().equals("NGOS")){
                    Companies objj=new NGOS();
                    IService s=objj.createDonations();
                    return obb.getCost(form,s,data);
                }
                else if(form.getCompanyName().equals("Hospital")){
                    Companies objj=new Hospitals();
                    IService s=objj.createDonations();
                    return obb.getCost(form,s,data);
                }
                else return "Not Found";

            }
            else{
                return "Not Found";
            }
        }
        else return "login as user first";
    }

}
