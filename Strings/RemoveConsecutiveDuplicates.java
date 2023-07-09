package Strings;

public class RemoveConsecutiveDuplicates {
    public static String remove(String str){
        int c;
        String res="";
        for (int i = 0; i <str.length() ; i=i+c) {
            c=1;
            res+=str.charAt(i);
            for (int j = i+1; j <str.length() ; j++) {
                if(str.charAt(i)==str.charAt(j)){
                    c++;
                }
                else{
                    break;
                }
            }
        }
        return res;
    }



    public static void main(String[] args) {
        String str= "aabbbcc";
        String res= remove(str);
        System.out.println(res);
    }
}
