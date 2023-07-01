package Mathematics;

public class Factorial_Iterative {

    static int fact(int num){
        int res=1;
        for(int i=2;i<=num;i++){
            res=res*i;
        }
        return res;

    }


    public static void main(String[] args) {
        int ans= fact(1);
        System.out.println(ans);
    }
}
