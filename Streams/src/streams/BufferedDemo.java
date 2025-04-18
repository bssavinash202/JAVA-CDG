package streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDemo {
	public static void main(String[] args) {
		// writing to a file using bufferedWriter
		try {
			// create an object using bufferedWriter
			// lambda expression
			BufferedWriter bw = new BufferedWriter(new FileWriter("myText.txt"));
			bw.write("Hello");
			bw.newLine();
			bw.write("This is buffered writer example");
			bw.close();
			// Reading from a file.
			BufferedReader br = new BufferedReader(new FileReader("myText.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
