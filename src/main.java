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
                    if (obj.checkIn(login)) {
                        boolean log=true;
                        while (log){
                            System.out.println("To Logout enter 3");
                            System.out.println("Welcome to the system to list all services enter 1 or 2 to search");
                            int choice = cin.nextInt();
                            if (choice == 1) {
                                list.list();

                            } else if(choice==2) {
                                System.out.println("Enter name of the service :");
                                String serv = cin.next();
                                list.search(serv);
                                Client test=new Client(serv);
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

//                            //credit_card ob=new credit_card();
//                            if(us.wallet.withdraw(a))System.out.println("Done");
//                            for (int i=0;i<obj.users.size();i++){
//                                System.out.println(obj.users.get(i).wallet.amount);

                    }
                    else System.out.println("Error!");
                }
            }
            else if(y==2){
                // admin

            }
            else{
                break;
            }

        }






    }
}
