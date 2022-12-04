import java.util.ArrayList;

public class Application {
    ArrayList<user> users = new ArrayList<user>();

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