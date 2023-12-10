import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingProgram {
    public static void main(String[] args) {
        // ファイルのパスを指定
        String filePath = "../text/sample.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // ファイルから一行ずつ読み込んで表示
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

