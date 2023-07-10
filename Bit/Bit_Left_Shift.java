
//simple calculation for left shift --> (x*2^y)

package Bit;

public class Bit_Left_Shift {
    public static void main(String[] args) {
        int x=3;
        System.out.println(x<<1);//6
        System.out.println(x<<2);//12
        int y=4;
        System.out.println(x<<y);//48

        //left shift for negavtive numbers

        int a=-1;
        System.out.println(a<<1); //-2
        System.out.println(a<<2);//-4

        // in left shift suppose we have 32 bits so the bits will be shifted to its left from the right hand side
        //first zero(from the lhs) will be ignored.

        //simple calculation --> (x*2^y)
    }
}
