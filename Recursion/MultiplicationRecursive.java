package Recursion;

public class MultiplicationRecursive {

    static int mul(int m, int n){

//        if(n==1){
//            return 1;
//        }
        if(m==0||n==0){
            return 0;
        }



        return mul(m,n-1)+ m;
    }

    public static void main(String[] args) {
        int ans= mul(5,4);
        System.out.println(ans);
    }


}
