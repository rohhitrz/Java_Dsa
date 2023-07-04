package Arrays;

public class SwapAlternate {

    public static void swapAlter(int arr[]){
        int temp[]=new int[arr.length];
        for (int i = 0; i <arr.length-1 ; i+=2) {
            temp[i]=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        swapAlter(arr);

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
