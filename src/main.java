import java.util.Scanner;

public class main {
    public static void main(String []args){
        Application obj=new Application() ;
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
                    if(obj.checkIn(login))
                        System.out.println("Welcome to the system");
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
                        obj.names.add(name);
                        obj.mails.add(email);
                        obj.password.add(password);
                        System.out.println("Welcome to the system");
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
