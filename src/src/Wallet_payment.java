
public class Wallet_payment implements Payment{
    @Override
    public void pay(User User, double cost) {
        if(User.wallet.amount>=cost)User.wallet.amount-=cost;
        else System.out.println("Check your balance !");
    }
}
