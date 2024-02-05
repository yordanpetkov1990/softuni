package SpaceGam;

public class Planet extends OrbitableSpaceObject{
    Metal metal = new Metal(100,1);
    Gas gas = new Gas(100,0.5);
    Crystal crystal = new Crystal(100,0.2);
    Uranium uranium = new Uranium(100,0.1);
    public Planet(String name, int coordinateX, int coordinateY, int coordinateZ, int mass) {
        super(name, coordinateX, coordinateY, coordinateZ, mass);
    }
    public void harvestMetal() {
        metal.harvest();
    }
    public void harvestGas() {
        gas.harvest();
    }
    public void harvestCrystal() {
        crystal.harvest();
    }
    public void harvestUranium() {
        uranium.harvest();
    }
    public void printResources(){
        System.out.println(String.format("%s - %s - %s - %s", metal.getAmount(), gas.getAmount(), crystal.getAmount(), uranium.getAmount()));
    }


    @Override
    void displayInfo() {

    }
}
