package Arrays;

import java.util.Scanner;

public class BasicsOfArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int arr[]=  new int[5];
        System.out.println(arr[1]);

        char Carr[]= new char[2];
        System.out.println(Carr[1]);

        double darr[]= new double[2];
        System.out.println(darr[1]);

        //lets try to take input

        System.out.println("Enter the size of the array: ");
        int n=s.nextInt();
        int arr1[] = new int[n];

        for(int i=0;i<n;i++){
            arr1[i]=s.nextInt();
        }

        System.out.println("printing the array: ");
        for (int i=0;i< arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

    }
}
