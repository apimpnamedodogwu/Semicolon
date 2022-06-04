package chapterThree;

import java.util.Scanner;

public class CarDriverClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Car aCar = new Car("Mustang", "1964", 33000);
        Car aCarTwo = new Car("Ferrari", "1947", 625000);


        System.out.printf("The Mustang costs $%s after the discount it is %.2f %n", aCar.getPrice(), aCar.getDiscount(5));
        System.out.printf("The Ferrari costs $%s after the discount it is %.2f %n", aCarTwo.getPrice(), aCarTwo.getDiscount(7));

    }
}
