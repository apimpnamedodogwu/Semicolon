package chapterFour;

public class TabularOutput {
    public static void main(String[] args) {
        int count = 1;

        while (count <= 5) {
            String res = count + "    " + (count * count) + "    " + (count * count * count) + "    " + (count * count * count * count);
            System.out.println(res);
            count++;
        }

    }



}
