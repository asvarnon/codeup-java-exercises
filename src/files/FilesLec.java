package files;

import java.io.File;
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


        //createFile makes an exception, added "throws" in Main. OR could wrap in try/catch.
        //have to create a directory first before we create a file.

        try {
            Path dataFilePath = FileIO.createDirectoryAndFile(directoryName, fileName);

            //lets write grocery list to the file.
            List<String> groceryList = Arrays.asList("Milk","Eggs","Bacon");
            Files.write(dataFilePath, groceryList);

            FileIO.printFileContents(dataFilePath);

            //Append to the file.
            Files.write(dataFilePath, Arrays.asList("cereal", "bread"), StandardOpenOption.APPEND);
            FileIO.printFileContents(dataFilePath);

            //replace a line on file
            FileIO.updateLine(dataFilePath, "milk", "Whole Milk");
            FileIO.printFileContents(dataFilePath);

            //remove a line from the file
            FileIO.deleteLine(dataFilePath, "bread");
            FileIO.printFileContents(dataFilePath);

            //empty the list
//            Files.write(dataFilePath, new ArrayList<>());
//            System.out.println("after empty");
//            FileIO.printFileContents(dataFilePath);


        } catch (IOException ex){
            System.out.println("Cannot Create the file");
            ex.printStackTrace();
        }
    }
}
