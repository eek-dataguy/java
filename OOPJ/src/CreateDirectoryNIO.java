import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class CreateDirectoryNIO {
    public static void main(String[] args) {
        String directoryPath = "files";
        Path path = Paths.get(directoryPath);

        try {
            if (!Files.exists(path)) {
                Files.createDirectory(path);
                System.out.println("Directory created successfully: " + directoryPath);
            } else {
                System.out.println("Directory already exists: " + directoryPath);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
