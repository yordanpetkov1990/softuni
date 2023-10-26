package Test;

public class SimpleCar  extends Vehicle implements Honkable{
    private int speed;
    public void accelerate(){
        speed +=10;
        System.out.println("Speed after " + speed);
    }
    public void honk(){
        System.out.println("Honk!");
    }
    public void move(){
        System.out.println("is moving ");
    }

    @Override
    public String toString() {
        return "SimpleCar{" +
                "speed=" + speed +
                '}';
    }
}
