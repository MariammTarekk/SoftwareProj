public abstract class Balance {
  String name;
  double amount;

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
    public abstract String withdraw(Double amount);
}
