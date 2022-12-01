import java.util.Scanner;

public class main {
    public static void main(String []args){
        Application obj=new Application() ;
       // Balance_Data obj2=new Balance_Data();
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
                if(x==1)
                {
                    SignIn login=new SignIn();
                    System.out.println("Please enter your email and password");
                    String email="" ,password="";
                    email=cin.next();
                    password=cin.next();
                    login.setEmail(email);
                    login.setPassword(password);
                    if(obj.checkIn(login)){
                        System.out.println("Welcome to the system");

                    }

                    else System.out.println("Error!");
                }
                else{
                    SignUp up=new SignUp();
                    System.out.println("Please enter your email ,username and password");
                    String email="" ,name="",password="";
                    email=cin.next();
                    name=cin.next();
                    password=cin.next();
                    up.setUser_name(name);
                    up.setEmail(email);
                    up.setPassword(password);

                    if(obj.checkUp(up)){
                        user us=new user();
                        us.name=name;us.passward=password;
                        us.mails=email;us.walet=50;
                        us.credit=100;
                        obj.users.add(us);
                        System.out.println("Welcome to the system");
                        System.out.println("to withdraw enter 1");
                        int z= cin.nextInt();
                        if(z==1){
                            double a= cin.nextDouble();
                            credit_card ob=new credit_card();
                            ob.setBalance(us.credit);
                            if(ob.withdraw(a)=="Done")us.credit-=50;
                            else System.out.println("Error");
                        }
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
