package Recursion;

public class CountZeros {

    static int countzerosRec(int num) {
        if (num < 10) {
            if (num == 0)
                return 1;
            else {
                return 0;
            }
        }
        if(num%10==0){
            return countzerosRec(num/10)+1;
        }
        else{
            return countzerosRec(num/10);
        }
    }

    public static void main(String[] args) {
        int ans=countzerosRec(708000);
        System.out.println(ans);
    }


}
