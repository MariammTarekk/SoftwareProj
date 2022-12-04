public class transaction {
    public void update(user User,double value){
        User.wallet.amount+=value;
        System.out.println("Upadte Done");
    }


}
