
public class Mobile implements Service{
    double cost=20.0;
    Mobile(){
        System.out.println("Pay 20 dollar for mobile recharge");
    }

    @Override
    public double getcost() {
        return cost;
    }

}
