package chapterTwoAndThree;

public class CostOfDriving {
    public int costOfDriving (int drivingDistance, int milesPerGallon, int pricePerGallon) {
        int cost = (drivingDistance / milesPerGallon) * pricePerGallon;
        return cost;
    }
}
