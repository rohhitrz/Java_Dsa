package OOPS;

public class Student {
    String name;
    private final int rollnum;
   private static int numstudents;


   public Student(String n, int rn){
        name=n;
        rollnum=rn;
        numstudents++;
    }

   public int getRoll(){
       return rollnum;
   }

   static int countStudent(){
        return numstudents;
   }

//   public void setRollnum(int rn){
//       rollnum=rn;
//   }

   public void print() {
        System.out.println(name + ": "+ rollnum );
       //System.out.println("The Total Number of Students Created are: "+numstudents);
   }


}
