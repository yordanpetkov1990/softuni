package advanced.SetsAndMapsAdvanced_exam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String,String> phoneBook = new LinkedHashMap<>();
        String command = scan.nextLine();
        while(!"search".equals(command)){
            String[] tokens = command.split("-");
            String name = tokens[0];
            String phone = tokens[1];
            phoneBook.put(name,phone);

            command = scan.nextLine();
        }
        String nameSerach = scan.nextLine();
        while(!"stop".equals(nameSerach)){
            if(phoneBook.containsKey(nameSerach)){
                System.out.printf("%s -> %s\n",nameSerach,phoneBook.get(nameSerach));
            }else{
                System.out.printf("Contact %s does not exist.\n",nameSerach);
            }

            nameSerach=scan.nextLine();
        }
    }
}
