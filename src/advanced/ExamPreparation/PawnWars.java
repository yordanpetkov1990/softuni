package advanced.ExamPreparation;

import java.util.Scanner;

public class PawnWars {
    private static int whiteRow;
    private static int whiteCol;
    private static int blackRow;
    private static int blackCol;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[][] board = readBoard(scan);
        System.out.println();
        boolean whiteQueen = false;
        boolean blackQueen = false;
        while(whiteRow != 0 && blackRow != 7){
            if(canWhiteCapture(whiteRow,whiteCol,blackRow,blackCol)){
                System.out.println("Game over! White capture on " + formatCordinates1(blackRow,blackCol) + ".");
                break;
            }
            board[whiteRow][whiteCol] = '-';
            if(whiteRow - 1 == 0){
                whiteQueen = true;
                whiteRow--;
                board[whiteRow][whiteCol] = 'w';
                break;
            }
            whiteRow--;
            board[whiteRow][whiteCol] = 'w';
            if(canBlackCapture(blackRow,blackCol,whiteRow,whiteCol)){
                System.out.println("Game over! Black capture on " + formatCordinates1(whiteRow,whiteCol) + ".");
                break;
            }
            board[blackRow][blackCol] = '-';
            if(blackRow + 1 == 7){
                blackQueen = true;
                blackRow++;
                board[blackRow][blackCol] = 'b';
                break;
            }
            blackRow++;
            board[blackRow][blackCol] = 'b';
        }
        if(blackQueen){
            System.out.printf("Game over! Black pawn is promoted to a queen at %s.\n",formatCordinates(1,blackCol));
        }else if(whiteQueen){
            System.out.printf("Game over! White pawn is promoted to a queen at %s.\n",formatCordinates(8,whiteCol));
        }
        printBoard(board);
    }

    private static String formatCordinates1(int row, int col) {
        return (char) ('a' + col) + String.valueOf(8 - row);

    }

    private static void printBoard(char[][] board) {
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean canBlackCapture(int blackRow, int blackCol, int whiteRow, int whiteCol) {
        if((blackRow + 1 == whiteRow && blackCol + 1 == whiteCol) || (blackRow + 1 == whiteRow && blackCol - 1 == whiteCol) ){
            return true;
        }
        return false;
    }

    private static String formatCordinates(int row, int col) {
        return (char) ('a' + col) + String.valueOf(row);
    }

    private static boolean canWhiteCapture(int whiteRow, int whiteCol, int blackRow, int blackCol) {
        if((whiteRow - 1 == blackRow && whiteCol + 1 == blackCol) || (whiteRow - 1 == blackRow && whiteCol - 1 == blackCol) ){
            return true;
        }
        return false;
    }

    private static char[][] readBoard(Scanner scanner) {
        char[][] board = new char[8][8];
        for (int i = 0; i < board.length; i++) {
            board[i] = scanner.nextLine().toCharArray();
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 'w'){
                    whiteRow = i;
                    whiteCol = j;
                }else if(board[i][j] == 'b'){
                    blackRow = i;
                    blackCol = j;
                }
            }
        }
        return board;
    }
}
