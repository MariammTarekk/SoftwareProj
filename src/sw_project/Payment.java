package sw_project;
public interface Payment {
    Balance b=new Balance(0.0);
    public void pay(User User, double cost);
}
