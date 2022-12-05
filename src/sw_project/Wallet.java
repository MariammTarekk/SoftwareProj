package sw_project;
public class Wallet extends Balance{

    Wallet(double amount) {
        super(amount);
    }
    public void fund(Credit_card card, String pass, double cost){
        if(card.check(pass)){
            card.withdraw(cost);
            this.add(cost);
        }
        else{
            System.out.println("!!!!");
        }

    }
}
