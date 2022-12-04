import java.util.ArrayList;
import java.util.*;

public class user {
    String name="",mails="",passward="";
    Balance wallet;
    Balance card;
    String card_passward="";
    ArrayList<orders>arr;
    user(){
        arr=new ArrayList<orders>();
        wallet =new wallet(0.0);
        card =new credit_card(0.0);
   }
}
