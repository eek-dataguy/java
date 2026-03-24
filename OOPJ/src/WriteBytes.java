import java.io.FileOutputStream;
import java.io.IOException;


public class WriteBytes {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream("example2.txt");
            String data = "Hello, World!";

            System.out.println("Writing data to the file: " + data);
            System.out.println("Data in bytes: " + data.getBytes());

            byte[] byteData = data.getBytes();
            fileOutputStream.write(byteData);
            System.out.println("Data written to the file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();   
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
