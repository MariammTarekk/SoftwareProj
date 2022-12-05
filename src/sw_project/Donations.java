package sw_project;
public class Donations implements Service{
    double cost=40.0;
    Donations(){
        System.out.println("Pay 40 dollars for donations");
    }

    @Override
    public double getcost() {
        return cost;
    }
}
