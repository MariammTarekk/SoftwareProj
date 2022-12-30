package com.example.demo.BsLogic;

import com.example.demo.Entity.Database;
import com.example.demo.Payment.Cache_payment;
import com.example.demo.Payment.Credit_payment;
import com.example.demo.Payment.Payment;
import com.example.demo.Payment.Wallet_payment;
import com.example.demo.model.Form;
import com.example.demo.model.Order;
import com.example.demo.service.Discount_Service;
import com.example.demo.service.IService;

public class GetCost {
    public String get(Form form, IService s, Database data){
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
