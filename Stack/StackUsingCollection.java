package Stack;
import java.util.Stack;

public class StackUsingCollection {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        int arr[]={1,2,3,4,5,6,7,8,9,10};

        System.out.println("Pushing array elements to stack: ");
        for (int i = 0; i <arr.length ; i++) {
            s.push(arr[i]);
            System.out.print(s.peek()+" ");
        }
        System.out.println();

        System.out.println("After poping element from our stack: ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(s.pop()+" ");

        }
    }
}
