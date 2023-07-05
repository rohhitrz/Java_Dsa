package Strings;

public class StringDemo {
    public static void main(String[] args) {
        String s= "hello";
        System.out.println(s.length());
        System.out.println(s.charAt(2));

        String s2=""; //Empty String
        System.out.println(s2.length());

        String s3=" "; // Adding a SPACE between Empty String is not empty anymore, it has a length of 1
        System.out.println(s3.length());


        //two strings can be concatenated using '+'

        String day="Wednesday ";
        String date="05-07-2023 ";

        System.out.println(day+date);

        //check if two Strings are equal or not
        //equals
        //==
        //compareto ->this will give 0 if both are equal,if there is mismatch of characters it will give the ascii diffrence of the characters

        System.out.println(s.equals(s2));
        System.out.println(s==s2);

        String alpha="alpha";
        String beta="alpha";
        String gamma="Alpha";

        System.out.println("alpha is same as beta?: "+alpha.equals(beta));
        System.out.println("alpha is same as gamma?: "+alpha.equals(gamma));//case sensitive

        String a="coding";
        String b="aoding";
        System.out.println(a.compareTo(b));//returns 2 as diffrence of ascii of a and c is 2

        //check if one string contains another

        System.out.println(a.contains("ing")); //returns true

//        a= a.concat(b);
//        System.out.println(a);//codingaoding
//
//        a+=b;
//        System.out.println(a);//codingaoding


        /*In Java, we use the "==" operator to compare two variables of primitive data type and also compare objects. Just like equals() method, "==" also returns boolean output. Since "==" is an operator, it is not overrideable, and hence we avoid using it for comparing two objects. It can be used to compare two variables of int, char, byte, short, long, boolean, float and double types.

Let us look at an example of the same.

Example : Comparison of two integers.

Code:

        int n1 = 10;
        int n2 = 20;
        // comparing n1 with n2
        System.out.println("Comparing n1 and n2: " + (n1 == n2));

        int n3 = 10;
        int n4 = 20;
        int n5 = 2 * n3; // n5 = 20

        // comparing n4 with n5
        System.out.println("Comparing n4 and n5: " + (n4 == n5));



Output:

Comparing n1 and n2: false
Comparing n4 and n5: true
        * */








    }
}
