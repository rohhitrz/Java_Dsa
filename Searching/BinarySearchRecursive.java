package Searching;

public class BinarySearchRecursive {

    public static int BS(int arr[], int target, int low, int high){
//        low=0;
//        high=arr.length-1;
        if(low>high)  //BASE CASE
        {
            return -1;
        }
        int mid=(low+high)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(target>arr[mid]){
           return BS(arr,target,mid+1,high);
        }
        else{
            return  BS(arr,target,low,mid-1);
        }

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
       int ans= BS(arr,3,0,8);
        System.out.println(ans);
    }
}
