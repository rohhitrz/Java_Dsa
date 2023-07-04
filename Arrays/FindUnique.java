package Arrays;
/*You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list.

Sample Input 1:
1
7
2 3 1 6 3 6 2
Sample Output 1:
1
Sample Input 2:
2
5
2 4 7 2 7
9
1 3 1 3 6 6 7 10 7
Sample Output 2:
4
10



* */

public class FindUnique {

    static int findunique(int arr[]){
        int res=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            res^=arr[i];

        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={1,1,1,1,2,2,4,6,4};
       int ans= findunique(arr);
        System.out.println(ans);
    }
}
