package Recursion;

public class SumOfArray {
    static int arrsum(int arr[]){
        int[] newarr= new int[arr.length-1];
        if(arr.length==0) {
            return Integer.MIN_VALUE;

        }
        if(arr.length==1){
            return arr[0];
        }
        int sum=0;

        for (int i = 1; i <arr.length ; i++) {
           newarr[i-1]=arr[i];
        }
        return  arrsum(newarr)+arr[0];
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(arrsum(arr));
    }

}
