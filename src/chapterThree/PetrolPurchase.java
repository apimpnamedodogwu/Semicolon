package chapterThree;

public class PetrolPurchase {

    private String stationLocation;
    private String typeOfPetrol;
    private int quantityInLitres;
    private double pricePerLitre;
    private double percentageDiscount;



    public PetrolPurchase(String stationLocation, String typeOfPetrol, int quantityInLitres, double pricePerLitre, double percentageDiscount) {

        this.stationLocation = stationLocation;

        this.typeOfPetrol = typeOfPetrol;

        this.quantityInLitres = quantityInLitres;

        this.pricePerLitre = pricePerLitre;

        this.percentageDiscount = percentageDiscount;

    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public void setTypeOfPetrol(String typeOfPetrol) {
        this.typeOfPetrol = typeOfPetrol;
    }

    public String getTypeOfPetrol() {
        return typeOfPetrol;
    }

    public void setQuantityInLitres(int quantityInLitres) {
        this.quantityInLitres = quantityInLitres;
    }

    public int getQuantityInLitres() {
        return quantityInLitres;
    }

    public void setPricePerLitre(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public double getPurchaseAmount() {

            double totalAmount = quantityInLitres * pricePerLitre;
            double discount = (percentageDiscount * totalAmount) / 100;
            double netPurchaseAmount = totalAmount - discount;
            return netPurchaseAmount;

    }


}
