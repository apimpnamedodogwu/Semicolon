package chapterFifteen;

import java.io.*;

public class ExampleThree {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try (PrintWriter printWriter = new PrintWriter("test.txt")) {
            String sentence = bufferedReader.readLine();
            printWriter.println(sentence.toUpperCase());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
