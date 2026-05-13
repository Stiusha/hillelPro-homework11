package app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandler {

    public void createFile(String path) {
        try {
            Files.createFile(Path.of(path));
        } catch (IOException e) {
            throw new FileProcessingException(e);
        }
    }

    public void writeToFile(String path, String content) {
        try {
            Files.writeString(Path.of(path), content);
        } catch (IOException e) {
            throw new FileProcessingException(e);
        }
    }

    public String readFromFile(String path) {
        try {
            return Files.readString(Path.of(path));
        } catch (IOException e) {
            throw new FileProcessingException(e);
        }
    }
}

