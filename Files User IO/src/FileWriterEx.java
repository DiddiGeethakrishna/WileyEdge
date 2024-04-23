import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void saveToFile(String fileName, String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(data);
            System.out.println("Data saved to file: " + fileName);
        } catch (IOException e) {
            System.out.println("Error occurred while saving to file: " + e.getMessage());
        }
    }
}
