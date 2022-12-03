import java.util.Scanner;

public class Client {
    Client(String service){
        Scanner cin=new Scanner(System.in);
        if(service.equals("Internet")){
            System.out.println("Choose 1 for Vodafone provider");
            System.out.println("Choose 2 for Etisalat provider");
            System.out.println("Choose 3 for We provider");
            System.out.println("Choose 4 for Orange provider");
            int choice=cin.nextInt();
            if(choice==1){
                Companies obj=new Vodafone();
                obj.createInternet();
            }
            else if(choice==2){
                Companies obj=new Etisalat();
                obj.createInternet();
            }
            else if(choice==3){
                Companies obj=new We();
                obj.createInternet();
            }
            else if(choice==4){
                Companies obj=new Orange();
                obj.createInternet();
            }

        }
        else if(service.equals("Mobile")){
            System.out.println("Choose 1 for Vodafone provider");
            System.out.println("Choose 2 for Etisalat provider");
            System.out.println("Choose 3 for We provider");
            System.out.println("Choose 4 for Orange provider");
            int choice=cin.nextInt();
            if(choice==1){
                Companies obj=new Vodafone();
                obj.createMobile();
            }
            else if(choice==2){
                Companies obj=new Etisalat();
                obj.createMobile();
            }
            else if(choice==3){
                Companies obj=new We();
                obj.createMobile();
            }
            else if(choice==4){
                Companies obj=new Orange();
                obj.createMobile();
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
                Companies obj=new schools();
                obj.createDonations();
            }
            else if(cho==2){
                Companies obj=new NGOS();
                obj.createDonations();
            }
            else {
                Companies obj=new Hospitals();
                obj.createDonations();
            }

        }
        else{
            System.out.println("Error");
        }
    }
}
