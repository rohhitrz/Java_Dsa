package Recursion;

public class ReplacePi {
    //xpixpi=x3.14x3.14

    static String replace(String str){

        if(str.length()<=1){
            return str;
        }
        if(str.charAt(0)=='p'&& str.charAt(1)=='i'){
            String smallOp=replace(str.substring(2));
            return "3.14"+smallOp;
        }
        else{
            String smallOp=replace(str.substring(1));
            return str.charAt(0)+smallOp;
        }
    }

    public static void main(String[] args) {
        String str= "xpixpi";
        String res= replace(str);
        System.out.println(res);
    }

}
