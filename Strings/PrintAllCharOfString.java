package Strings;

import java.util.Scanner;

public class PrintAllCharOfString {

    public static void print(String s){
        for (int i = 0; i <s.length() ; i++) {
            System.out.println(s.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        print(str);
    }
}
