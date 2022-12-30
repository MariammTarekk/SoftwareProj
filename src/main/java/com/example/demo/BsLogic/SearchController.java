package com.example.demo.BsLogic;

import com.example.demo.Entity.Service_Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {
    Service_Data obj=Service_Data.getInstance();
    @PostMapping(value = "/search")
    public String search(@RequestBody Service_Data s){
        String x=obj.search(s.getTest());
        return x;
    }
}
