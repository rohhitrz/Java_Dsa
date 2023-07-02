package Mathematics;
//A prime Number is a number which is only divisible by 1 and the number itself

public class PrimeNum {

    static boolean isprime(int num){

        if(num==1)
            return false;

        for(int i=2;i<num;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean ans= isprime(2);
        System.out.println(ans);
    }
}
