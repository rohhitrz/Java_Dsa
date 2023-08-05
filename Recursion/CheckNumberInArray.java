package Recursion;

public class CheckNumberInArray {

    static boolean checkNum(int arr[],int num){
        if(arr.length==0){
            return false;
        }
        if(arr[0]==num){
            return true;
        }
        int arr2[]= new int[arr.length-1];
        for (int i = 1; i <arr.length ; i++) {
            arr2[i-1]=arr[i];
        }
        return  checkNum(arr2,num);

    }

    public static void main(String[] args) {
        int arr[]= {9,8,10};
        boolean ans=checkNum(arr,11);
        System.out.println(ans);
    }

}
