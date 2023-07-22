package LINKEDLIST_GENERIC;

public class DeleteatPos {

    public static Node<Integer> deleteatpos(Node head, int pos) {
        if (head == null) {
            return head;
        }

        if(pos==0){
            return  head.next;
        }


        int count = 0;
        Node curr = head;
        Node temp = null;
        while (curr.next.next != null) {


            if (count == pos - 1) {
                temp = curr.next.next;
                curr.next = temp;
                break;

            }
            count++;
            curr = curr.next;

        }

        if (count == pos - 1 && curr.next.next == null) {
            curr.next = null;
        }
        return head;

    }

    static void printLL(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {


        Node n1 = new Node<>(10);
        Node n2 = new Node<>(20);
        Node n3 = new Node<>(30);
        Node n4 = new Node<>(40);
        Node n5 = new Node<>(50);
        Node n6 = new Node<>(60);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

      n1=deleteatpos(n1,5);
        printLL(n1);


    }
}

