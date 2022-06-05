package classwork;

public class ArrayWithEnhancedFor {
    public static void main(String[] args) {
        int sum = 0;
        int diff = 0;
        int[] anArray = new int[5];
        anArray[0] = 1;
        anArray[1] = 2;
        anArray[2] = 3;
        anArray[3] = 4;
        anArray[4] = 5;

        for (int val : anArray) {
            sum += val;
            diff -= val;

        }
        System.out.println("The sum is " + sum);
        System.out.println("The diff is " + diff);
    }
}
