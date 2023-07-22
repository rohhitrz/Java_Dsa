package Stack;

public class StackUse {
    public static void main(String[] args) {


        StackUsingArray stack = new StackUsingArray();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        int res=stack.pop();
        System.out.println(res);
        System.out.println(stack.size());



    }
}