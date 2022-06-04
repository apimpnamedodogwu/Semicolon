package Classwork;

import java.util.Scanner;

public class HotelBooking {
    public static void main(String[] args) {
        String prompt;
        int menu;

        String [] roomNumber = new String[5];

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter 1 to continue or -1 to quit");
        int number = keyboard.nextInt();


        while (number != -1) {
            System.out.println("Please, enter your name: ");
            String name = keyboard.nextLine();
            keyboard.nextLine();
            prompt = """
                    1 For bookings
                    2 For checking out
                    3 For inquiry
                    4 To go back
                    """;
            System.out.println(prompt);
            System.out.println("Choose number: ");
            menu = keyboard.nextInt();
            switch (menu) {
                        }

                    }

            }
        }







