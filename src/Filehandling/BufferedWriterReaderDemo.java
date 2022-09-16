package Filehandling;


import java.io.*;

public class BufferedWriterReaderDemo {
    public static void main(String[] args) throws IOException {
        String path = "./src/Filehandling/hello.txt";
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Java is not pure OOP Language");
        bufferedWriter.close();

        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int i = bufferedReader.read();
        while (i>0) {
            System.out.print((char) i);
            i = bufferedReader.read();

        }
        bufferedReader.close();

    }
}
