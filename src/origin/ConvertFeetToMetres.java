package origin;

import java.util.Scanner;

    public class ConvertFeetToMetres {

           public static void main(String[] args) {
                     float feet;
                     float metres;

                 Scanner input = new Scanner(System.in) ;
                 System.out.println( "Enter feet number: " );

                   feet = input.nextFloat() ;

                   metres = feet * 0.305f;

                   System.out.println(metres);


           }


    }