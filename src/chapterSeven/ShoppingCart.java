package chapterSeven;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<String> itemsPurchased = new ArrayList<>();
    private ArrayList<Integer> quantity = new ArrayList<>();
    private ArrayList<Integer> pricePerUnit = new ArrayList<>();

    private int counter = 0;

    public void incrementCounter() {
        counter += 1;
    }

    public int getCounter() {
        return counter;
    }

    public void addItem(String itemName) {
        itemsPurchased.add(itemName);
    }

    public ArrayList<String> getItem() {
        return itemsPurchased;
    }

    public void addQuantity(int quantityOfItems) {
        quantity.add(quantityOfItems);
    }

    public ArrayList<Integer> getQuantity() {
        return quantity;
    }

    public void addPricePerUnit(int unitPrice) {
        pricePerUnit.add(unitPrice);
    }

    public ArrayList<Integer> getPricePerUnit() {
        return pricePerUnit;
    }

    public String printSummary(int index) {
        String item = itemsPurchased.get(index);
        int quant = quantity.get(index);
        int price = pricePerUnit.get(index);
        String summaryOfPurchasedItems = item + "     " + quant + "     " + price + "     " + quant * price;
        return summaryOfPurchasedItems;

    }


    public double discount(int percentageDiscountValue) {
        double disc = (double) percentageDiscountValue / 100;
        var total = Total();
        double discountValueOnPrice = disc * total;

        return discountValueOnPrice;
    }

    public double VATOnPrice() {
        double VAT = 0.075;
        VAT *= Total();
        return VAT;
    }

    public double Total() {
        double total = 0;
        for (int index = 0; index < counter; index++) {
            total += quantity.get(index) * pricePerUnit.get(index);
        }
        return total;
    }

}
