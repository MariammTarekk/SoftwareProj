public class user {
    String name="",mails="",passward="";
    Balance w;
    Balance c;
    user(){
       w=new wallet(0.0,"Wallet");
       c=new credit_card(0.0,"credit_card");
   }
}
