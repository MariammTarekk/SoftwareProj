public abstract class Discount {
    public abstract boolean check(Service_Data list, String service);
    public abstract double do_discount(Service_Data list, String service,double cost);
}
