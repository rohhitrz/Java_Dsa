package Array_2D;



public class Rowise_sum {
    public static void rowsum(int arr[][]){

        for (int i = 0; i <arr.length ; i++) {
            int sum=0;
            for (int j = 0; j<arr[i].length; j++) {
                sum+=arr[i][j];
            }
            System.out.print(sum+" ");

        }
        System.out.println();


    }

    public static void main(String[] args) {
        int arr[][]={{11,33,45,2},{23,3,52,4}};
        rowsum(arr);


    }

}
