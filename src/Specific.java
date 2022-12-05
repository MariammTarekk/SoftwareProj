public class Specific extends Discount {
    @Override
    public boolean check(Service_Data list, String service) {
        if(list.view.get(service)>0)return true;
        return false;
    }

    @Override
    public double do_discount(Service_Data list, String service, double cost) {
        double x=cost;
        cost-=((x/100.0)*list.view.get(service));
        return cost;
    }
}
