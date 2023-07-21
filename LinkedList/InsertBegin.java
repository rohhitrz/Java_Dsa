package LINKEDLIST_GENERIC;

public class InsertBegin {

    static void printLL(Node head){
        Node curr= head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    static Node<Integer> insertBegin(Node head, int x){
        Node<Integer> temp = new Node<>(x);

        temp.next=head;
        return temp;
    }

    public static void main(String[] args) {
        Node head= null;
        head= insertBegin(head,10);
        head=insertBegin(head,20);
        head=insertBegin(head,30);

        printLL(head);
    }
}
