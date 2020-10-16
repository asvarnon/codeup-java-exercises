package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesLec {
    public static void main(String[] args) throws IOException {
        String directoryName = "data";
        String fileName = "grocery_list.txt";

        Path directoryPath = Paths.get(directoryName);
        Path dataFilePath = Paths.get(directoryName, fileName);

        //createFile makes an exception, added "throws" in Main. OR could wrap in try/catch.
        //have to create a directory first before we create a file.

        try {
            if (Files.notExists(directoryPath)) {
                Files.createDirectories(directoryPath);
            }
            //OR
            if (!Files.exists(dataFilePath)) {
                Files.createFile(dataFilePath);
            }
        } catch (IOException ex){
            System.out.println("Cannot Create the file");
            ex.printStackTrace();
        }
    }
}
