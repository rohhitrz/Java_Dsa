package Arrays;

public class PrintAllPairs {

    static void makePair(int arr[]){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                System.out.print( "("+arr[i]+","+arr[j]+")");
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={1,4,7,6,5};
        makePair(arr);
    }

}
