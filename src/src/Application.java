
import java.util.ArrayList;

public class Application {
    private static Application instance=new Application();
    private Application(){}
    public static Application getInstance(){
        return instance;
    }
    ArrayList<User> users = new ArrayList<User>();

    boolean checkUp(SignUp x)
    {
        for (int i=0;i< users.size();i++){
            if(users.get(i).mails.equals(x.getEmail()))return false;
        }
        for (int i=0;i< users.size();i++){
            if(users.get(i).name.equals(x.getUser_name()))return false;
        }
        return true;
    }
    boolean checkIn(SignIn x,int use){
        boolean ok=false;
        for (int i=0;i<users.size();i++){
            if(users.get(i).mails.equals(x.getEmail())&&users.get(i).passward.equals(x.getPassword())){
                ok=true;use=i;break;
            }
        }
        return ok;
    }


}