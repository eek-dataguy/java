import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CorrectFinalUsage {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("somefile.txt");
            // Read from the file using fr
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }

    }
}
