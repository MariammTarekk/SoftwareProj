
public class Credit_card extends Balance{
    String password="";
    int number;
    Credit_card(double amount) {
        super(amount);
    }
    boolean check(String x){
        if(x==password)return true;
        else return false;
    }

}
