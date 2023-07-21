package LINKEDLIST_GENERIC;

public class InsertAtPos {
    public static Node<Integer> insertAtPos(Node head, int pos, int x){
        Node temp= new Node<>(x);
        if(head==null ){
            if(pos==1)
                return temp;
            else
                return head;
        }

        if(pos==1){
            temp.next=head;
            return temp;
        }

        Node curr= head;

        int count=0;


        while(curr.next!=null){
            if(count==pos-1){
                temp.next=curr.next;
                curr.next=temp;
            }
            curr=curr.next;
            count++;
        }
        return head;
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

        insertAtPos(n1,5,100);

        printLL(n1);

//        Node head= null;
//
//       Node res= insertAtPos(head,1,90);
//        printLL(res);

    }
}
