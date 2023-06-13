package DataTypesAndVariables;

import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nameOfTown = scan.nextLine();
        String population = scan.nextLine();
        String area = scan.nextLine();
        System.out.printf("Town %s has population of %s and area %s square km.",nameOfTown,population,area);
    }
}
