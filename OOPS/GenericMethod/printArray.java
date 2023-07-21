package OOPS.GenericMethod;

public class printArray {


    public static <T> void  printarr(T arr[]){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Integer arr[] = new Integer[10];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=i+1;
        }

        String s[] = new String[10];
        for (int i = 0; i <s.length ; i++) {
            s[i]= "abc";
        }
        printarr(arr);//1 2 3 4 5 6 7 8 9 10
        System.out.println();
        printarr(s);//abc abc abc abc abc abc abc abc abc abc 
    }
}
