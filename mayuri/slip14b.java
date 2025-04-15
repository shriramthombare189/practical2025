import java.io.File;
import java.io.FilenameFilter;

class FileFilterExample {
    public static void main(String[] args) {
        // Specify the directory path and file extension
        String directoryPath = "C:/example_directory"; // Replace with your specific directory path
        String fileExtension = ".txt"; // Replace with your desired file extension

        // Create a File object for the directory
        File directory = new File(directoryPath);

        if (directory.isDirectory()) {
            // Use a FilenameFilter to filter files with the specific extension
            FilenameFilter filter = (dir, name) -> name.toLowerCase().endsWith(fileExtension);

            // Get the list of files with the specified extension
            File[] files = directory.listFiles(filter);

            if (files != null && files.length > 0) {
                System.out.println("Files with extension " + fileExtension + " in directory " + directoryPath + ":");
                for (File file : files) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("No files with extension " + fileExtension + " found in directory " + directoryPath);
            }
        } else {
            System.out.println("The specified path is not a directory.");
        }
    }
}
