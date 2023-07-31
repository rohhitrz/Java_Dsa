package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
    public static ArrayList<Integer> remove(int arr[]){
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer,Boolean> seen= new HashMap<>();
        for (int i = 0; i <arr.length; i++) {
            if(seen.containsKey(arr[i])){
                continue;
            }
            output.add(arr[i]);
            seen.put(arr[i],true);
        }
        return output;

    }
    public static void main(String[] args) {
        int arr[]={1,2,2,2,2,2,4,45,4,4,4,5,6,7,8,9,10,5,6,7,8,9,10,11,12};
        ArrayList<Integer> ans= remove(arr);
        System.out.println(ans);


    }
}
