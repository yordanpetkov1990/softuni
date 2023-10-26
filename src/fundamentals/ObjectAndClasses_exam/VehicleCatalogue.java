package fundamentals.ObjectAndClasses_exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {
    private String typeOfVehicle;
    private String model;
    private String color;
    private int horsepower;
    public VehicleCatalogue(String typeOfVehicle,String model,String color,int horsepower){
        this.typeOfVehicle = typeOfVehicle;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getModel() {
        return model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public String getColor() {
        return color;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<VehicleCatalogue> vehicles = new ArrayList<>();
        while(!input.equals("End"))
        {
            String[] commandParts = input.split(" ");
            VehicleCatalogue currentVehicle = new VehicleCatalogue(commandParts[0],commandParts[1],commandParts[2],Integer.parseInt(commandParts[3]));
            vehicles.add(currentVehicle);
            input = scan.nextLine();
        }
        String model = scan.nextLine();
        while(!model.equals("Close the Catalogue")){
            for(VehicleCatalogue vehicle:vehicles){
                if(vehicle.getModel().equals(model)){
                    String typeveh = vehicle.getTypeOfVehicle().equals("car") ? "Test.Car" : "Truck";
                    System.out.printf("Type: %s\n" +
                            "Model: %s\n" +
                            "Color: %s\n" +
                            "Horsepower: %d\n",typeveh,
                            vehicle.getModel(),
                            vehicle.getColor(),
                            vehicle.getHorsepower());
                }
            }
            model = scan.nextLine();
        }
        double sumCars = 0;
        double sumTrucks = 0;
        double countCars = 0;
        double countTrucks =0;

        for(VehicleCatalogue vehicle:vehicles){
            if(vehicle.getTypeOfVehicle().equals("car")){
                countCars++;
                sumCars+=vehicle.getHorsepower();
            }
            else if(vehicle.getTypeOfVehicle().equals("truck")){
                countTrucks++;
                sumTrucks+=vehicle.getHorsepower();
            }
        }
        double averageTrucks = 0;
        double averageCars = 0;
        if(countTrucks > 0){
           averageTrucks= sumTrucks/countTrucks;
        }
        if(countCars > 0){
            averageCars = sumCars/countCars;
        }

        System.out.printf("Cars have average horsepower of: %.2f.\n",averageCars);
        System.out.printf("Trucks have average horsepower of: %.2f.\n",averageTrucks);


    }
}
