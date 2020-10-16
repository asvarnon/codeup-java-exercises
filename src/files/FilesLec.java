package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

            //lets write grocery list to the file.
            List<String> groceryList = Arrays.asList("Milk","Eggs","Bacon");
            Files.write(dataFilePath, groceryList);

            List<String> fileContents = Files.readAllLines(dataFilePath);
            for (int i = 0; i < fileContents.size(); i++) {
                System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
            }

            //Append to the file.
            Files.write(dataFilePath, Arrays.asList("cereal", "bread"), StandardOpenOption.APPEND);
            fileContents = Files.readAllLines(dataFilePath);
            System.out.println();
            for (int i = 0; i < fileContents.size(); i++) {
                System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
            }

            //Replace a line on the file.
            fileContents = Files.readAllLines(dataFilePath);
            List<String> modifiedList = new ArrayList<>();
            for(String item : fileContents){
                if (item.equalsIgnoreCase("milk")) {
                    // Add my modified item.
                    modifiedList.add("Whole Milk");
                }else {
                    // Add the existing item because it is not what we want to replace.
                    modifiedList.add(item);
                }
            }
            Files.write(dataFilePath, modifiedList);

            fileContents = Files.readAllLines(dataFilePath);
            System.out.println();
            for (int i = 0; i < fileContents.size(); i++) {
                System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
            }

            //remove a line from the file
            fileContents = Files.readAllLines(dataFilePath);
            System.out.println();

            modifiedList = new ArrayList<>();
            for(String item : fileContents){
                //I want to remove bread
                if(!item.equalsIgnoreCase("bread")){
                    modifiedList.add(item);
                }
            }
            Files.write(dataFilePath, modifiedList);
            fileContents = Files.readAllLines(dataFilePath);
            System.out.println();
            for (int i = 0; i < fileContents.size(); i++) {
                System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
            }

        } catch (IOException ex){
            System.out.println("Cannot Create the file");
            ex.printStackTrace();
        }
    }
}
