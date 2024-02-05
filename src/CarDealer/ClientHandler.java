package CarDealer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Optional;

public class ClientHandler implements Runnable{
    private Socket socket;
    private static ArrayList<Car> cars = new ArrayList<>();
    public ClientHandler(Socket socket){
        this.socket=socket;
        cars.add(new Car("BMW","X5",2000));
        cars.add(new Car("BMW","X6",3000));
        cars.add(new Car("BMW","X8",4000));
    }
    @Override
    public void run() {

        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pf = new PrintWriter(socket.getOutputStream(),true);
            while (true){
                String input = bf.readLine();
                String[] tokens = input.split(" ");
                if(tokens.length == 2){
                    Optional<Car> car = findcar(tokens);
                    if(car.isPresent()){
                        pf.println(car.get());
                    }else{
                        pf.println("No such car");
                    }
                }else if(tokens.length==3){
                    Car car = new Car(tokens[0],tokens[1],Double.parseDouble(tokens[2]));
                    cars.add(car);
                }
                    else{
                    pf.println("not good");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private Optional<Car> findcar(String[] tokens) {
        for (Car car : cars) {
            if(car.getMake().equals(tokens[0]) && car.getModel().equals(tokens[1])){
                return Optional.of(car);
            }
        }
        return Optional.empty();
    }
}
