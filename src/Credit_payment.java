public class Credit_payment implements Payment {
    public boolean req(Credit_card card, String password){
        if(card.check(password))return true;
        return false;
    }
    @Override
    public void pay(User User, double cost, int discount) {
        if(User.card.amount>=cost)User.card.amount-=cost;
    }
}
