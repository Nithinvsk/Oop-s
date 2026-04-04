package JavaOops;

import java.io.*;

public class FilenotfoundExceptionDemo {
	public static void main(String[] args) {
		try {
			File f = new File("E.//f.txt");
			FileReader fr = new FileReader(f);
		}
		catch (FileNotFoundException nt) {
			System.out.println("File does not exist");
		}
	}
}
