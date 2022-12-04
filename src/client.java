import java.util.Scanner;

public class client {
    Scanner cin=new Scanner(System.in);
    client(Application obj,String service , int current_user){

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
                System.out.println("before: "+obj.users.get(current_user).wallet.amount);
                int num=cin.nextInt();
                if(num==1){
                    Payment paye=new wallet_payment();
                    paye.pay(obj.users.get(current_user),20.0,0);

                    System.out.println("after: "+obj.users.get(current_user).wallet.amount);
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
                Companies objj=new schools();
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
