package chapterFour;

import java.util.Scanner;

public class ValidateUserInput {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int userInput = 0;

        while (userInput != 1 && userInput != 2) {

            System.out.println("Enter a number here: ");
            userInput = keyboard.nextInt();

            if (userInput == 1 || userInput == 2) {
                System.out.printf("Congrats, you've chosen %d which is one of the correct numbers.", userInput);

            } else {
                System.out.println("Sorry, try again.");
            }
        }

    }
}

