package app;

public class Main {

    private static final String BASE_PATH = "files/";

    public static void main(String[] args) {
        FileHandler handler = new FileHandler();

        String newFileName = "myfile";
        String content = "Super information.";
        String path = BASE_PATH + newFileName + ".txt";

        System.out.println(handler.createFile(path));
        System.out.println(handler.writeToFile(path, content));
        System.out.println("CONTENT: " + handler.readFromFile(path));
    }
}