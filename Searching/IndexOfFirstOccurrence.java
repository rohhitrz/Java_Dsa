package Searching;

public class IndexOfFirstOccurrence {

   // naive soluton
//    static int naiveapproach(int arr[], int x){
//        for (int i = 0; i <arr.length-1 ; i++) {
//            if(arr[i]==x){
//                return i;
//            }
//        }
//        return -1;   //time complexity is O(n);
//                     //better to use binarysearch
//
//
//    }

    static int findIndex(int arr[], int x){
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            int mid= (low+high)/2;
//            if(arr[mid]==x){
//                return mid;
//            }
             if(x>arr[mid]) {
                low=mid+1;
            }
            else {
                if(mid==0||arr[mid-1]!=arr[mid]){
                    return mid;
                }
                else {
                    high = mid - 1;
                }
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,4,5,6};
        int arr2[]={5,5,5};
        //int ans= naiveapproach(arr,4);
        int ans= findIndex(arr2,5);
        System.out.println(ans);
    }

}
