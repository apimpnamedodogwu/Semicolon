package chapterSeven;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<String> itemsPurchased = new ArrayList<>();
    private ArrayList<Integer> quantity = new ArrayList<>();
    private ArrayList<Integer> pricePerUnit = new ArrayList<>();
    private ArrayList<Integer> percentDiscount = new ArrayList<>();
    private int counter = 0;

    public void incrementCounter() {
        counter += 1;
    }

    public void addItem(String itemName) {
        itemsPurchased.add(itemName);
    }

    public void addQuantity(int quantityOfItems) {
        quantity.add(quantityOfItems);
    }

    public void addPricePerUnit(int unitPrice) {
        pricePerUnit.add(unitPrice);
    }

    public void addPercentDiscount(int percentageDiscount) {
        percentDiscount.add(percentageDiscount);
    }

    public double Price(int quantity, int pricePerUnit) {
        double price = (double) quantity * pricePerUnit;
        return price;
    }

    public String printSummary(int index) {
        String item = itemsPurchased.get(index);
        int quant = quantity.get(index);
        int price = pricePerUnit.get(index);
        int perDis = percentDiscount.get(index);

        String summaryOfPurchasedItems = item + "   " + quant + "   " + price + "   " + perDis;
        return summaryOfPurchasedItems;

    }


    public double discount() {
        for (int index = 0; index < counter; index++) {


        }

    }

    public double VATOnlPrice() {

    }

    public double Total() {
        double total = 0;
        for (int index =0; index < counter; index++){
                total += quantity.get(index) * pricePerUnit.get(index);
        }
        return total;
    }
}
