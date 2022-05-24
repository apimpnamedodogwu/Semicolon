package chapterSeven;

import java.util.Objects;
import java.util.Scanner;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart receipt = new ShoppingCart();

        Scanner keyboard = new Scanner(System.in);

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

        System.out.println("Percentage discount on item: ");
        int percentDiscount = keyboard.nextInt();
        receipt.addPercentDiscount(percentDiscount);

        receipt.incrementCounter();

        System.out.println("Choose yes to add or no to quit: ");
        String userInput = keyboard.next();

        if (Objects.equals(userInput, "yes")) {
            while (!userInput.equals("no")) {
                System.out.println("Name of item purchased: ");
                itemPurchased = keyboard.next();
                int count = 0;
                count +=count;
                System.out.println("Quantity of items purchased: ");
                quantity = keyboard.nextInt();
                System.out.println("Price per unit: ");
                pricePerUnit = keyboard.nextInt();
                System.out.println("Percentage discount on item: ");
                percentDiscount = keyboard.nextInt();
                System.out.println("Choose yes to add or no to quit: ");
                userInput = keyboard.next();



                double price = receipt.Price(quantity, pricePerUnit);
                double discount = receipt.discount(pricePerUnit, percentDiscount);
                double VAT = receipt.VATOnlPrice(price);
                double total = receipt.Total(price, discount);

                System.out.println("Enter cashier name: ");
                String cashierName = keyboard.next();

                System.out.printf("%.2f %.2f %.2f %d %.2f", price, discount, VAT, count, total);
            }

        } else {
            double price = receipt.Price(quantity, pricePerUnit);
            double discount = receipt.discount(pricePerUnit, percentDiscount);
            double VAT = receipt.VATOnlPrice(price);
            double total = receipt.Total(price, discount);
            System.out.println("Enter cashier name: ");
            String cashierName = keyboard.next();

            System.out.printf("%.2f %.2f %.2f %.2f", price, discount, VAT, total);
            System.out.println();
            System.out.println(cashierName);
        }
    }
}
