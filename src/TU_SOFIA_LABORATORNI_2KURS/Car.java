package TU_SOFIA_LABORATORNI_2KURS;

public class Car {
    private String brand;
    private int speed;
    private int fuel;
    private int mileage;

    public Car(String brand, int fuel, int mileage) {
        this.brand = brand;
        this.speed = 0;
        this.fuel = fuel;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                ", fuel=" + fuel +
                ", mileage=" + mileage +
                '}';
    }

    public void drive(int distance, double fuelFor100Kilometers){
        this.mileage+=distance;
        this.fuel-=fuelFor100Kilometers*distance;

    }
    public void accelerate(int speed){
        this.speed+=speed;
    }
    public void refuel(int fuel){
        this.fuel+=fuel;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
