package classwork.chapterSixClasswork;

import java.util.Scanner;

public class IVR {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1 for English: ");
        System.out.println("Enter 2 for Igbo: ");
        System.out.println("Enter 3 for French: ");
        System.out.println("Enter 4 for Yoruba: ");
        int lang = input.nextInt();

        if (lang == 1) {
            System.out.println("Choose 1 or 2");
            int engLang = input.nextInt();
            if (engLang == 1) {
                System.out.println("Data.");
            } else if (engLang == 2) {
                System.out.println("Transfer.");
            }
        }

        if (lang == 2) {
            System.out.println("Choose 1 or 2");
            int igbLang = input.nextInt();
            if (igbLang == 1) {
                System.out.println("Sharing.");
            } else if (igbLang == 2) {
                System.out.println("Caring.");
            }
        }

        if (lang == 3) {
            System.out.println("Choose 1 or 2");
            int freLang = input.nextInt();
            if (freLang == 1) {
                System.out.println("Egg.");
            } else if (freLang == 2) {
                System.out.println("Champagne");
            }
        }

        if (lang == 4) {
            System.out.println("Choose 1 or 2");
            int yorLang = input.nextInt();
            if (yorLang == 1) {
                System.out.println("Ewa.");
            } else if (yorLang == 2) {
                System.out.println("Goyin.");
            }

        }
    }

}

