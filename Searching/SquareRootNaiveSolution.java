package Searching;

public class SquareRootNaiveSolution {
    static int root(int x){
        int i=1;
        while(i*i<=x){
            i++;
        }
        return i-1;
    }

    public static void main(String[] args) {
        int ans =root(16);
        System.out.println(ans);
    }
}
