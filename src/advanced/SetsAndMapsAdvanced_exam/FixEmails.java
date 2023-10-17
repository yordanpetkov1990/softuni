package advanced.SetsAndMapsAdvanced_exam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        Map<String,String> nameAndEmail = new LinkedHashMap<>();
        while(!"stop".equals(command)){
            String name = command;
            String email = scan.nextLine();
            if(email.endsWith("com") || email.endsWith("us") || email.endsWith("uk")){

            }else{
                nameAndEmail.put(name,email);
            }

            command=scan.nextLine();
        }
        nameAndEmail.forEach((k,v) -> System.out.printf("%s -> %s\n",k,v));
    }
}
