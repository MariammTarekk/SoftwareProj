import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String []args){
        //user us = new user();
        Application obj=new Application() ;
        Searching list=new Searching();
        while (true){
            Scanner cin=new Scanner(System.in);
            System.out.println("choose 1 if you are customer ");
            System.out.println("choose 2 if you are admin");
            System.out.println("choose 3 if you want to exit");
            int y=cin.nextInt();
            if(y==1){
                // customer
                System.out.println("if you want to sign in write 1");
                System.out.println("If you want to sign up write 2");
                int x=cin.nextInt();
                if(x==1) {
                    SignIn login = new SignIn();
                    System.out.println("Please enter your email");
                    String email = "", password = "";
                    email = cin.next();
                    System.out.println("Enter The Password");
                    password = cin.next();
                    login.setEmail(email);
                    login.setPassword(password);
                    int current_user=0;
                    if (obj.checkIn(login,current_user)) {
                        boolean log=true;
                        while (log){
                            System.out.println("To Logout enter 3");
                            System.out.println("Welcome to the system to list all services enter 1 or 2 to search");
                            int choice = cin.nextInt();
                            if (choice == 1) {
                                list.list();

                            } else if(choice==2) {
                                System.out.println("Enter name of the service :");
                                String service = cin.next();
                                list.search(service);
                              //  Client test=new Client(serv);
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
                                            paye.pay(obj.users.get(current_user),20.0);
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
                            else{
                                break;
                            }
                        }

                    } else System.out.println("Error!");
                }
                else{
                    SignUp up=new SignUp();user us=new user();
                    String email="" ,name="",password="";
                    System.out.println("Please Enter your name");
                    name=cin.next();   up.setUser_name(name);us.name=name;
                    System.out.println("Please enter your email ");
                    email=cin.next();up.setEmail(email);us.mails=email;
                    System.out.println("Enter the password: ");
                    password=cin.next();up.setPassword(password);us.passward=password;
                    System.out.println("Enter your Wallet balance: ");
                    double wall= cin.nextDouble();us.wallet.amount=wall;
                    System.out.println("Enter credit card balance: ");
                    double car= cin.nextDouble();us.card.amount=car;
                    System.out.println("Enter your credit card password: ");
                    String pass=cin.next();us.card_passward=pass;
                    if(obj.checkUp(up)){
                        obj.users.add(us);
                        System.out.println("Welcome to the system go to login");
                    }
                    else System.out.println("Error!");
                }
            }
            else if(y==2){
                // admin add serv fakes , add discount ,refund requests (related service ,amount) accept or no
                Admin system=new Admin();
                System.out.println("Enter Your Name :");
                String nam=cin.next();
                System.out.println("Enter Password :");
                String pass=cin.next();
                if(nam.equals(system.name)&&pass.equals(system.password)){
                    System.out.println("Enter 1 to Add Discount 2 to view refund");
                    int cho= cin.nextInt();
                    if(cho==1){
                        String serv=cin.next();
                        int value=cin.nextInt();
                        list.view.put(serv,value);
                        for (Map.Entry<String,Integer> entry : list.view.entrySet()){
                            System.out.println(entry.getKey() +" "+entry.getValue());
                        }
                    }
                }
                else{
                    System.out.println("Not Admin !!!!");
                }
            }
            else{
                break;
            }

        }

    }
}
