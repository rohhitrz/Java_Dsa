package Recursion;

public class StringPalindrome {

    static boolean IsPalindrome(String str, int start, int end) {
//        start = str.charAt(0);
//        end = str.charAt(str.length() - 1);
        if (start >= end)
            return true;
        return (str.charAt(start) == str.charAt(end)) &&
                IsPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String str= "aaa";
        boolean ans= IsPalindrome(str,0,str.length()-1);
        System.out.println(ans);
    }
}
