public class Mobile implements Service{
    Mobile(){
        System.out.println("Pay for mobile recharge");
    }
    @Override
    public void prep() {
        System.out.println("Mobile class");
    }
}
