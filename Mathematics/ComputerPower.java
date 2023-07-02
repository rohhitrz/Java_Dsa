package Mathematics;

public class ComputerPower {

    public static int power(int x, int n){
        int res=1;
        for (int i = 1; i <=n ; i++) {
            res=res*x;

        }
        return res;
    }

    public static void main(String[] args) {
        int ans=power(4,4);
        System.out.println(ans);
    }

}
