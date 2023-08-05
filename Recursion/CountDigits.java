package Recursion;

public class CountDigits {

    static int count(int num){
        return (int) (Math.log10(num)+ 1);
    }

    public static void main(String[] args) {
        int res= count(1200);
        System.out.println(res);
    }

}
