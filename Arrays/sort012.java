package Arrays;

public class sort012 {
    static void sortZeroAndOne(int arr[]){

        int nextzero=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==0){
                int temp=arr[nextzero];
                arr[nextzero]=arr[i];
                arr[i]=temp;
                nextzero+=1;
            }

        }
    }

    public static void main(String[] args) {
        int arr[]={1,1,1,0,1,0,1};
        sortZeroAndOne(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");


        }

    }

}
