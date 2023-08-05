package Recursion;

//Given k, find the geometric sum i.e.
//1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)

public class Geometric_Sum {
    static double GP(int num){
        if(num==0){
            return 1;
        }
        return (Math.pow(0.5,num)+GP(num-1));
    }

    public static void main(String[] args) {
        double res= GP(3);
        System.out.println(res);
    }

}
