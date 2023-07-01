package Mathematics;

public class TrailingZeros {

    static long countZero(int num){

        long fact=1;
        for(int i=2;i<=num;i++){
            fact=fact*i;
        }
        int res=0;
        while(fact%10==0){
            res++;
            fact=fact/10;
        }
        return  res;

    }



    public static void main(String[] args) {
        long ans= countZero(20);
        System.out.println(ans);
    }
}
