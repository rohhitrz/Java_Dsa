package Searching;

//O(log n).

public class BinarySearch {

    static int BS(int arr[], int target){
        int start=0;
        int end=arr.length-1;

        while (start<=end) {
            int mid = (start + end) / 2;


            if (arr[mid] == target) {
                return mid;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]= {10,20,30,40,50,60};
        int res=BS(arr,10);
        System.out.println(res);
    }
}
