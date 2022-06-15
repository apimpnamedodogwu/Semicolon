package studyPractice.studyPracticeChapterSix;

import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        int freq1 = 0;
        int freq2 = 0;
        int freq3 = 0;
        int freq4 = 0;
        int freq5 = 0;
        int freq6 = 0;

        for (int roll = 1; roll <= 60_000_000; roll++) {
            int face = 1 + random.nextInt(6);

            switch (face) {
                case 1 -> ++freq1;
                case 2 -> ++freq2;
                case 3 -> ++freq3;
                case 4 -> ++freq4;
                case 5 -> ++freq5;
                case 6 -> ++freq6;
            }
        }

        System.out.println("Face\tFrequency"); // output headers
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",
                 freq1, freq2, freq3, freq4, freq5, freq6);

    }
}
