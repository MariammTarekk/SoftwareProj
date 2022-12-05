import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String []args){
        Application obj=new Application() ;
        Searching list=new Searching();
        Refund_subject refunds=new Refund_subject();
        Display menu=new Display(obj,list,refunds);

    }
}
