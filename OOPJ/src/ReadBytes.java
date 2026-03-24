import java.io.FileInputStream;
import java.io.IOException;

public class ReadBytes {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream("example.txt");
            int byteData;

            while ((byteData = fileInputStream.read() ) != -1) {
                System.out.println((byte) byteData);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
