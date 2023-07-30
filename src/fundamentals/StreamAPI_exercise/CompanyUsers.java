package fundamentals.StreamAPI_exercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        LinkedHashMap<String, ArrayList<String>> companies = new LinkedHashMap<>();
        while(!input.equals("End")){
            String companyName = input.split(" -> ")[0];
            String userId = input.split(" -> ")[1];

            if(!companies.containsKey(companyName)){
                companies.put(companyName,new ArrayList<>());
                companies.get(companyName).add(userId);
            }else{
                int lenght = companies.get(companyName).size();
                boolean isFound = false;
                for(int i = 0;i<lenght;i++){
                    if(companies.get(companyName).get(i).equals(userId)){
                        isFound = true;
                        break;

                    }
                }
                if(!isFound){
                    companies.get(companyName).add(userId);
                }
            }


            input = scan.nextLine();

        }
        for(Map.Entry<String,ArrayList<String>> entry : companies.entrySet()){
            System.out.printf("%s\n",entry.getKey());
            for(int i = 0;i<entry.getValue().size();i++){
                System.out.println("-- " + entry.getValue().get(i));
            }
        }
    }
}
