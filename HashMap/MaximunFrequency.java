package HashMap;
import  java.util.*;

public class MaximunFrequency {

    public static  int maxFreq(int arr[]){
        HashMap<Integer,Integer> h= new HashMap<>();
        for(int i:arr){
            if (h.containsKey(i)){
                //map.put(arr[i]);
                h.put(i, h.get(i)+1);
            }
            else {
                h.put(i, 1);
            }
        }
        int max=0;
        int ans=Integer.MIN_VALUE;
        for(int i:arr){
            if(h.get(i)>max){
                max=h.get(i);
                ans=i;

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,12,12,6,6,6,6,6,6};
        int ans =maxFreq(arr);
        System.out.println(ans);

    }
}
