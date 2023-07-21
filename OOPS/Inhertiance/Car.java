package OOPS.Inhertiance;

public class Car extends  Vehicle{
    int NumOfGears;


    void print(){
        super.print();
        System.out.println("the color = "+color);
        System.out.println("maximum speed = "+ getMaxSpeed());
        System.out.println("number of gears = "+NumOfGears);

    }

}
