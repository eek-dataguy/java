import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.BufferedReader;

public class FileExample {
    public static void main(String[] args) {
        String filename = "example.txt";

        File file = new File(filename);

        if(file.exists()){
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }

        try{
            FileWriter fw = new FileWriter("example1.txt");

            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello, this is a test file.");
            bw.newLine();
            bw.write("This file is created using BufferedWriter.");
            bw.close();
            System.out.println("File created and written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

        try {
            FileReader fr = new FileReader("/workspaces/java/OOPJ/output.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("Contents of the file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
