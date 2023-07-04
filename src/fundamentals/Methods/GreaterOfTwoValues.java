package fundamentals.Methods;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command =scan.nextLine();
        switch (command){
            case"int":
               int num1 = Integer.parseInt(scan.nextLine());
               int num2 = Integer.parseInt(scan.nextLine());
                System.out.println(kozela(num1,num2));
                break;
            case"char":
               char c1 = scan.nextLine().charAt(0);
               char c2 = scan.nextLine().charAt(0);
                System.out.println(kozela(c1,c2));
                break;
            case "string":
                String s1 = scan.nextLine();
                String s2 = scan.nextLine();
                System.out.println(kozela(s1,s2));
                break;
        }

    }
    public static int kozela(int n1,int n2){
        if(n1 > n2){
            return n1;
        }
        else{
            return n2;
        }
    }
    public static char kozela(char c1,char c2){
        if(c1 > c2){
            return c1;
        }
        else{
            return c2;
        }
    }
    public static String kozela(String s1,String s2){
        if(s1.compareTo(s2) >= 0){
            return s1;
        }
        else{
            return s2;
        }
    }
}
