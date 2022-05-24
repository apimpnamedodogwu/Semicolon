package chapterFive;

public class SumOfOddIntegers {
    public static void main(String[] args) {
        int sum = 0;
        int count = 1;

        for (count = 1; count <= 99 ; count += 2) {
            sum += count;
        }
        System.out.printf("The sum of the odd numbers between 1 and 99 is %d. ", sum);

        System.out.println();
    }

}
