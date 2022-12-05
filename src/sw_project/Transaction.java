package sw_project;
public class Transaction extends Observer{
    public void update(User User, double value){
        User.wallet.amount+=value;
        System.out.println("Upadte Done");
    }
}
