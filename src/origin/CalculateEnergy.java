package origin;

import java.util.Scanner;

public class CalculateEnergy {



    public static void main(String[] args) {

        // declare the variables

        double kilograms;
        double intialtemperature;
        double finaltemperature;
        double joules;


        // create Scanner to obtain input from user

        Scanner input = new Scanner(System.in);

        // receive input from user

        System.out.println("Enter amount of water in kilograms");

        kilograms = input.nextDouble();

        System.out.println("Enter intial temperature of water");

        intialtemperature = input.nextDouble();

        System.out.println("Enter final temperature of water");

        finaltemperature = input.nextDouble();


        joules = kilograms * (finaltemperature - intialtemperature) * 4184;

        // display result

        System.out.println(joules);

    }

}