package streams;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// file class
		/*
		 * File file = new File("avinash.txt"); try {
		 * System.out.println("Before calling createNewFile(): " + file.exists());
		 * file.createNewFile(); System.out.println("After calling createNewFile(): " +
		 * file.exists()); } catch (IOException e) { e.printStackTrace(); }
		 */

		// creating a directory
		File myDirectory = new File("JFS20");

		// mkdir()method will create a directory/folder in your current directory.
		myDirectory.mkdir();

		File txtFile = new File(myDirectory, "notes.txt");
		File txtFile2 = new File("myIOstreamdir", "IOStreams.txt");
		try {
			txtFile.createNewFile();
			txtFile2.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
