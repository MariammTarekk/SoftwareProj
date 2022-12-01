import java.util.ArrayList;

public class Application {
    ArrayList<user> users = new ArrayList<user>();

    boolean checkUp(SignUp x)
    {
        for (int i=0;i< users.size();i++){
            if(users.get(i).mails==x.getEmail())return false;
        }
        for (int i=0;i< users.size();i++){
            if(users.get(i).name==x.getUser_name())return false;
        }
        return true;
    }
    boolean checkIn(SignIn x){
        for (int i=0;i<users.size();i++){
            if(users.get(i).mails==x.getEmail()&&users.get(i).passward==x.getPassword())return true;
        }
        return false;
    }


}
