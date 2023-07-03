package Arrays;

public class LargestElement {

    static int largest(int arr[]){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }

        }
        return max;

    }

    public static void main(String[] args) {
        int arr[]={111,2,4,2,12,54,81};
        int res= largest(arr);
        System.out.println(res);


    }
}
