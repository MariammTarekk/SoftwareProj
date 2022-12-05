public class Overall extends Discount{
    @Override
    public boolean check(Service_Data list, String service) {
        if(list.ovrall_discount>0)return true;
        return false;
    }
}
