import java.util.Scanner;

public class Factorial {

    private static Scanner keyboard = new Scanner(System.in);
    private static int number;

    public static void main(String[] args) {
        System.out.println("Enter number here: ");
        int num = keyboard.nextInt();
        int result = formula();
        System.out.println("Factorial of " + number + "=" + result);

    }

    public static int formula() {
        int calc = number * (number - 1);
        return calc;
    }

}


