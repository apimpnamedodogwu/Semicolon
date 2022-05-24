package chapterFive;

public class DoWhileLoop {
    public static void main(String[] args) {
        int count = 0;
        do {
            System.out.printf("%d ", count);
            count += 2;
        } while (count <= 50);

        System.out.println();
    }
}
