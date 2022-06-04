package origin;

import java.util.Scanner;

    public class ConvertPoundsToKilograms {

          // main Method

             public static void main(String[] args) {

          // declare variables

                  double pounds;

                  double kilograms;

          // create Scanner to obtain input from command line

                  Scanner input = new Scanner(System.in);

          // receive input from user


                  System.out.println( "Enter pounds number:") ;

                    pounds = input.nextDouble() ;

         // one pound = 0.454 kilograms

                   kilograms = pounds * 0.454;

         //display result

                  System.out.println(kilograms) ;

                       }

                              }