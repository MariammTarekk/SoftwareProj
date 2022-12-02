public class credit_payment extends Payment {
    public boolean req(credit_card card,String password){
        if(card.check(password))return true;
        return false;
    }
    @Override
    public void pay(double cost) {
        if(b.amount>=cost)b.amount-=cost;
    }
}
