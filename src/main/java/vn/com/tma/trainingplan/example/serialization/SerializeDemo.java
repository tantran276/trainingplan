package vn.com.tma.trainingplan.example.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		Employee e = new Employee("A", "hcm");
		Employee e1 = new Employee("B", "dn");
		Employee e2 = new Employee("A", "hn");
		
		try {
			File file = new File("D:/tmp/employee.ser");
			file.getParentFile().mkdirs();
			if(!file.exists()) {
				file.createNewFile();
			}
			FileOutputStream fileOut = new FileOutputStream(file);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.writeObject(e1);
			out.writeObject(e2);
			fileOut.close();
			System.out.printf("Serialized data is saved in /tmp/employee.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}
