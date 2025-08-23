package Strings;

public class PrintAllSubstring {
    
    public static void printSubstrings(String str) {
//removing extra spaces
        for(int start=0; start<str.length(); start++)
        {
            for(int end=start; end<str.length(); end++)
            {
                System.out.println(str.substring(start,end+1));
            }
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printSubstrings(str);
        //System.out.println(str.charAt(0)+str.charAt(1));
    }
}

