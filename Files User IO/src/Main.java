public class Main {
    public static void main(String[] args) {
        String userInput = UserInputReader.readInputFromUser();
        FileWriterEx.saveToFile("user_input.txt", userInput);
        String fileContent = FileReaderEx.readFromFile("user_input.txt");
        System.out.println("Content of the file:");
        System.out.println(fileContent);
    }
}
