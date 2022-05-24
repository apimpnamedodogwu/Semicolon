package chapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount of gallons here or -1 to terminate: ");
        int amountOfGallons = input.nextInt();
        System.out.println("Enter miles driven here: ");
        int milesDriven = input.nextInt();

        int sum = 0;

        while (amountOfGallons != -1) {
            int milesPerGallon = milesDriven / amountOfGallons;
            System.out.printf("The miles per gallon for this trip is %d.%n", milesPerGallon);
            sum = sum + milesPerGallon;
            System.out.printf("The sum of the various MPG is %d.%n", sum);
            System.out.println("Enter amount of gallons here or -1 to terminate: ");
            amountOfGallons = input.nextInt();
            System.out.println("Enter miles driven here: ");
            milesDriven = input.nextInt();

        }

    }
}
