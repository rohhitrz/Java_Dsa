package Strings;

import java.util.Scanner;

public class StringPalindrome {

    static boolean palindrome(String str){
        String rev="";
        String original=str;
        for (int i = str.length()-1; i >=0 ; i--) {
            rev+=str.charAt(i);
        }
        if(rev.equals(original)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        boolean ans = palindrome(str);
        System.out.println(ans);


    }
}
