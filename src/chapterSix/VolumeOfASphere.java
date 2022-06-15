package chapterSix;

import java.util.Scanner;

public class VolumeOfASphere {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter the radius of a sphere here: ");
        double radius = myInput.nextDouble();
        double result = sphereVolume(radius);
        System.out.printf("%n The volume of the sphere is %.2f!%n", result);
    }

    public static double sphereVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
