package chapterSeven;

import java.util.Scanner;

public class MainShoppingCart {

    public static void main(String[] args) {

        String userInput = "";

        ShoppingCart receipt = new ShoppingCart();
        Scanner keyboard = new Scanner(System.in);


        do {

            System.out.println("Enter customer's name here: ");
            String customerName = keyboard.next();

            System.out.println("Name of item purchased: ");
            String itemPurchased = keyboard.next();
            receipt.addItem(itemPurchased);

            System.out.println("Quantity of items purchased: ");
            int quantity = keyboard.nextInt();
            receipt.addQuantity(quantity);

            System.out.println("Price per unit: ");
            int pricePerUnit = keyboard.nextInt();
            receipt.addPricePerUnit(pricePerUnit);



            receipt.incrementCounter();

            System.out.println("Choose yes to add or no to quit: ");
            userInput = keyboard.next();


        } while (!userInput.equals("no"));

        System.out.println("Percentage discount on item: ");
        int percentDiscount = keyboard.nextInt();

        double price = receipt.Total();
        double discount = receipt.discount(percentDiscount);
        double VAT = receipt.VATOnPrice();


        System.out.println("Enter cashier name: ");
        String cashierName = keyboard.next();


    }
}
