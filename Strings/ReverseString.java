package Strings;
//Code to Reverse a String
import java.util.Scanner;

public class ReverseString {

    static String reverse(String str){
        String rev="";
        for (int i = str.length()-1; i>=0; i--) {
            rev+=str.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str= s.nextLine();
        String res=reverse(str);
        System.out.println(res);

    }
}
