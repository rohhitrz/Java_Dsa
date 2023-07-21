package LINKEDLIST_GENERIC;

public class FindNode {

    public static int findNode(Node<Integer> head, int n) {
        // Write your code here.
        Node curr= head;
        int count=0;
        while(curr!=null){
            if(curr.data.equals(n)){
                return count;
            }
            curr=curr.next;
            count++;
        }

        return -1;
    }


    public static void main(String[] args) {

        Node n1= new Node<>(10);
        Node n2= new Node<>(20);
        Node n3= new Node<>(30);
        Node n4= new Node<>(40);
        Node n5= new Node<>(50);
        Node n6= new Node<>(60);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;


    }
}

