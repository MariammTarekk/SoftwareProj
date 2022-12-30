package com.example.demo.BsLogic;

import com.example.demo.Entity.Database;
import com.example.demo.Entity.Refund_subject;
import com.example.demo.model.Order;
import com.example.demo.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RefundController {
    private Database data= Database.getInstance();
    private Refund_subject refund=Refund_subject.getInstance();
    @PostMapping(value = "/sendrefund")
    public String Send(@RequestBody String Service){
        boolean ok=false;
        for (Order order : data.activeuser.arr){
            if(order.service.equals(Service)){
                ok=true;break;
            }
        }
        if(ok)return refund.Set_State(data.activeuser,Service);
        else return "Transaction should complete first";
    }
}
