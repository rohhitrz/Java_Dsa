package Arrays;

import java.util.Arrays;

public class LeftRotateByD {

    static void rotate(int arr[],int d){

        int temp=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int d=2;
        for (int i = 0; i <d ; i++) {
            rotate(arr,2);

        }

        System.out.println(Arrays.toString(arr));
    }

}
