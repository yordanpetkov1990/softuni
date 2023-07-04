package fundamentals.Lists;

import java.util.*;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n  =Integer.parseInt(scan.nextLine());
        List<String> result = new ArrayList<>();

        for(int i = 0;i<n;i++){
            String input = scan.nextLine();
            result.add(input);
        }
        Collections.sort(result);
        int i = 1;
        for(String e:result){
            System.out.printf("%d." + e,i);
            System.out.println();
            i++;
        }
    }
}
