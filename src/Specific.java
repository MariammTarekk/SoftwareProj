public class Specific extends Discount {
    @Override
    public boolean check(Service_Data list, String service) {
        if(list.view.get(service)>0)return true;
        return false;
    }
}
