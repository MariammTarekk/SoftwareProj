public class credit_card extends Balance{
    //flos elragel
    double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String withdraw(Double amount) {
        if(balance >=amount){
            balance -=amount;
            return "Done";
        }
        else return "Error";
    }
}
