package app;

public class Main {

    private static final String BASE_PATH = "files/";

    public static void main(String[] args) {
        FileHandler handler = new FileHandler();

        String newFileName = "myfile.txt";
        String content = "Super information.";
        String path = BASE_PATH + newFileName;

        try {
            handler.createFile(path);
            System.out.println("Created " + path);
            handler.writeToFile(path, content);
            System.out.println("Recorded in " + path);
            String readFromFile = handler.readFromFile(path);
            System.out.println("CONTENT: " + readFromFile);
        } catch (FileProcessingException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}