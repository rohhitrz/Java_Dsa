package HashMap;
import java.util.HashMap;
public class ExtractingUniqueCharacters {

    public static String UniqueChar(String str){

        HashMap<Character,Integer> hm= new HashMap<>();
        String s="";
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if(!hm.containsKey(ch)){
                s+=ch;
                hm.put(ch,1);
            }

        }
        return s;
    }

    public static void main(String[] args) {
        String str= "ababacd";
         String ans= UniqueChar(str);
        System.out.println(ans); //abcd
    }


}
