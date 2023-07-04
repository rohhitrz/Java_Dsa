package Arrays;
import java.util.Arrays;

public class findDuplicate2 {
    public static int duplicateNumber(int arr[]) {

        Arrays.sort(arr);
        int n = arr.length;
        int i=0;
        for( i=0; i<n-1;i++)
        {
            if(arr[i]==arr[i+1])
            {

                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={0 ,7, 2, 5, 4, 7, 1, 3, 6};
        int ans= duplicateNumber(arr);
        System.out.println(ans);
    }
}