package Arrays;

public class LinearSearch {

    static int Search(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,10,3,5,0,-1,4,9};
        int ans= Search(arr, -100);
        System.out.println(ans);
    }
}
