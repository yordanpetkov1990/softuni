package basics.FirstStepsInProgrammingJava;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int projects = Integer.parseInt(scan.nextLine());
        int need_time_for_projects = projects * 3;
        System.out.println("The architect " + name + " will need " + need_time_for_projects + " hours to complete " + projects + " project/s.");

    }
}
