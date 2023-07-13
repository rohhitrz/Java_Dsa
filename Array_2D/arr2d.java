package Array_2D;

public class arr2d {

    public static void main(String[] args) {
        int arr[][]=new int[3][4];
        System.out.println(arr[0][1]);//0
        arr[2][1]=15;
        System.out.println(arr[2][1]); //15

        int arr2[][]= {{1,2,3},{4,5,6,6}};
        System.out.println(arr2[1][1]);//5
        System.out.println(arr2.length); //2-> no of rows

    }
}

