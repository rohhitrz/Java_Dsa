package Bit;

public class Bit_Unsigned_Right_shift {
    public static void main(String[] args) {
        int x=-2;
        System.out.println(x>>>2); //1073741823-->(2^31-1)
        System.out.println(x>>>4); //268435455-->(2^28-1)
    }
}
