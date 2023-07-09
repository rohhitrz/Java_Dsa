package Searching;

public class IndexOfLastOccurrence {

//    static int naiveSol(int arr[], int target){
//        for (int i = arr.length-1; i >=0 ; i--) {
//            if(arr[i]==target){
//                return i;
//            }
//        }
//        return -1;
//    }

    static int findLastIndex(int arr[], int x, int n){
        int low=0;
        int high=n-1;
        while (low<=high){
            int mid= (low+high)/2;
//            if(arr[mid]==x){
//                return mid;
//            }
            if(x>arr[mid]) {
                low=mid+1;
            }

            else if(arr[mid]>x){
                high=mid-1;
            }
            else {
                if(mid==n-1||arr[mid]!=arr[mid+1]){
                    return mid;
                }
                else {
                    low = mid + 1;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[]={1,10,10,10,20,20,20,30,30,30};
//        int ans=naiveSol(arr,-100);
        int ans=findLastIndex(arr,20,10);
        System.out.println(ans);
    }
}
