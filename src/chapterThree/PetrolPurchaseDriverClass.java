package chapterThree;

import java.util.Scanner;

public class PetrolPurchaseDriverClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insert quantity in litres to be purchased ");
        int quantityInLitres = input.nextInt();

        PetrolPurchase petrol = new PetrolPurchase("Sabo Yaba", "E10(95 octane)", 7, 800.00, 10);

        System.out.printf("The station location is at %s%n", petrol.getStationLocation());
        System.out.printf("The type of petrol is %s%n", petrol.getTypeOfPetrol());
        System.out.printf("The quantity of petrol in litres is %d%n", petrol.getQuantityInLitres());
        System.out.printf("The percentage discount is %.2f%n", petrol.getPercentageDiscount());
        System.out.printf("The purchase amount is $%.2f%n", petrol.getPurchaseAmount());



    }















}
