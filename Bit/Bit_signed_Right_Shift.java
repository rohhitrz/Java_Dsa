package Bit;
//signed right shift means if the sign is +ve it will remain +ve and vice-versa
public class Bit_signed_Right_Shift {
    public static void main(String[] args) {
        int x =33;
        System.out.println(x>>1);  //16
        System.out.println(x>>4); //2

        //for negative number
        int y=-2;
        System.out.println(y>>1); //-1
        System.out.println(y>>4); //-1
    }
}
