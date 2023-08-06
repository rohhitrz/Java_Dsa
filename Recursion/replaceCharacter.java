package Recursion;

public class replaceCharacter {
    public static String replaceCharacter(String str, char c1, char c2) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if(str.length()==0){
            return str;
        }

        if(str.charAt(0)==c1) {
            return c2+replaceCharacter(str.substring(1), c1, c2) ;
        }

        else{
            return str.charAt(0)+replaceCharacter(str.substring(1), c1, c2);
        }
    }

    public static void main(String[] args) {
        String str= "aaaaaaaa";
        String res= replaceCharacter(str,'a','x');
        System.out.println(res);
    }
}
