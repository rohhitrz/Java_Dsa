package Mathematics;

public class Gcd_Hcf_Euclid_algo {
    static int gcd(int a, int b){
        while(a!=b){
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }

    public static void main(String[] args) {
        int ans= gcd(12,12);
        System.out.println(ans);

    }
}
