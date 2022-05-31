package chapterSeven;

import java.util.Scanner;

public class TicTacToe {

    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] gameBoard = {
                {'_', '|', '_', '|', '_'},
                {'_', '|', '_', '|', '_'},
                {' ', '|', ' ', '|', ' '}
        };
        printBoard(gameBoard);
        playerOne(gameBoard);
        playerTwo(gameBoard);

    }

    public static void printBoard(char[][] gameBoard) {
        for (char[] chars : gameBoard) {
            System.out.println();
            for (char c : chars) {
                System.out.print(c);
            }
        }
    }
    public static void fillBoard(int player, int move, char[][] gameBoard){
        char symbol = ' ';
        if(player == 1) {
            symbol = 'X';
        }
            else{ symbol = 'O';}
            switch (move){
                case 1: gameBoard[0][0] = symbol;
                printBoard(gameBoard);
                    System.out.println();
                break;

                case 2: gameBoard[0][2] = symbol;
                printBoard(gameBoard);
                break;

                case 3: gameBoard[0][4] = symbol;
                printBoard(gameBoard);
                break;

                case 4: gameBoard[1][0] = symbol;
                printBoard(gameBoard);
                break;

                case 5: gameBoard[1][2] = symbol;
                printBoard(gameBoard);
                break;

                case 6: gameBoard[1][4] = symbol;
                printBoard(gameBoard);
                break;

                case 7: gameBoard[2][0] = symbol;
                printBoard(gameBoard);
                break;

                case 8: gameBoard[2][2] = symbol;
                printBoard(gameBoard);
                break;

                case 9: gameBoard[2][4] = symbol;
                printBoard(gameBoard);
                break;

                default:
                    System.out.println("Input is invalid.");
            }
        }

    public static void playerOne(char[][] gameBoard) {
        System.out.println("Enter moves between 1 -9 here: ");
        int move = userInput.nextInt();
        boolean result = isMoveValid(move, gameBoard);
        while (!result) {
            System.out.println("Try again");
            move = userInput.nextInt();
            result = isMoveValid(move, gameBoard);
        }
        fillBoard(1, move, gameBoard);
    }

    public static void playerTwo(char[][] gameBoard) {
        System.out.println("Enter moves between 1 - 9 here: ");
        int move = userInput.nextInt();
        boolean result = isMoveValid(move, gameBoard);
        while (!result) {
            System.out.println("Try again");
            move = userInput.nextInt();
            result = isMoveValid(move, gameBoard);
        }
        fillBoard(2, move, gameBoard);
    }

    public static boolean isMoveValid(int move, char[][] gameBoard) {
        switch (move) {
            case 1: gameBoard[0][0] = '_';
            return true;

            case 2: gameBoard[0][2] = '_';
            return true;

            case 3: gameBoard[0][4] = '_';
            return true;

            case 4: gameBoard[1][0] = '_';
            return true;

            case 5: gameBoard[1][2] = '_';
            return true;

            case 6: gameBoard[1][4] = '_';
            return true;

            case 7: gameBoard[2][0] = '_';
            return true;

            case 8: gameBoard[2][2] = '_';
            return true;

            case 9: gameBoard[2][4] = '_';
            return true;
        }
        return false;

    }


}
