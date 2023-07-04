package Arrays;
import java.util.Arrays;
public class Sort012_easy {

    static void sort(int arr[]){
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        int arr[]={0,1,1,1,1,1,1,1,1,0,0,0,0,0,};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }

    }
}
