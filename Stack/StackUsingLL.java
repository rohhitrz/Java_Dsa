package Stack;

import LINKEDLIST_GENERIC.Node;

public class StackUsingLL {
    Node head;
    int size;

    StackUsingLL() {
        head = null;
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return (head==null);
    }
    public int getTop(){
        if(head==null){
            return -1;
        }

        return  (int) head.data;
    }

    void push(int x){
        Node temp = new Node(x);
        temp.next=head;
        head=temp;
        size++;
    }

    int pop(){
        if(head==null){
            return -1;
        }
        int res= (int)head.data;
        head=head.next;
        size--;
        return res;

    }



}
