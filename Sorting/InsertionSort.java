package Sorting;

import java.util.Arrays;

public class InsertionSort {

    static void insertionsort(int arr[]){
        for (int i = 1; i <arr.length ; i++) {
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {
        int arr[]={20,5,40,10,30,-100};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
