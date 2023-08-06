package Recursion;

public class RemoveDuplicatesRecursively {
    static String remove(String str){
        if(str.length()<=1){
            return str;
        }

        if(str.charAt(0)==str.charAt(1)){
            return remove(str.substring(1));
        }
        else{
            return str.charAt(0)+remove(str.substring(1));

        }
    }

    public static void main(String[] args) {
        String str= "xxxyyyzwwzzz";
        String ans= remove(str);
        System.out.println(ans);
    }
}
