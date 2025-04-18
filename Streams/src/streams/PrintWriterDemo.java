package streams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	
	public static void writeData_PrintWriter() {
		try {
			PrintWriter out = new PrintWriter(new FileWriter("sample.txt"));
			out.write(100);//writes corresponding ascii values
			out.println(100);//prints 100
			out.println(true);
			out.println("Hello");
			out.println('A');
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		writeData_PrintWriter();1
	}
}