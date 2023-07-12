package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selecetionSort(int arr[]){
        for (int i = 0; i <arr.length-1 ; i++) {
            int min=arr[i];
            int mindIndex=i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]<min){
                    min=arr[j];
                    mindIndex=j;
                }
            }
            if(mindIndex!=i){
                arr[mindIndex]=arr[i];
                arr[i]=min;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={5,6,3,4,2,1};
        selecetionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
