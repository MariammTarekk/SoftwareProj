package com.example.demo.BsLogic;

import com.example.demo.Entity.Database;
import com.example.demo.Entity.Service_Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {
    Database dp=Database.getInstance();
    Service_Data obj=Service_Data.getInstance();
    @PostMapping(value = "/search")
    public String search(@RequestBody Service_Data s){
        if(dp.activeuser!=null){
            String x=obj.search(s.getTest());
            return x;
        }
       else return "login as user first";
    }

    @PostMapping(value = "/searchdiscount")
    public String search(@RequestBody String s){
        if(dp.activeuser!=null){
            if(obj.view.get(s)>0.0){
                return "There is discount "+obj.view.get(s)+"%";
            }
            else return "Not Available";
        }
        else return "login s user first";

    }

}
