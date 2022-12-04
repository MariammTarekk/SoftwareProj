public class credit_payment implements Payment {
    public boolean req(credit_card card,String password){
        if(card.check(password))return true;
        return false;
    }
    @Override
    public void pay(user User,double cost,int discount) {
        if(User.wallet.amount>=cost)User.wallet.amount-=cost;
    }
}
