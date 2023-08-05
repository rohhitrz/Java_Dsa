package Recursion;

public class SumOfDigits {

    static int getSum(int num){
        if(num==0){
            return 0;
        }

        return  getSum(num/10)+num%10;
    }

    public static void main(String[] args) {
        int sum= getSum(1001);//2
        System.out.println(sum);
    }
}
