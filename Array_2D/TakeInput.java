package Array_2D;

import java.util.Arrays;
import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows=s.nextInt();
        System.out.println("Enter number of columns: ");
        int cols= s.nextInt();
        int arr[][]= new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <cols ; j++) {
                arr[i][j]= s.nextInt();

            }

        }
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
    }
}
