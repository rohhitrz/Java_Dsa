package Mathematics;

//to find thr lcm of two number
//lcm is the least common divisor


public class Lcm {

    static int getLcm(int a,int b){
        int result= Math.max(a,b);
        while(true){
            if(result %a ==0 && result%b==0 ){
                return result;
            }
            result++;
        }
    }

    public static void main(String[] args) {
        int ans= getLcm(5,5);
        System.out.println(ans);
    }
}
// time complexity = O(a*b)
