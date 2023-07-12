package Sorting;
//In bubble sort we compare the adjacent element and in each round one element is sorted
//In The  largest element will be Sorted in first round, second Largest in 2nd round and so on..

import java.util.Arrays;

public class BubbleSort {
    public static void BubbleSort(int arr[]){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1 ; j++) //this can also be for(int j=0;j<arr.length-i-i;j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={10,50,9,98,-100,35,25};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
