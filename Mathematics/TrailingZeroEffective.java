package Mathematics;

public class TrailingZeroEffective {

    static int countTrailingZeros(int num){
        int res=0;
        for(int i=5;i<=num;i=i*5){
            res=res+num/i;
        }
        return res;
    }

    public static void main(String[] args) {
        int ans=countTrailingZeros(10);
        System.out.println(ans);
    }
}
