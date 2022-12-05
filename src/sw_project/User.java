package sw_project;
import java.util.ArrayList;

public class User {
    String name="",mails="",passward="";
    Balance wallet;
    Balance card;
    String card_passward="";
    ArrayList<orders>arr;
    ArrayList<String>messages;
    User(){
        arr=new ArrayList<orders>();
        wallet =new Wallet(0.0);
        card =new Credit_card(0.0);
   }
}
