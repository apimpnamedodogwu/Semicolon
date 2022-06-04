package StudyPractice.StudyPracticeChapterFive;

import java.util.Scanner;

public class WhileCounter {
    public static void main(String[] args) {
       int count = 1;

        while (count <= 10) {
            System.out.printf("%d ", count);
            ++count;
        }
        System.out.println();
    }
}
