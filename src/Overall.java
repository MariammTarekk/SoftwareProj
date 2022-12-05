public class Overall extends Discount{
    @Override
    public boolean check(Service_Data list, String service) {
        if(list.ovrall_discount>0)return true;
        return false;
    }

    @Override
    public double do_discount(Service_Data list, String service, double cost) {
        double x=cost;
        cost-=(x/100.0)* list.ovrall_discount;
        return cost;
    }
}
