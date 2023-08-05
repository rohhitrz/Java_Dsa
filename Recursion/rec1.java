package Recursion;

public class rec1 {
//stack overflow error
    static void fun1(){
        System.out.println("hello");
        fun1();
    }

    public static void main(String[] args) {
        fun1();
    }

}
