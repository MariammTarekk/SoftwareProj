public class wallet_payment implements Payment{
    @Override
    public void pay(user User,double cost,int discount) {
        if(User.wallet.amount>=cost)User.wallet.amount-=cost;
        else System.out.println("Check your balance !");
    }
}
