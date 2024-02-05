package HotelReservations;

public class Room {
    private String roomNumber;
    private String type;
    private double price;
    private boolean isAvaible;

    public Room(String roomNumber, String type, double price, boolean isAvaible) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.price = price;
        this.isAvaible = isAvaible;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber='" + roomNumber + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", isAvaible=" + isAvaible +
                '}';
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    public void setAvailable(boolean b) {
        this.isAvaible=b;
    }

    public boolean isAvailable() {
        return this.isAvaible;
    }
}
