package StudyPractice.StudyPracticeChapterFive;

public class ContinueTest {
    public static void main(String[] args) {
        int count;
        for (count = 1; count <=10; count++) {
            if(count == 7) {
                continue;
            }
            System.out.printf("%d ", count);

        }
        System.out.printf("%nUsed continue to skip printing at 5%n");
    }
}
