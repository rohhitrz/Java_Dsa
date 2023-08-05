package Recursion;

public class CalculatePower {

    static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return power(x,n-1)*x;
    }

    public static void main(String[] args) {
        int ans=power(-5,2);
        System.out.println(ans);
    }

}
