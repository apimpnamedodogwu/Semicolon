package chapterFive;

public class WhileLoopForIntegers1To20 {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 20) {
            System.out.println(count);

            if (count % 5 == 0) {
                System.out.println();
            }
            else {
                System.out.println('\t');
            }
            ++count;
        }
    }
}
