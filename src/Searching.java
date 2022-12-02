import java.util.ArrayList;
import java.util.HashMap;

public class Searching {
    ArrayList<String>view;
    Searching(){
        view=new ArrayList<String>();
        view.add("Mobile");
        view.add("Internet");
        view.add("LandLine");
        view.add("Donations");
    }
    public void search(String s){
        for(int i=0;i< view.size();i++){
            if(view.get(i).equals(s))System.out.println(view.get(i));
        }
    }
    public void list(){
        for(int i=0;i< view.size();i++){
            System.out.println(view.get(i));
        }
    }

}
