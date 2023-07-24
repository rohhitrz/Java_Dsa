package Trees;

import java.util.Scanner;

///Tree using ArrayList
public class TreeUse {
    public static TreeNode<Integer> TakeInput(){
        Scanner s= new Scanner(System.in);
        System.out.println("enter the  next  Node: ");
        int n=s.nextInt();
        TreeNode<Integer> root = new TreeNode<>(n);
        System.out.println("enter the number of child of " + n);
        int ChildCount=s.nextInt();
        for (int i = 0; i <ChildCount ; i++) {
            TreeNode<Integer> child= TakeInput();
            root.children.add(child);
        }
        return root;

    }

    public  static void print(TreeNode<Integer> root){
        String s= root.data+":";
        for (int i = 0; i <root.children.size() ; i++) {
            s=s+ root.children.get(i).data;
        }
        System.out.println(s);
        for (int i = 0; i <root.children.size() ; i++) {
            print(root.children.get(i));
        }


    }

    public static void main(String[] args) {
        TreeNode<Integer> root = TakeInput();
        print(root);

//        TreeNode<Integer> root = new TreeNode<>(10);
//        TreeNode<Integer> node1 = new TreeNode<>(20);
//        TreeNode<Integer> node2  = new TreeNode<>(30);
//        TreeNode<Integer> node3 = new TreeNode<>(40);
//        TreeNode<Integer> node4  = new TreeNode<>(50);
//
//        root.children.add(node1);
//        root.children.add(node2);
//        root.children.add(node3);
//        node2.children.add(node4);







    }
}
