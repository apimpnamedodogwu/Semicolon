package chapterFour;

public class DanglingElseProblemTwo {
    public static void main(String[] args) {
        int x = 9;
        int y = 11;

        if (x < 10) {
            System.out.println("!!!!");
        }
        if (y > 10) {
            System.out.println("*****");
        } else {
            System.out.println("$$$$$");
            System.out.println("#####");
        }
    }
}
