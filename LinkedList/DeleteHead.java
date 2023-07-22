package LINKEDLIST_GENERIC;

public class DeleteHead {

    public static Node<Integer> deleteNode(Node head){
        if(head==null){
            return null;
        }

        Node temp = head.next;
        return temp;
    }

    static void printLL(Node head){
        Node curr= head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
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

       n1= deleteNode(n1);
        printLL(n1);
    }
    }
