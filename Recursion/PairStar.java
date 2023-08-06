package Recursion;

public class PairStar {
    static String addStars(String str){
        if(str.length()==1){
            return str;
        }

        if(str.charAt(0)==str.charAt(1)){
            return str.charAt(0)+"*"+addStars(str.substring(1));
        }
        else{
            String smallop=addStars(str.substring(1));
            return str.charAt(0)+smallop;
        }

    }

    public static void main(String[] args) {
        String str= "abccd";
        String res=addStars(str);
        System.out.println(res);
    }


}
