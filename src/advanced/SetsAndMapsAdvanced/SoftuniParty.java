package advanced.SetsAndMapsAdvanced;

import java.util.*;

public class SoftuniParty {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Set<String> vips = new TreeSet<>();
        Set<String> regulars = new TreeSet<>();

        String command = scan.nextLine();
        while(!"PARTY".equals(command)){
            if(command.startsWith("[0-9]+")){
                vips.add(command);
            }else{
                regulars.add(command);
            }

            command = scan.nextLine();
        }
        String end = scan.nextLine();
        while(!"END".equals(end)){
            vips.remove(end);
            regulars.remove(end);

            end = scan.nextLine();
        }
        System.out.println(vips.size() + regulars.size());
        for (String vip : vips) {
            System.out.println(vip);
        }
        for (String regular : regulars) {
            System.out.println(regular);
        }
    }
}
