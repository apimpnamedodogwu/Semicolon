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
        boolean game = false;
        boolean result;
        printBoard(gameBoard);
        while (!game) {
            playerOne(gameBoard);
            game = isGameWon(gameBoard);
            if (game) {
                break;
            }
            playerTwo(gameBoard);
            game = isGameWon(gameBoard);
            if (game) {
                break;
            }

        }
        result = isGameWon(gameBoard);
        if (result) {
            System.out.println("Congratulations, you won.");
        }
    }

    public static void printBoard(char[][] gameBoard) {
        for (char[] chars : gameBoard) {
            // System.out.println();
            for (char c : chars) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void fillBoard(int player, int move, char[][] gameBoard) {
        char symbol = ' ';
        if (player == 1) {
            symbol = 'X';
        } else {
            symbol = 'O';
        }
        switch (move) {
            case 1 -> {
                gameBoard[0][0] = symbol;
                printBoard(gameBoard);
            }
            case 2 -> {
                gameBoard[0][2] = symbol;
                printBoard(gameBoard);
            }
            case 3 -> {
                gameBoard[0][4] = symbol;
                printBoard(gameBoard);
            }
            case 4 -> {
                gameBoard[1][0] = symbol;
                printBoard(gameBoard);
            }
            case 5 -> {
                gameBoard[1][2] = symbol;
                printBoard(gameBoard);
            }
            case 6 -> {
                gameBoard[1][4] = symbol;
                printBoard(gameBoard);
            }
            case 7 -> {
                gameBoard[2][0] = symbol;
                printBoard(gameBoard);
            }
            case 8 -> {
                gameBoard[2][2] = symbol;
                printBoard(gameBoard);
            }
            case 9 -> {
                gameBoard[2][4] = symbol;
                printBoard(gameBoard);
            }
            default -> System.out.println("Input is invalid.");
        }
    }

    public static void playerOne(char[][] gameBoard) {
        System.out.println("Enter moves between 1 -9 here: ");
        int move = userInput.nextInt();
        boolean result = isMoveValid(move, gameBoard);
        boolean loss;
        while (!result) {
            System.out.println("Try again");
            move = userInput.nextInt();
            result = isMoveValid(move, gameBoard);

        }
        fillBoard(1, move, gameBoard);
        boolean outCome;
//        outCome = isGameWon(gameBoard);
//        if (outCome) {
//            System.out.println("You winnnnn.");
//        } else System.out.println("you lost");
    }

    public static void playerTwo(char[][] gameBoard) {
        System.out.println("Enter moves between 1 - 9 here: ");
        int move = userInput.nextInt();
        boolean result = isMoveValid(move, gameBoard);
        while (!result) {
            System.out.println("Try again");
            move = userInput.nextInt();
            result = isMoveValid(move, gameBoard);
//            boolean outCome;
//            outCome = isGameWon(gameBoard);
//            if (!outCome) {
//                System.out.println("you lost");
//            } else System.out.println("You win.");
        }
        fillBoard(2, move, gameBoard);
    }

    public static boolean isMoveValid(int move, char[][] gameBoard) {

        return switch (move) {
            case 1 -> gameBoard[0][0] == '_';
            case 2 -> gameBoard[0][2] == '_';
            case 3 -> gameBoard[0][4] == '_';
            case 4 -> gameBoard[1][0] == '_';
            case 5 -> gameBoard[1][2] == '_';
            case 6 -> gameBoard[1][4] == '_';
            case 7 -> gameBoard[2][0] == ' ';
            case 8 -> gameBoard[2][2] == ' ';
            case 9 -> gameBoard[2][4] == ' ';

            default -> false;
        };
    }

    public static boolean isGameWon(char[][] gameBoard) {
        if (gameBoard[0][0] == 'X' && gameBoard[0][2] == 'X' && gameBoard[0][4] == 'X') {
            return true;
        } else if (gameBoard[1][0] == 'X' && gameBoard[1][2] == 'X' && gameBoard[1][4] == 'X') {
            return true;
        } else if (gameBoard[2][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[2][4] == 'X') {
            return true;
        } else if (gameBoard[0][0] == 'X' && gameBoard[1][0] == 'X' && gameBoard[2][0] == 'X') {
            return true;
        } else if (gameBoard[0][2] == 'X' && gameBoard[1][2] == 'X' && gameBoard[2][2] == 'X') {
            return true;
        } else if (gameBoard[0][4] == 'X' && gameBoard[1][4] == 'X' && gameBoard[2][4] == 'X') {
            return true;
        } else if (gameBoard[0][4] == 'X' && gameBoard[1][2] == 'X' && gameBoard[2][0] == 'X') {
            return true;
        } else if (gameBoard[0][0] == 'X' && gameBoard[1][2] == 'X' && gameBoard[2][4] == 'X') {
            return true;
        } else if (gameBoard[0][0] == 'O' && gameBoard[0][2] == 'O' && gameBoard[0][4] == 'O') {
            return true;
        } else if (gameBoard[1][0] == 'O' && gameBoard[1][2] == 'O' && gameBoard[1][4] == 'O') {
            return true;
        } else if (gameBoard[2][0] == 'O' && gameBoard[2][2] == 'O' && gameBoard[2][4] == 'O') {
            return true;
        } else if (gameBoard[0][0] == 'O' && gameBoard[1][0] == 'O' && gameBoard[2][0] == 'O') {
            return true;
        } else if (gameBoard[0][2] == 'O' && gameBoard[1][2] == 'O' && gameBoard[2][2] == 'O') {
            return true;
        } else if (gameBoard[0][4] == 'O' && gameBoard[1][4] == 'O' && gameBoard[2][4] == 'O') {
            return true;
        } else if (gameBoard[0][4] == 'O' && gameBoard[1][2] == 'O' && gameBoard[2][0] == 'O') {
            return true;
        } else if (gameBoard[0][0] == 'O' && gameBoard[1][2] == 'O' && gameBoard[2][4] == 'O') {
            return true;
        }
        if (gameBoard[0][0] != '_' && gameBoard[0][2] != '_' && gameBoard[0][4] != '_' && gameBoard[1][0] != '_' && gameBoard[1][2] != '_'
                && gameBoard[1][4] != '_' && gameBoard[2][0] != ' ' && gameBoard[2][2] != ' ' && gameBoard[2][4] != ' ') {
            System.out.println("We have a tie.");
        }
        return false;
    }



}
