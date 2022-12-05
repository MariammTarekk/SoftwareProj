public class main {
    public static void main(String []args){
        Application obj=Application.getInstance() ;
        Service_Data list=new Service_Data();
        Refund_subject refunds=new Refund_subject();
        Display menu=new Display(obj,list,refunds);

    }
}
