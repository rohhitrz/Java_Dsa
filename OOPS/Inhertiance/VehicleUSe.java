package OOPS.Inhertiance;

public class VehicleUSe {
    public static void main(String[] args) {
//        Vehicle v= new Vehicle();
//        v.print();


        Car c= new Car();
        c.color="black";
        c.NumOfGears=5;
        //c.maxSpeed=100;
        c.setMaxSpeed(100);

        c.print();

    }
}
