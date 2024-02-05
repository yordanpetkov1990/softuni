package SpaceGam;

public abstract class SpaceObject {
    private String name;
    private int coordinateX;
    private int coordinateY;
    private int coordinateZ;
    private int mass;

    public SpaceObject(String name, int coordinateX, int coordinateY, int coordinateZ, int mass) {
        this.name = name;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.coordinateZ = coordinateZ;
        this.mass = mass;
    }

    abstract  void displayInfo();

}
