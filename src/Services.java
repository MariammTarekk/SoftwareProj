
public class Services {
    Category mobile;
    Category Internet;
    Category Donations;
    Category Land_line;
    Services(){
        mobile=new Category();
        mobile.setName("Mobile Recharge");
        Internet=new Category();
        Internet.setName("Internet Payment");
        Donations=new Category();
        Donations.setName("Donations");
        Land_line=new Category();
        Land_line.setName("Landline");
    }


}
