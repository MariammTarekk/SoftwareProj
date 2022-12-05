package sw_project;

public class Discount_Service implements Service{
    Service service;
    double percent;
    Discount_Service(Service service,Service_Data serve,String name){
        this.service=service;
        this.percent=serve.view.get(name);
    }

    @Override
    public double getcost() {
        double x=service.getcost();
        x-=(x/100.0)* percent;
        return x;
    }
}
