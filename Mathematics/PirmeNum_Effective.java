package Mathematics;

public class PirmeNum_Effective {

    static boolean isprime(int num){
        if(num==1)
            return false;
        for (int i = 2; i*i <=num ; i++) {
            if(num%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean ans = isprime(101);
        System.out.println(ans);
    }
}
//here time complexity is O[sqrt(n))
