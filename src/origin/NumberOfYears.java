package origin;

import java.util.Scanner;

      public class NumberOfYears {
   
          // main method

        public static void main(String[] args) {

          // declare the variables

               long minutes;
               long numberOfYears;
               long days;

          // create Scanner obtain input from user

                Scanner input = new Scanner(System.in) ;

          // receive from user

              System.out.println( "Enter minutes" ) ;
                   
                    minutes = input.nextLong() ;

                    // 60 minutes = 1 hour
                    // 24 hours = 1 days

                 long minutesInADay = 24 * 60;
                     
                   // 365 days = 1 year

                  long minutesInAYear = 365 * minutesInADay;
               
                  // to get the number of years in minutes we divide input by number of years in a year
  
                       numberOfYears = minutes / minutesInAYear;

                  // next would be to get the remainder after the division
 
                      long remainingMinutes = minutes % minutesInAYear;

                  // to get number of days from remaining minutes

                        days = remainingMinutes / minutesInADay;


              System.out.printf( "%d%n%d%n", numberOfYears , days ) ;

                                   }

                                        }