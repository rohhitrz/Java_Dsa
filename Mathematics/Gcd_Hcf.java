package Mathematics;

public class Gcd_Hcf {

    static int min(int n1, int n2){
        if(n1<n2){
            return n1;
        }

        else if(n1==n2){
            return  n1;
        }

        return n2;
    }

    static int gcd(int a,int b){
        int res=min(a,b);
        while(res>0){
            if(a%res==0 && b%res==0){
                break;
            }
            res--;
        }
        return res;
    }

    public static void main(String[] args) {
        int ans= gcd(2,24);
        System.out.println(ans);
    }
}
