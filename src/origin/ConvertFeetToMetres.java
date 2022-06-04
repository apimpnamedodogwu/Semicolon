package origin;

import java.util.Scanner;

    public class ConvertFeetToMetres {

             // main method

           public static void main(String[] args) {

             // declare the variables 
     
                     float feet;
                        
                     float metres;

            // create Scanner to obtain input from command line

                 Scanner input = new Scanner(System.in) ;

            // receive input from user

                 System.out.println( "Enter feet number: " ) ;

                   feet = input.nextFloat() ;

           // one foot = 0.305 metre

                   metres = feet * 0.305f;

          // display result

                   System.out.println(metres) ;

                             }

                                   }