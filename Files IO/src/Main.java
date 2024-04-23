import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            // Ask user for text input
            System.out.println("Enter text:");
            StringBuilder inputText = new StringBuilder();
            boolean moreText = true;

            // Loop to take multiple inputs
            while (moreText) {
                String line = reader.readLine();
                inputText.append(line).append("\n");

                System.out.println("Want more text (y/n)?");
                String response = reader.readLine();
                if (!response.equalsIgnoreCase("y")) {
                    moreText = false;
                }
            }

            // Save input to a file
            saveToFile("user_input.txt", inputText.toString());

            // Read content from the file and display
            String fileContent = readFromFile("user_input.txt");
            System.out.println("Content of the file:");
            System.out.println(fileContent);
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

    private static void saveToFile(String fileName, String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(data);
        } catch (IOException e) {
            System.out.println("Error occurred while saving to file: " + e.getMessage());
        }
    }

    private static String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Error occurred while reading from file: " + e.getMessage());
        }
        return content.toString();
    }
}
