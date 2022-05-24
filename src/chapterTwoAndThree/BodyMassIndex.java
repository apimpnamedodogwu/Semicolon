package chapterTwoAndThree;

public class BodyMassIndex {

    public double weightInkilo(double weightInPounds, double kiloConstant) {
        kiloConstant = 0.454;
        double weight = weightInPounds * kiloConstant;
        return weight;
    }

    public  double heightInMetres(double heightInInches, double metresConstant) {
        metresConstant = 0.0254;
        double height = heightInInches * metresConstant;
        return height;
    }

    public double bMI(double weightInKilo, double heightInMetre) {
        double bodyMassIndex = weightInKilo / (heightInMetre * heightInMetre);
        return  bodyMassIndex;
    }
}
