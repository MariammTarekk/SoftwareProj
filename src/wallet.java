public class wallet extends Balance{

    wallet(double amount, String name) {
        super(amount, name);
    }
    public void fund(credit_card card,String pass,double cost){
        if(card.check(pass)){
            card.withdraw(cost);
            this.add(cost);
        }
        else{
            System.out.println("!!!!");
        }

    }
}