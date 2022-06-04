package chapterTwo;

import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {

        double weightInPounds;
        double heightInInches;
        double weightInKilograms;
        double heightInMetres;


        Scanner bodyMassIndex = new Scanner(System.in);


        System.out.println("Enter weight in pounds ");
        weightInPounds = bodyMassIndex.nextDouble();


        System.out.println("Enter height in inches ");
        heightInInches = bodyMassIndex.nextDouble();


        weightInKilograms = weightInPounds * 0.45359237;
        heightInMetres = heightInInches * 0.0254;

        double BMI = weightInKilograms / (heightInMetres * heightInMetres);
        System.out.printf("BMI is %f%n", BMI);


    }
}
