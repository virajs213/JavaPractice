package Filehandling;

import java.io.File;
import java.io.IOException;

public class FileMethod {
    public static void main(String[] args) {
        File file = new File("./src/Filehandling/Sagar.txt");
        try {

        if (file.createNewFile())
            System.out.println("File Already Exist");
        else
            System.out.println("File Created");
    }
    catch (IOException e) {
        System.out.println(e.getMessage());
    }
        System.out.println("IS FILE"+file.isFile());
        System.out.println("Path"+file.getName());
        System.out.println(file.getName());
    }
}
