package SpaceGam;

public class Main {
    public static void main(String[] args) {
        Planet planet = new Planet("mars",5,10,15,200);
        planet.printResources();
        planet.harvestMetal();
        planet.printResources();
    }
}
