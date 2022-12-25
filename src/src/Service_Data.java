
import java.util.HashMap;
import java.util.Map;

public class Service_Data {
    HashMap<String,Double>view;
    Service_Data(){
        view=new HashMap<String,Double>();
        view.put("Mobile",0.0);
        view.put("Internet",0.0);
        view.put("LandLine",0.0);
        view.put("Donations",0.0);
        view.put("Overall",0.0);
    }
    public void search(String s){
        for (Map.Entry<String,Double> entry :view.entrySet()){
            if(entry.getKey().equals(s))System.out.println(entry.getKey() +" Service is available");
        }
    }
    public void list(){
        for (Map.Entry<String,Double> entry :view.entrySet()){
            System.out.println(entry.getKey());
        }
    }

}
