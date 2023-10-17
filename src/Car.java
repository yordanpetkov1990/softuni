public class Car  {
    public static String type ="MCP";

    private String name;
    private String model;

    public Car(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Car.type = type;
    }
}
