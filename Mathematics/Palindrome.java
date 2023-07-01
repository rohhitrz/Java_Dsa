package Mathematics;

public class Palindrome {

    static int reverse(int num) {
        int rev = 0;
        int temp = num;

        while (temp != 0) {
            int ld = temp % 10;

            rev = rev * 10 + ld;
            temp = temp / 10;

        }
        return rev;


    }


    static boolean isPalindroome(int num) {
        if (num == reverse(num))
            return true;

     return false;
}

    public static void main(String[] args) {

        Boolean ans= isPalindroome(101);
        System.out.println(ans);



    }
}
