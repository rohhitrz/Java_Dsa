package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListdemo {

    public static void main(String[] args) {


        ArrayList<Integer> list1 = new ArrayList<>(10);
        System.out.println(list1.size());
        list1.add(10);
        list1.add(15);
        list1.add(20);
        System.out.println(list1.size());
        System.out.println(list1.get(2));

        list1.add(1,50);
        System.out.println("Printing All the elements: ");
        
        for (int i = 0; i <list1.size() ; i++) {
            System.out.print(" "+list1.get(i)+" ");
        }
        System.out.println();

        //use remove
        
        list1.remove(1);
        System.out.println("Elements after removing the element at first Index: ");
        for (int i = 0; i <list1.size() ; i++) {
            System.out.print(" "+list1.get(i)+" ");

        }
  }
}
