package Trees;
///Tree using ArrayList
import java.util.ArrayList;

public class TreeNode<T> {
    public T data;
    ArrayList<TreeNode<T>>children;

    public TreeNode(T data){
        this.data=data;
        children=new ArrayList<>();
    }

}
