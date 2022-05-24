package chapterTwoAndThree;

public class PetrolPurchase {
    private String stationLocation;
    private  String typeOfPetrol;
    private int quantity;
    private  int percentageDiscount;
    private int pricePerLitre;

    public PetrolPurchase(String location, String petrolType, int quantityOfPetrol, int pricePerLit, int percentDiscount){
        stationLocation = location;
        typeOfPetrol = petrolType;
        quantity = quantityOfPetrol;
        percentageDiscount = percentDiscount;
        pricePerLitre = pricePerLit;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public String getTypeOfPetrol() {
        return typeOfPetrol;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPercentageDiscount() {
        return percentageDiscount;
    }

    public int getPricePerLitre() {
        return pricePerLitre;
    }

    public void setStationLocation(String location) {
        stationLocation = location;
    }

    public void setTypeOfPetrol(String petrolType) {
        typeOfPetrol = petrolType;
    }

    public void setQuantity(int quantityOfPetrol) {
        quantity = quantityOfPetrol;
    }

    public void setPercentageDiscount(int percentDiscount) {
        percentageDiscount = percentDiscount;
    }

    public void setPricePerLitre(int pricePerLit) {
        pricePerLitre = pricePerLit;
    }

    public int getPurchaseAmount(){

        int totalAmount = quantity * pricePerLitre;
        int discount = (percentageDiscount * totalAmount) / 100;
        int netPurchaseAmount = totalAmount - discount;
        return netPurchaseAmount;
    }
}
