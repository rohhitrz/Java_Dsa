package Arrays;

public class ReverseArray {

    static void reverse(int arr[], int n){
        int low=0;
        int high=n-1;
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverse(arr,5);

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }


    }
}
