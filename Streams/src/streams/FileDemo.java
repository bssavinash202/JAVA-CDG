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
		try {
			File dir = new File("myFolder");
			if (!dir.exists()) {
				boolean dirCreated = dir.mkdir();
				System.out.println("Directory created: " + dirCreated);
			} else {
				System.out.println("Directory already exists");
			}

			// step 2: create a file inside a directory

			File file = new File("myFolder", "notes.txt");
			File file1 = new File("myFolder", "notes1.txt");
			File file2 = new File("myFolder", "notes2.txt");
			// check if the file is already existing or not.
			file1.createNewFile();
			file2.createNewFile();
			if (!file.exists()) {
				boolean fileCreated = file.createNewFile();
				
				System.out.println("File is created: " + fileCreated);
			} else {
				System.out.println("File already exists");
			}
			
			//step3: check if the file object is a directory or a file
			System.out.println("is File "+dir.isFile());
			System.out.println("is directory "+dir.isDirectory());
			
			System.out.println("is File "+file.isFile());
			System.out.println("is directory "+file.isDirectory());
			
			//step 4: list the contents of a folder/directory
			String files[]=dir.list();
			for(String f : files) {
				System.out.print(f+" ");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
