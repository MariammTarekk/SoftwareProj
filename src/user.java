public class user {
    String name="",mails="",passward="";
    Balance wallet;
    Balance card;
    String card_passward="";
    user(){
       wallet =new wallet(0.0);
       card =new credit_card(0.0);
   }
}
