package chapterEight;

public class RectangleClass {

    private double lengthOfRectangle = 1;
    private double widthOfRectangle = 1;

    public void setLengthOfRectangle(double length) {
        if (length <= 0.0 || length >= 20.0) {
            throw new IllegalArgumentException("Length inputted is out of range.");
        }
        lengthOfRectangle = length;
    }

    public double getLengthOfRectangle() {
        return lengthOfRectangle;
    }

    public void setWidthOfRectangle(double width) {
        if (width <= 0.0 || width >= 20.0) {
            throw new IllegalArgumentException("Width inputted is out of range.");
        }
        widthOfRectangle = width;
    }


    public double getWidthOfRectangle() {
        return widthOfRectangle;
    }

    public double calculateArea() {

        double area = lengthOfRectangle * widthOfRectangle;
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = 2 * (lengthOfRectangle + widthOfRectangle);
        return perimeter;
    }
}
