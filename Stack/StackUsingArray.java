package Stack;

public class StackUsingArray {
    private int data[];
    private int top;

    public StackUsingArray(){
        data=new int[10];
        top=-1;
    }
    public StackUsingArray(int capacity){
        data=new int[capacity];
        top=-1;
    }
    public int size(){
        return top+1;
    }

    public  boolean isEmpty(int[] data){
        if(data.length==0){
            return true;
        }
        return false;
    }

    public int top(){
        if(size()==0){
            return Integer.MIN_VALUE;
        }

        return  data[top];
    }


    public void push(int elem){
        if(size()==data.length){
            System.out.println("Stack full");
        }

        //top++;

        data[++top]=elem;
    }

    public int pop(){
        if(size()==0){
            System.out.println("Stack Is Empty");
        }

        int temp=data[top];
        top--;
        return temp;
    }




}
