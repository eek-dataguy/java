import java.io.File;

public class CreateDirectory {
    public static void main(String[] args) {
        String directoryPath = "files";
        File directory = new File(directoryPath);

        if (!directory.exists()) {
            boolean created = directory.mkdir();
            if (created) {
                System.out.println("Directory created successfully: " + directoryPath);
            } else {
                System.out.println("Failed to create directory: " + directoryPath);
            }
        } else {
            System.out.println("Directory already exists: " + directoryPath);
        }


        // list files in the directory /workspaces/java/OOPJ/src
        File srcDirectory = new File("/workspaces/java/OOPJ/src");
        if (srcDirectory.exists() && srcDirectory.isDirectory()) {
            String[] files = srcDirectory.list();
            System.out.println("Files in the src directory:");
            for (String file : files) {
                System.out.println(file);
            }
        } else {
            System.out.println("The src directory does not exist.");
        }
    }
}
