package chapterTwoAndThree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetrolPurchaseTest {
    @Test
    public void ConstructorTest() {
        PetrolPurchase myPetrol = new PetrolPurchase("Sabo Yaba", "E10(95 octane)", 7, 800, 10);
        String location = myPetrol.getStationLocation();
        String petrolType = myPetrol.getTypeOfPetrol();
        int quant = myPetrol.getQuantity();
        int price = myPetrol.getPricePerLitre();
        int disc = myPetrol.getPercentageDiscount();
        assertEquals("Sabo Yaba", location);
        assertEquals("E10(95 octane)", petrolType);
        assertEquals(7, quant);
        assertEquals(800, price);
        assertEquals(10, disc);
    }

    @Test
    public void setPetrolPurchaseTest() {
        PetrolPurchase myPetrol = new PetrolPurchase("Sabo Yaba", "E10(95 octane)", 7, 800, 10);
        myPetrol.setStationLocation("Jumanji");
        myPetrol.setTypeOfPetrol("Blood");
        myPetrol.setQuantity(50);
        myPetrol.setPricePerLitre(100);
        myPetrol.setPercentageDiscount(2);
        Assertions.assertEquals("Jumanji", myPetrol.getStationLocation());
        Assertions.assertEquals("Blood", myPetrol.getTypeOfPetrol());
        Assertions.assertEquals(50, myPetrol.getQuantity());
        Assertions.assertEquals(100, myPetrol.getPricePerLitre());
        Assertions.assertEquals(2, myPetrol.getPercentageDiscount());
    }

    @Test
    public void PurchaseAmount() {
        PetrolPurchase myPetrol = new PetrolPurchase("Sabo Yaba", "E10(95 octane)", 7, 800, 10);
        myPetrol.setQuantity(50);
        myPetrol.setPricePerLitre(100);
        myPetrol.setPercentageDiscount(10);
        int disc = myPetrol.getPurchaseAmount();
        assertEquals(4500, disc);
    }
}
