public class wallet_payment implements Payment{
    @Override
    public void pay(double cost) {
        if(b.amount>=cost)b.amount-=cost;
        else System.out.println("Check your balance !");
    }
}
