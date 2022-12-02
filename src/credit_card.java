public class credit_card extends Balance{
    String password="";
    int number;
    credit_card(double amount, String name) {
        super(amount, name);
    }
    boolean check(String x){
        if(x==password)return true;
        else return false;
    }

}
