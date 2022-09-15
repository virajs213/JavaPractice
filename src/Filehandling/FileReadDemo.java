package Filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadDemo {
    public static void main(String[] args) {
        File file = new File("./src/Filehandling/input.txt");

            try {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNext()) {
                    System.out.println(scanner.next());
                }
            }
            catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }

