package Mathematics;

public class Lcm_effective {

    static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);

    }

    static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }

    public static void main(String[] args) {

        int ans= lcm(100,7);
        System.out.println(ans);
    }
}

// time complexity = O(log(min(a,b))
