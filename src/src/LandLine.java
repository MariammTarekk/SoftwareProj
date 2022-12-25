
public class LandLine implements Service{
    double cost=10.0;
    LandLine(){
        System.out.println("You shoud Pay 10 dollar for LandLine monthly");
    }

    @Override
    public double getcost() {
        return cost;
    }
}

