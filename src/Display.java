import java.util.Map;
import java.util.Scanner;

public class Display {
    Display(Application obj, Service_Data list, Refund_subject refunds){
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
                                Client cli=new Client(obj,service,current_user,list);
                            }
                            else if(choice==3){
                                System.out.println("Enter service name :");
                                String s=cin.next();
                                refunds.Set_State(obj.users.get(current_user),s);
                            }
                            else{
                                break;
                            }
                        }

                    } else System.out.println("Error!");
                }
                else{
                    SignUp up=new SignUp();
                    User us=new User();
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

                Admin system=new Admin();
                System.out.println("Enter Your Name :");
                String nam=cin.next();
                System.out.println("Enter Password :");
                String pass=cin.next();
                if(nam.equals(system.name)&&pass.equals(system.password)){
                    System.out.println("Enter 1 to Add Discount 2 to view refund");
                    int cho= cin.nextInt();
                    if(cho==1){
                        System.out.println("Enter service name:");
                        String serv=cin.next();
                        System.out.println("Enter value of discount (double)");
                        double value=cin.nextDouble();
                        list.view.put(serv,value);
                        for (Map.Entry<String,Double> entry : list.view.entrySet()){
                            System.out.println(entry.getKey() +" "+entry.getValue());
                        }
                    }
                    else if(cho==2){
                        for (Map.Entry<User,String> entry : refunds.refund_list.entrySet()){
                            System.out.println( "choose 1 to Accept or 2 to reject "+entry.getKey().name+" "+entry.getKey().mails +" "+entry.getValue()+" "+refunds.refund_value(entry.getKey(),entry.getValue()));
                            int okk=cin.nextInt();
                            if(okk==1){
                                Transaction transaction=new Transaction();
                                transaction.update(entry.getKey(),refunds.refund_value(entry.getKey(),entry.getValue()));
                                refunds.notify_observers(entry.getKey(),"Accepted_refund");
                                System.out.println(entry.getKey().wallet.amount);
                                refunds.refund_list.remove(entry.getKey());

                            }
                            else{
                                refunds.notify_observers(entry.getKey(),"Rejected_refund");
                                refunds.refund_list.remove(entry.getKey());
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
