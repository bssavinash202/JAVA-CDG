package streams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		try {
			File f = new File("myFolder","notes.txt");
			FileWriter fw = new FileWriter(f);
			
			//write a single character
			fw.write('s');
			fw.write("\n");
			//write the corresponding characters with ascii values
			fw.write(99);
			//String
			fw.write("\n");
			fw.write("Avinash Prince");
			
			//write a character array
			char[] vowels = {'a','e','i','o','u'};
			fw.write("\n");
			fw.write(vowels);
			
			
			
			
			
			
			
			fw.flush();
			
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
