package chapterTwoAndThree;

public class Car {
    private String model;
    private String year;
    private int price;

    public Car(String modelOfCar, String yearOfCar, int priceOfCar) {
        model = modelOfCar;
        year = yearOfCar;
        price = priceOfCar;
    }

    public String getModelOfCar() {
        return model;
    }

    public String getYearOfCar() {
        return year;
    }

    public int getPriceOfCar() {
        return price;
    }

    public void setModelOfCar(String modelOfCar) {
        model = modelOfCar;
    }

    public void setYearOfCar(String yearOfCar) {
        year = yearOfCar;
    }

    public void setPriceOfCar(int priceOfCar) {
        if (priceOfCar > 0) {
            price = priceOfCar;
        } else if (priceOfCar < 0) {
            price = 0;
        }
    }

    public int  discountOnCar(int percent){
        int discountAmount = (percent * price) / 100;
        int discountedPrice = price - discountAmount;
        return discountedPrice;
    }
}

