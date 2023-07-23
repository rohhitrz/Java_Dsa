package Stack;

public class StackUseLL {
    public static void main(String[] args) {
        StackUsingLL s= new StackUsingLL();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.getTop());
        System.out.println(s.getSize());

        for (int i = 0; i < s.getSize()+3; i++) {
            System.out.println(s.pop());

        }



    }
}
