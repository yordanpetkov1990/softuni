package advanced.Java_Advanced_exam;

import java.util.Scanner;

public class FishingCompetition {
    static int myRow;
    static int myCol;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int count = 0;
        char[][] area = new char[n][n];
        for (int i = 0; i < area.length; i++) {
            area[i] = scan.nextLine().toCharArray();
            for (int j = 0; j <area[i].length ; j++) {
                if(area[i][j] == 'S'){
                    myRow = i;
                    myCol = j;
                }
            }
        }
        boolean isSunk = false;
        String command = scan.nextLine();
        while (!command.equals("collect the nets")){
            area[myRow][myCol] = '-';
            switch (command){
                case "up":
                    if(inInOfBoundaries(myRow-1,myCol,area)){
                        myRow = myRow-1;
                    }else{
                        myRow = area.length-1;
                    }
                    break;
                case "down":
                    if(inInOfBoundaries(myRow+1,myCol,area)){
                        myRow = myRow+1;
                    }else{
                        myRow = 0;
                    }
                    break;
                case "left":
                    if(inInOfBoundaries(myRow,myCol-1,area)){
                        myCol = myCol-1;
                    }else{
                        myCol = area[myRow].length-1;
                    }
                    break;
                case "right":
                    if(inInOfBoundaries(myRow,myCol+1,area)){
                        myCol = myCol+1;
                    }else{
                        myCol = 0;
                    }
                    break;
            }
            if(String.valueOf(area[myRow][myCol]).matches("[0-9]+")){
                count+= Integer.parseInt(String.valueOf(area[myRow][myCol]));
            }else if(area[myRow][myCol] == 'W'){
                isSunk = true;
                count = 0;
                break;
            }
            area[myRow][myCol] = 'S';
            command = scan.nextLine();
        }
        if(isSunk){
            System.out.printf("You fell into a whirlpool! The ship sank and you lost the fish you caught. Last coordinates of the ship: [%d,%d]%n",myRow,myCol);
        }else if(count >= 20){
            System.out.println("Success! You managed to reach the quota!");
        }else if (count < 20){
            System.out.printf("You didn't catch enough fish and didn't reach the quota!" +
                    "" +
                    " You need %d tons of fish more.\n",20-count);
        }
        if(count>0){
            System.out.printf("Amount of fish caught: %d tons.\n",count);
        }
        if(!isSunk){
            printArea(area);
        }
    }

    private static void printArea(char[][] area) {
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[i].length; j++) {
                System.out.print(area[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean inInOfBoundaries(int row, int myCol, char[][] area) {
        return row >= 0 && row < area.length && myCol >= 0 && myCol < area[row].length;
    }
}
