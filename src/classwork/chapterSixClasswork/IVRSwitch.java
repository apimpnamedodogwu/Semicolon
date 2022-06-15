package classwork.chapterSixClasswork;

import java.util.Scanner;

public class IVRSwitch {
    public static void main(String[] args) {
        Scanner inputIVR = new Scanner(System.in);

        System.out.println("Enter 1 for English\n\t 2 for Igbo\n\t 3 for French\n\t 4 for Yoruba");
        int lang = inputIVR.nextInt();
        switch (lang) {
            case 1 -> {
                System.out.println("Choose 1 for Data\n\t 2 for Transfer:");
                lang = inputIVR.nextInt();
                switch (lang) {
                    case 1 -> System.out.println("Data.");
                    case 2 -> System.out.println("Transfer.");
                    default -> System.out.println("Wrong choice.");
                }
            }
            case 2 -> {
                System.out.println("Choose 1 for Sharing\n\t 2 for Caring:");
                lang = inputIVR.nextInt();
                switch (lang) {
                    case 1 -> System.out.println("Sharing.");
                    case 2 -> System.out.println("Caring.");
                    default -> System.out.println("Wrong choice.");
                }
            }
            case 3 -> {
                System.out.println("Choose 1 for Egg\n\t 2 for Champagne:");
                lang = inputIVR.nextInt();
                switch (lang) {
                    case 1 -> System.out.println("Egg.");
                    case 2 -> System.out.println("Champagne.");
                    default -> System.out.println("Wrong choice.");
                }
            }
            case 4 -> {
                System.out.println("Choose 1 for Ewa\n\t 2 for Goyin");
                lang = inputIVR.nextInt();
                switch (lang) {
                    case 1 -> System.out.println("Ewa");
                    case 2 -> System.out.println("Goyin");
                    default -> System.out.println("Wrong choice.");
                }
            }
        }
    }
}
