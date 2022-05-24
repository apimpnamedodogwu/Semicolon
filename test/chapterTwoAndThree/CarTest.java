package chapterTwoAndThree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarTest {
    @Test
    public void ConstructorTest() {
        Car myCar = new Car("Range Rover Velar", "2020", 700000);
        String model = myCar.getModelOfCar();
        String yearOfCar = myCar.getYearOfCar();
        int priceOfCar = myCar.getPriceOfCar();
        assertEquals("2020", yearOfCar);
        assertEquals("Range Rover Velar", model);
        assertEquals(700000, priceOfCar);
    }

    @Test
    public void SetCarTest() {
        Car myCar = new Car("Range Rover Velar", "2020", 700000);
        myCar.setModelOfCar("Mustang");
        myCar.setYearOfCar("1897");
        myCar.setPriceOfCar(-50);
        Assertions.assertEquals("Mustang", myCar.getModelOfCar());
        Assertions.assertEquals("1897", myCar.getYearOfCar());
        Assertions.assertEquals(0, myCar.getPriceOfCar());

    }


    @Test
    public void DiscountedPrice(){
        Car myCar = new Car("Range Rover Velar", "2020", 700000);
        Car myCar2 = new Car("Corvette", "2020", 900000);
        myCar.setPriceOfCar(7000000);
        myCar2.setPriceOfCar(9000000);
        int discount = myCar.discountOnCar(5);
        int discountTwo = myCar2.discountOnCar(7);
        assertEquals(6650000, discount);
        assertEquals(8370000, discountTwo);
    }
}
