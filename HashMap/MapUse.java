package HashMap;
import java.util.HashMap;
import java.util.Set;

public class MapUse {

    public static void main(String[] args) {
        HashMap<String,Integer> hm= new HashMap<>();
        //Insert

        hm.put("abc",1);
        hm.put("ABC",1);
        hm.put("def",2);
        hm.put("ghi",1);
        hm.put("jkl",2);


        System.out.println("SIZE: "+ hm.size());

        if(hm.containsKey("abc")){
            System.out.println("It has abc");
        }

        if(hm.containsKey("abc1")){
            System.out.println("It has abc1");
        }

        if(hm.containsKey("abc")) {
            int value = hm.get("abc");
            System.out.println(value);
        }

        //Remove
        int v=hm.remove("abc");
        System.out.println(v);

        Set<String> keys= hm.keySet();

        for(String str:keys){
            System.out.println(str);
        }





    }

}
