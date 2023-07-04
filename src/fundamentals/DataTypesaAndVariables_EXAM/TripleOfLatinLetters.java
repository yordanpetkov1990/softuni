package fundamentals.DataTypesaAndVariables_EXAM;

import java.util.Scanner;

public class TripleOfLatinLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for(int i=97;i<97+n;i++){
            for(int y=97;y<97+n;y++){
                for(int j=97;j<97+n;j++){
                    System.out.printf("%c%c%c\n",i,y,j);
                }
            }
        }
    }
}
