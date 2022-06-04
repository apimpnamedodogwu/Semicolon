package origin;

import java.util.Scanner;


public class Operations{

        public static void main(String[] arg){

           Scanner number = new Scanner(System.in);

           System.out.print("Enter first number ");                
           int numberOne = number.nextInt();
                
           System.out.print("Enter second number ");
           int numberTwo = number.nextInt();
                

          int sum = numberOne + numberTwo;
          System.out.printf("The sum is %d%n", sum);
   
          int product = numberOne * numberTwo;
          System.out.printf("The product is %d%n", product);

          int quotient = numberOne / numberTwo;
          System.out.printf("The quotient is %d%n", quotient);

          int difference = numberOne - numberTwo;
          System.out.printf("The difference is %d%n", difference);

                         }

                                  }