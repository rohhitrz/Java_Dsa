package LinkedList;
//to create a ll
public class CreateLL {
    static class Node{
        int data;
        Node next;

        Node(int x){
            data=x;
            next=null;
        }
    }

    public static void main(String[] args) {

        Node head= new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next=second;
        second.next=third;
        System.out.println(head.data+"->"+ second.data+"->"+third.data); //10->20->30
    }
}
