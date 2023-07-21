package OOPS.Inhertiance;

public class Vehicle {
    String color;
    private int maxSpeed;

    void print(){
        System.out.println("the color = "+color);
        System.out.println("maximum speed = "+maxSpeed);
    }

    public void setMaxSpeed(int ms){
        if(ms>200){
            return;
        }
        maxSpeed=ms;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }


}
