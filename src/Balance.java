public class Balance {
  String name;
  double amount=0.0;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }
    public boolean withdraw(double cost){
      if(cost>amount){
          return false;
      }
      amount-=cost;
      return true;
    }
    public void add(double amount){
      this.amount+=amount;
    }
}
