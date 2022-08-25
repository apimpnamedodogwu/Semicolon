package chapterFifteen;

import java.io.*;

public class WriteToFile {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try (PrintWriter printWriter = new PrintWriter("test.txt")) {
            String sentence = bufferedReader.readLine();
            printWriter.println(sentence.toUpperCase());
//            Below is used to add more messages to the text:
            printWriter.append(sentence.toLowerCase());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
