package chapterTwo;

import java.util.Scanner;

public class CostOfDriving {

    public static void main(String[] args) {

        double drivingDistance;
        double milesPerGallon;
        double pricePerGallon;



        Scanner sc = new Scanner(System.in);

        System.out.println("Enter driving the driving distance here ");
        drivingDistance = sc.nextDouble();

        System.out.println("Enter miles per gallon ");
        milesPerGallon = sc.nextDouble();

        System.out.println("Enter price per gallon ");
        pricePerGallon = sc.nextDouble();


        double costOfDriving = (drivingDistance / milesPerGallon )* pricePerGallon;
        System.out.printf("The cost of driving is %f%n", costOfDriving);








    }
}
