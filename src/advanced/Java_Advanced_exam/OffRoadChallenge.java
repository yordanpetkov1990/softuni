package advanced.Java_Advanced_exam;

import java.util.*;

public class OffRoadChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deque<Integer> stackFuel = new ArrayDeque<>();
        Deque<Integer> queueConsumptionIndex = new ArrayDeque<>();
        Deque<Integer> queueAltitude = new ArrayDeque<>();
        List<String> conquearedAltitudes = new ArrayList<>();

        Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).forEach(stackFuel::push);
        Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).forEach(queueConsumptionIndex::offer);
        Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).forEach(queueAltitude::offer);

        int index = 1;
        boolean hasReachedTop = true;
        while (!queueAltitude.isEmpty() && !queueConsumptionIndex.isEmpty() && !stackFuel.isEmpty()){
            int fuelQuantity = stackFuel.pop();
            int consumptionIndex = queueConsumptionIndex.poll();
            int altitude = queueAltitude.poll();
            int result = fuelQuantity - consumptionIndex;
            String altitudeString  ="Altitude " + index;
            if(result >= altitude){
                String resultString = "John has reached: " + altitudeString;
                System.out.println(resultString);
                conquearedAltitudes.add(altitudeString);
                index++;
            }else{
                System.out.println("John did not reach: " + altitudeString);
                hasReachedTop = false;
                break;
            }
        }
        if(!hasReachedTop){
            System.out.println("John failed to reach the top.");
            if(!conquearedAltitudes.isEmpty()){
                System.out.println("Reached altitudes: " +String.join(", ", conquearedAltitudes));
            }else{
                System.out.println("John didn't reach any altitude.");
            }

        }
        if(hasReachedTop){
            System.out.println("John has reached all the altitudes and managed to reach the top!");
        }
    }
}
