package Recursion;

public class Print_Nto1 {
    static void print(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        print(n-1);
    }

    public static void main(String[] args) {
        print(10);//10 9 8 7 6 5 4 3 2 1
    }
}
