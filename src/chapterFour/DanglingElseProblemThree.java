package chapterFour;

public class DanglingElseProblemThree {
    public static void main(String[] args) {
        int x = 11, y = 9;

        if (x < 10) {
            if (y > 10)
                System.out.println("*****");
        } else {
            System.out.println("#####");
            System.out.println("$$$$$");
        }
    }
}
