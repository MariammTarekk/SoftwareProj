package com.example.demo.BsLogic;

import com.example.demo.Entity.Database;
import com.example.demo.Entity.Refund_subject;
import com.example.demo.model.Order;
import com.example.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
public class RefundController {
    private Database data= Database.getInstance();
    private Refund_subject refund=Refund_subject.getInstance();
    @PostMapping(value = "/sendrefund")
    public String Send(@RequestBody String Service){
        if(data.activeuser!=null){
            boolean ok=false;
            for (Order order : data.activeuser.arr){
                if(order.service.equals(Service)){
                    ok=true;break;
                }
            }
            if(ok)return refund.Set_State(data.activeuser,Service);
            else return "Transaction should complete first";
        }
        else return "login as user first";

    }
    @PostMapping(value = "/response")
    public String Response(@RequestBody Refund_subject subject){
        for(Map.Entry<User,String> entry:refund.refund_list.entrySet()) {
            if(entry.getKey().getName().equals(subject.getName())) {
                if(subject.getState().equals("Accepted_refund")){
                    Transaction transaction=new Transaction();
                    transaction.update(entry.getKey(),refund.refund_value(entry.getKey(),entry.getValue()));
                    refund.notify_observers(entry.getKey(),"Accepted_refund");
                    System.out.println(entry.getKey().wallet.amount);
                    refund.refund_list.remove(entry.getKey());
                }
                else{
                    refund.notify_observers(entry.getKey(),"Rejected_refund");
                    refund.refund_list.remove(entry.getKey());
                }
                return "Respone Done for this user";
            }
        }
        return "no refund request with this user name";

    }

}
