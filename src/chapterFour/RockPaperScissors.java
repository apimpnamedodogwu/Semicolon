package chapterFour;

import java.util.Objects;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Rock, Paper, or Scissors? or Quit!");
        String myMove = keyboard.next();

        if (Objects.equals(myMove, "Quit")) {
            System.out.println("Goodbye!");
            return;
        }

        if (!Objects.equals(myMove, "Rock") && !Objects.equals(myMove, "Paper") && !Objects.equals(myMove, "Scissors")) {
            System.out.println("Invalid move!");

        } else {
            int rand = (int) (Math.random() * 3);

            String move = "";

            if (rand == 0) {
                move = "Rock";
            } else if (rand == 1) {
                move = "Paper";
            } else {
                move = "Scissors";
            }
            if (myMove.equals(move)) {
                System.out.println("It is a tie!");
                return;
            }

            if (myMove.equals("Rock") && move.equals("Scissors") || myMove.equals("Scissors") && move.equals("Paper") || myMove.equals("Paper") && move == "Rock") {
                System.out.println("You win!");
            } else {
                System.out.println("You lost!");
            }

        }
    }
}
