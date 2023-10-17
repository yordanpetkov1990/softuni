package DefiningClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split("\\s+");
            String brand = tokens[0];
            Car car;
            if (tokens.length > 1) {
                String model = tokens[1];
                int horsePower = Integer.parseInt(tokens[2]);
                car = new Car(brand,model,horsePower);
            }else{
                car =new Car(brand);
            }



            carList.add(car);
        }
        for (Car car : carList) {
            System.out.println(car.carInfo());
        }
    }
}
