package chapterFifteen;

import java.io.*;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\dell\\IdeaProjects\\deitel\\test.txt")) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            var readFile = bufferedReader.lines();
            readFile.forEach(line -> System.out.println(line + "\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
