package Recursion;

public class StringToInteger {

    static int returnInt(String num){
        if(num.length()==0){
            return 0;
        }
      //char last= num.charAt(num.length()-1);
        int smalloutput= returnInt(num.substring(0,num.length()-1));
        int val=(int) num.charAt(num.length()-1);
        val=val-48;
        return  val+smalloutput*10;
    }

    public static void main(String[] args) {
        String num="001234";
//        System.out.println(num.substring(0,num.length()-1));
//        System.out.println(num.length());
        int ans=returnInt(num);
        System.out.println(ans);


    }

}
