package chapterFour;

public class DanglingElseProblem {
    public static void main(String[] args) {
        int x = 7;
        int y = 9;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }
        if (y > 5) {
            System.out.println("x and y are > 5");
        } else {
            System.out.println("x is <= 5");
        }
    }

}
