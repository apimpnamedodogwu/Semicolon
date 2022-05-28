package chapterSeven;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ShoppingCartMain {

    public static void main(String[] args) {

        String userInput = "";

        ShoppingCart receipt = new ShoppingCart();
        Scanner keyboard = new Scanner(System.in);
        String customerName;


        System.out.println("Enter customer's name here: ");
        customerName = keyboard.next();

        do {
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
        String prompt = """
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                TEL: 03293828343
                Date: %s
                Cashier: %s
                Customer Name: %s
                ===============================================================
                                ITEM    QTY     PRICE       TOTAL(NGN)
                ---------------------------------------------------------------
                """;
        String formattedPrompt = prompt.formatted(LocalDateTime.now().toString(), cashierName, customerName);
        System.out.println(formattedPrompt);

        for (int index = 0; index < receipt.getCounter(); index++) {
            System.out.println("                " + receipt.printSummary(index));
        }

        String prompt1 = """
                ----------------------------------------------------------------
                                                Sub Total: %s
                                                Discount: %.1f
                                                VAT @ 7.5: %.1f
                ----------------------------------------------------------------
                                                
                """;
        String formattedPrompt1 = prompt1.formatted(price, discount, VAT);
        System.out.println(formattedPrompt1);

        double finalBill = (price - discount) + VAT;
        System.out.println("How much did the customer pay: ");
        double customerPayment = keyboard.nextDouble();
        double balance = customerPayment - finalBill;

        String prompt2 = """
                ---------------------------------------------------------------
                                                Amount Due: %s
                                                Amount Paid: %.1f
                                                Balance: %.1f
                ---------------------------------------------------------------                                
                """;
        String formattedPrompt2 = prompt2.formatted(finalBill, customerPayment, balance);
        System.out.println(formattedPrompt2);
    }


}
