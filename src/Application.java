import java.util.ArrayList;

public class Application {
    ArrayList<String> names = new ArrayList<String>();
    ArrayList<String>mails  = new ArrayList<String>();
    ArrayList<String>password  = new ArrayList<String>();
    boolean checkUp(SignUp x)
    {
        for (int i=0;i< mails.size();i++){
            if(mails.get(i)==x.getEmail())return false;
        }
        for (int i=0;i< names.size();i++){
            if(names.get(i)==x.getUser_name())return false;
        }
        return true;
    }
    boolean checkIn(SignIn x){
        for (int i=0;i<mails.size();i++){
            if(mails.get(i)==x.getEmail()&&password.get(i)==x.getPassword())return true;
        }
        return false;
    }


}
