package Recursion;

public class SumOfN_Naturalnumbers {

    static int Nsum(int num){
        if(num==0){
            return 0;
        }

        return num+ Nsum(num-1);


    }

    public static void main(String[] args) {
        int sum= Nsum(100);
        System.out.println(sum);
    }

}
