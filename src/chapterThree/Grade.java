package chapterThree;

import java.util.Scanner;

public class Grade {


    public static void main(String[] args) {

        Scanner digit = new Scanner(System.in);

        System.out.println("Enter grade here: ");
        int grade = digit.nextInt();
        String gradeRange = "";

        if (grade >= 90 && grade <= 100)
            gradeRange = "A";

        if (grade >= 80 && grade < 90)
                gradeRange = "B";

        if (grade >= 70 && grade < 80)
                gradeRange = "C";

        if (grade >= 60 && grade < 70)
                gradeRange = "D";

        if (grade < 60)
                gradeRange = "F";

            System.out.printf("%s%n", gradeRange);
        }

    }


