package TU_SOFIA_LABORATORNI_2KURS;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        Car car1 = new Car("BMW",60,250_000);
        Car car2 = new Car("MERCEDES",50,150_000);
        Car car3 = new Car("AUDI",40,125_000);
        ElectricCar car4 = new ElectricCar("TESLA",0,50_000,10,7);
        ElectricCar car5 = new ElectricCar("TESLA",0,25_000,20,4);
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;
        cars[3] = car4;
        cars[4] = car5;
        for (Car car : cars) {
            if(car instanceof ElectricCar){
                 ((ElectricCar) car).driveElectric(100,5);
                System.out.println(car.toString());
            }else{
                car.drive(300,0.1);
                System.out.println(car.toString());
            }
        }


    }
}