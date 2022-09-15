package Filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
    public static void main(String[] args) throws IOException {
        String fileName = "./src/Filehandling/welcome.txt";
        FileWriter fw = new FileWriter(fileName);
        fw.write("Welcome ");
       // fw.write("\nWelcome to India");
        fw.close();
        FileReader fileReader = new FileReader(fileName);

        int i = fileReader.read();
        while (i>0) {
            System.out.print((char) i);
            i = fileReader.read();
        }
    }
}
