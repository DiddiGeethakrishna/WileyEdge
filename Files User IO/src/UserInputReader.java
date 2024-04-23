import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputReader {
    public static String readInputFromUser() {
        StringBuilder inputText = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            boolean moreText = true;

            while (moreText) {
                System.out.println("Enter text:");
                String line = reader.readLine();
                inputText.append(line).append("\n");

                System.out.println("Want more text (y/n)?");
                String response = reader.readLine();
                if (!response.equalsIgnoreCase("y")) {
                    moreText = false;
                }
            }
        } catch (IOException e) {
            System.out.println("Error occurred while reading input: " + e.getMessage());
        }
        return inputText.toString();
    }
}
