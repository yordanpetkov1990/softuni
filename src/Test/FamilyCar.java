package Test;

public class FamilyCar extends SimpleCar{
    private int seats;
    public FamilyCar(){
        this.seats = 4;
    }

    public void addSeats(){
        seats +=1;
        System.out.println("Seats are: " + seats);
    }

    @Override
    public String toString() {
        return "FamilyCar{" +
                "seats=" + seats +
                '}';
    }
}
