package JavaOops;

import java.io.*;

public class ThrowsException3 {
	static void readFile () throws IOException {
		File f = new File("E.//file.txt");
		FileReader fr= new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		System.out.println(line);
	}
	public static void main(String[] args) {
		try {
			readFile();
		}
		catch (IOException nt ) {
			System.out.println(nt);
		}
	}
}
