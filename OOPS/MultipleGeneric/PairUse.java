package OOPS.MultipleGeneric;

public class PairUse {

    public static void main(String[] args) {
       Pair<Integer,Integer> p = new Pair<>(1,2);
        System.out.println(p.getFirst()+" "+p.getSecond());
        p.setFirst(10);
        System.out.println(p.getFirst()+" "+p.getSecond());

        Pair<Integer,Character> p2= new Pair<>(1,'a');
        System.out.println(p2.getFirst()+" "+p2.getSecond()); //1 a

        p2.setSecond('c');
        System.out.println(p2.getFirst()+" "+ p2.getSecond()); //1  c






    }
}
