package OOPS.Generics;

public class PairUse {

    public static void main(String[] args) {

        Pair<Integer> p= new Pair(1,2);
        p.setFirst(10);
        System.out.println(p.getFirst());
        System.out.println(p.getSecond());


        Pair<String> P2=  new Pair<String>("ab","cd");
        System.out.println(P2.getFirst()+" "+ P2.getSecond());
        P2.setSecond("dc");
        System.out.println(P2.getSecond());


        Pair<Character> P3=new Pair<Character>('a','b');
        System.out.println(P3.getSecond());
        System.out.println( P3.getFirst());
        P3.setFirst('v');
        System.out.println(P3.getFirst());

        Pair<Boolean> P4= new Pair<Boolean>(true,true);
        System.out.println(P4.getFirst() +" "+ P4.getSecond());
        P4.setSecond(false);
        P4.setFirst(false);
        System.out.println(P4.getFirst() +" "+ P4.getSecond());

    }

}