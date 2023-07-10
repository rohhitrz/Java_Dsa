package Searching;

public class SquareRootUsingBS {

    static int sqrtBS(int x){
        int low=1;
        int high=x;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int midsq= mid*mid;
            if(midsq==x){
                return mid;
            }
            else if (midsq>x) {
                high=mid-1;
            }
            else{
                low=mid+1;
                ans=mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int ans =sqrtBS(100);
        System.out.println(ans);
    }
}
