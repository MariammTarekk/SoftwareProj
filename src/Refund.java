import java.util.HashMap;

public class Refund {
    HashMap<user,String>refund_list=new HashMap<user,String>();
    public void Send_Refund(user User,String s){
        refund_list.put(User,s);
        System.out.println("Refund request sent");
    }
    public double refund_value(user User,String s){
        double x=0.0;
        for(int i=0;i<User.arr.size();i++){
            if(User.arr.get(i).service.equals(s)){
                x= User.arr.get(i).cost;break;
            }
        }
        return x;
    }
}
