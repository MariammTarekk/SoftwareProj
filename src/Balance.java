public class Balance {
  String name;
  double amount=0.0;

  Balance(double amount,String name){
      this.amount=amount;
      this.name=name;
  }
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
}
