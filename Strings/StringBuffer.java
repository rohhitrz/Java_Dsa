package Strings;
//used to make mutable strings;
import java.lang.*;

public class StringBuffer {

    public static void main(String[] args) {
        java.lang.StringBuffer str = new java.lang.StringBuffer("abc");
        str.setCharAt(1,'d');
        str.append("def");

        System.out.println(str+" "+str.length());


    }

}
