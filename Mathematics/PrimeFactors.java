package Mathematics;

public class PrimeFactors {

    public static boolean isprime(int num){
        if(num==1)
            return false;
        for (int i = 2; i*i <=num ; i++) {
            if(num%i==0)
                return false;
        }
        return true;
    }

   public static void Primefactor(int num){

        for (int i = 2; i <=num ; i++) {
            if(isprime(i)){
                int x=i;
                while(num%x==0){
                    System.out.println(i);
                    x=x*i;
                }
            }

        }
    }

    public static void main(String[] args) {

        Primefactor(4);
    }

}
