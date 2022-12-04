import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String []args){
        //user us = new user();
        Application obj=new Application() ;
        Searching list=new Searching();
        Refund refunds=new Refund();
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
                            System.out.println("Welcome to the system to list all services enter 1 or 2 to search");
                            System.out.println("To refund enter 3");
                            System.out.println("To Logout enter 4");
                            int choice = cin.nextInt();
                            if (choice == 1) {
                                list.list();

                            } else if(choice==2) {
                                System.out.println("Enter name of the service :");
                                String service = cin.next();
                             //   list.search(service);
                               client cli=new client(obj,service,current_user);
                            }
                            else if(choice==3){
                                Refund test=new Refund();
                                System.out.println("Enter service name :");
                                String s=cin.next();
                                test.Send_Refund(obj.users.get(current_user),s);
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
                admin system=new admin();
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
                    else if(cho==2){
                        for (Map.Entry<user,String> entry : refunds.refund_list.entrySet()){
                            System.out.println( "choose 1 to Accept or 2 to reject "+entry.getKey().name+" "+entry.getKey().mails +" "+entry.getValue()+" "+refunds.refund_value(entry.getKey(),entry.getValue()));
                            int okk=cin.nextInt();
                            if(okk==1){

                            }
                            else{

                            }

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
