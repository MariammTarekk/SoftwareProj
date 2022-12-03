public class Donations implements Service{
    Donations(){
        System.out.println("Pay for donations");
    }
    @Override
    public void prep() {
        System.out.println("Donations class");
    }
}
