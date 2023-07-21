package OOPS;

public class StudentUse {

    public static void main(String[] args) {

        Student s1= new Student("Rohit",24);
        Student s2= new Student("Ajay",10);

//        s1.name="Rohit Raaj";
//        s1.setRollnum(24);
//        s2.name="Ajay";
//        s2.rollnum=10;

      s1.print();
      s2.print();
//        System.out.println(s2.name);

        System.out.println("The Total Number of Students Created are: "+ s1.countStudent());

        System.out.println(Student.countStudent());

    }
}
