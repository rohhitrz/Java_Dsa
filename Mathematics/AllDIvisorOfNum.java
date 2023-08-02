package Mathematics;
// printing all divisors of a number
public class AllDIvisorOfNum {

    public static void divisor(int num){
        for (int i = 1; i <=num ; i++) {
            if(num%i==0){
                System.out.println(i);
            }

        }
    }

    public static void main(String[] args) {
        divisor(100);
    }
}
