package fundamentals.MapsLambdaAndStreamAPILab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] nums = Arrays.stream(scan.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        TreeMap<Double,Integer> numsTree = new TreeMap<>();
        for(double num:nums){
            if(numsTree.containsKey(num)){
                numsTree.put(num,numsTree.get(num) + 1);
            }
            else{
                numsTree.put(num,1);
            }
        }
       for( Map.Entry<Double, Integer> entry : numsTree.entrySet()){
           DecimalFormat df = new DecimalFormat("#.#####");
           System.out.println(df.format(entry.getKey()) + " -> " + entry.getValue());
       }

    }
}
