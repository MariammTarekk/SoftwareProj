import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Searching {
    HashMap<String,Integer>view;
    Searching(){
        view=new HashMap<String,Integer>();
        view.put("Mobile",0);
        view.put("Internet",0);
        view.put("LandLine",0);
        view.put("Donations",0);
    }
    public void search(String s){
        for(int i=0;i< view.size();i++){
            if(view.get(i).equals(s))System.out.println(view.get(i));
        }
    }
    public void list(){
        for (Map.Entry<String,Integer> entry :view.entrySet()){
            System.out.println(entry.getKey());
        }
    }

}
