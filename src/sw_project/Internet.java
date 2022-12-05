package sw_project;
public class Internet implements Service{

    double cost=30.0;
    Internet(){
        System.out.println("you should pay 30 dollar for Internet");
    }

    @Override
    public double getcost() {
        return cost ;
    }

}
