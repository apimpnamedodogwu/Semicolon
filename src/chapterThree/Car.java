package chapterThree;

public class Car {

    String model;
    String year;
    double price;

    public Car(String modelOfCar, String yearOfModel, double priceOfCar){
        model = modelOfCar;
        year = yearOfModel;
        price = priceOfCar;
    }

    public void setModel (String modelOfCar){
        model = modelOfCar;
    }

    public String getModel (){
        return model;
    }

    public void setYear(String yearOfModel){
        year = yearOfModel;
    }

    public String getYear(){
        return year;
    }

    public void setPrice(double priceOfCar){
        if(priceOfCar > 0.0) {
            price = priceOfCar;
        }

        else if (priceOfCar < 0.0) {
            price = 0;
        }
    }

    public double getPrice(){
        return price;
    }

    public double getDiscount(int percent){
        double discountAmount = (percent * price) / 100;
        double discountedPrice = price - discountAmount;
        return discountedPrice;
    }
















}
