package Test;

public class Main {
    public static void main(String[] args) {
//        SimpleCar speed = new SimpleCar();
//        speed.accelerate();
//        speed.honk();
//        speed.move();
//        FamilyCar seats = new FamilyCar();
//        seats.addSeats();
//        System.out.println(speed.getClass().getName());
//        SimpleCar[] arrSimpleCar = new SimpleCar[5];
//        arrSimpleCar[0]= speed;
//        arrSimpleCar[1]=seats;
//        System.out.println(arrSimpleCar[0].toString() + arrSimpleCar[1].toString());
        Contact.ContactBuilder contactBuilder = new Contact.ContactBuilder();
        Contact build = contactBuilder.withName("yordan").withAge("15").withEmail("aldoada").build();
        System.out.println();


    }
}
