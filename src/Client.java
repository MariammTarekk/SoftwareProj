import java.util.Scanner;

public class Client {
    Scanner cin=new Scanner(System.in);
    Client(Application obj, String service , int current_user){
        double cost_internet=30.0;double cost_mobile=50.0;double cost_donations=100.0;
        double cost_Landline=10.0;
        if(service.equals("Internet")){
            System.out.println("Choose 1 for Vodafone provider");
            System.out.println("Choose 2 for Etisalat provider");
            System.out.println("Choose 3 for We provider");
            System.out.println("Choose 4 for Orange provider");
            int choicee=cin.nextInt();
            if(choicee==1){
                Companies objj=new Vodafone();
                Service s =objj.createInternet();
                System.out.println("method of payment 1 for wallet 2 Credit card 3 for cash");
                int num=cin.nextInt();
                    if(num==1){
                    Payment paye=new Wallet_payment();
                    paye.pay(obj.users.get(current_user),cost_internet);
                    System.out.println("after: "+obj.users.get(current_user).wallet.amount);
                        orders ord=new orders();ord.service=service;ord.cost=cost_internet;
                        obj.users.get(current_user).arr.add(ord);
                    }
                    else if(num==2){
                        Payment pay=new Credit_payment();
                        pay.pay(obj.users.get(current_user),cost_internet);
                        System.out.println("after: "+obj.users.get(current_user).card.amount);
                        orders ord=new orders();ord.service=service;ord.cost=cost_internet;
                        obj.users.get(current_user).arr.add(ord);
                    }
                    else{
                        Payment p=new Cache_payment();
                        p.pay(obj.users.get(current_user),cost_internet);
                        orders ord=new orders();ord.service=service;ord.cost=cost_internet;
                        obj.users.get(current_user).arr.add(ord);
                    }
                }
                else if(choicee==2){
                    Companies objj=new Etisalat();
                    objj.createInternet();
                }
                else if(choicee==3){
                    Companies objj=new We();
                    objj.createInternet();
                }
                else if(choicee==4){
                    Companies objj=new Orange();
                    objj.createInternet();
                }

        }
        else if(service.equals("Mobile")){
            System.out.println("Choose 1 for Vodafone provider");
            System.out.println("Choose 2 for Etisalat provider");
            System.out.println("Choose 3 for We provider");
            System.out.println("Choose 4 for Orange provider");
            int choicee=cin.nextInt();
            if(choicee==1){
                Companies objj=new Vodafone();
                objj.createMobile();
            }
            else if(choicee==2){
                Companies objj=new Etisalat();
                objj.createMobile();
            }
            else if(choicee==3){
                Companies objj=new We();
                objj.createMobile();
            }
            else if(choicee==4){
                Companies objj=new Orange();
                objj.createMobile();
            }

        }
        else if(service.equals("LandLine")){
            System.out.println("choose 1 to pay monthly");
            System.out.println("choose 1 to pay Quarter");
            int c=cin.nextInt();
            if(c==1){

            }
            else {

            }
        }
        else if(service.equals("Donations")){
            int cho=cin.nextInt();
            System.out.println("choose 1 to pay for schools");
            System.out.println("choose 1 to pay for NGOS");
            System.out.println("choose 1 to pay for Hospitals ");
            if(cho==1){
                Companies objj=new Schools();
                objj.createDonations();
            }
            else if(cho==2){
                Companies objj=new NGOS();
                objj.createDonations();
            }
            else {
                Companies objj=new Hospitals();
                objj.createDonations();
            }

        }
        else{
            System.out.println("Error");
        }
    }
}
