package streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void serialization(Student student) {
		try (FileOutputStream fos = new FileOutputStream("student.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(student);
			System.out.println("Student object is successfully serialized..!");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Student deserialize() {
		Student stu = null;
		try (FileInputStream fis = new FileInputStream("student.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);) {

			stu = (Student) ois.readObject();
			System.out.println("Student object is successfully deserialized..!");

		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return stu;

	}

	public static void main(String[] args) {
		Student student = new Student("Avinash", 25, "Superman@202");
		// serialize
		serialization(student);
		// deserialize
		System.out.println(deserialize());
	}
}
