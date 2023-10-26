package advanced.Generics_exam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        CustomList<String> customList = new CustomList<>();
        while (!"END".equals(command)){
            String[] tokens = command.split("\\s+");
            switch (tokens[0]){
                case "Add":
                    String element = tokens[1];
                    customList.add(element);
                    break;
                case "Remove":
                    int index = Integer.parseInt(tokens[1]);
                    customList.remove(index);
                    break;
                case "Contains":
                    String elementToContain = tokens[1];
                    System.out.println(customList.contains(elementToContain));
                    break;
                case "Swap":
                    int index1 = Integer.parseInt(tokens[1]);
                    int index2 = Integer.parseInt(tokens[2]);
                    customList.swap(index1,index2);
                    break;
                case "Greater":
                    String elementToCompare = tokens[1];
                    System.out.println(customList.countGreaterThan(elementToCompare));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    for (String datum : customList.getData()) {
                        System.out.println(datum);
                    }
                    break;
                case "Sort":
                    Sorter.sort(customList);
                    break;

            }

            command = scanner.nextLine();
        }
//        int n = Integer.parseInt(scanner.nextLine());
//        List<Box<Double>> boxList = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            Box<Double> doubleBox = new Box<>(Double.parseDouble(scanner.nextLine()));
//            boxList.add(doubleBox);
//        }
//        Box<Double> newBox = new Box<>(Double.parseDouble(scanner.nextLine()));
//        System.out.println(count(boxList, newBox));
//        int[] ints = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
//        swap(boxList,ints[0],ints[1]);
//        boxList.forEach(e -> System.out.println(e.toString()));

    }
//    public static <T extends Comparable<T>> void swap(List<Box<T>> boxList, int firstIndex, int secondIndex){
//        Box<T> tBox1 = boxList.get(firstIndex);
//        Box<T> tBox2 = boxList.get(secondIndex);
//        boxList.set(firstIndex,tBox2);
//        boxList.set(secondIndex,tBox1);
//    }
//    public static <T extends Comparable<T>> int count(List<Box<T>> boxList,Box<T> element){
//        int count = 0;
//        for (Box<T> tBox : boxList) {
//            if(tBox.compareTo(element) > 0){
//                count++;
//            }
//        }
//
//        return count;
//    }
}
