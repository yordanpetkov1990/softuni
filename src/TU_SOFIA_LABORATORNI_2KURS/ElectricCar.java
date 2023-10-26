package TU_SOFIA_LABORATORNI_2KURS;

public class ElectricCar extends Car {
    private int batteryLevel;
    private int efficiency;

    public ElectricCar(String brand, int fuel, int mileage,int batteryLevel,int efficiency) {
        super(brand, fuel, mileage);
        this.batteryLevel = batteryLevel;
        this.efficiency = efficiency;
    }
    public void driveElectric(int distance,int batteryAmount){
        super.setMileage(super.getMileage() + distance);
        this.batteryLevel-=batteryAmount*this.efficiency;


    }

    @Override
    public String toString() {
        return super.toString() +
                "{" +
                "batteryLevel=" + batteryLevel +
                ", efficiency=" + efficiency +
                '}';
    }

    public void charge(int amount){
        this.batteryLevel+=amount;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public int getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }
}
