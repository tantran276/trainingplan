package vn.com.tma.trainingplan;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fileIn = new FileInputStream("D:/tmp/employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			Employee e = null;
			System.out.println("Deserialized Employee...");
			while ((e = (Employee) in.readObject()) != null) {
				System.out.println("Name: " + e.getName());
				System.out.println("Address: " + e.getAddress());
				e = null;
			}
			in.close();
		} catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
		} catch (EOFException eof) {
			System.out.println("Deserialize end");
		}
//		System.out.println("Deserialize end");
	}
}
