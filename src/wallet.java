public class wallet extends Balance{
    double balance;
    @Override
    public String withdraw(Double amount) {
        if(balance>=amount){
            balance-=amount;
            return "Done";
        }
        else return "Error";
    }
}
