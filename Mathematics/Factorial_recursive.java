package Mathematics;

public class Factorial_recursive {

   static int fact(int num){
        if(num==1 || num==0){
            return 1;
        }

        return  num*fact(num-1);
    }

    public static void main(String[] args) {
        int ans= fact(3);
        System.out.println(ans);
    }


}
