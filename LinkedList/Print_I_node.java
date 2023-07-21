package LINKEDLIST_GENERIC;

public class Print_I_node {

    static void printInode(Node head, int i){
        Node curr= head;
        int count=0;
        while(curr!=null){


            if(count==i){
                System.out.print(curr.data);
            }
            count++;
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

        printInode(n1, 3);

    }


}
