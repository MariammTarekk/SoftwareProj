package com.example.demo.controller;

import com.example.demo.DataBase.Service_Data;
import com.example.demo.model.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
@RestController
public class SearchController {
    Service_Data obj=new Service_Data();
    @PostMapping(value = "/search")
    public String search(@RequestBody Service_Data s){
        String x=obj.search(s.getTest());
        return x;
    }
}
