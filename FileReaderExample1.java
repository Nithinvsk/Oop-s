package JavaOops;

import java.io.*;

public class FileReaderExample1 {
    public static void main(String[] args) {
    	try {
            FileReader fr = new FileReader("data.txt");
            int ch;

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}