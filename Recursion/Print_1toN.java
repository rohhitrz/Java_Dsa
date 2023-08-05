package Recursion;

public class Print_1toN {

    static void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.print(n+" ");

    }

    public static void main(String[] args) {
        print(10);//1 2 3 4 5 6 7 8 9 10
    }

}
