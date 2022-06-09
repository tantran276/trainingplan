package vn.com.tma.trainingplan.example.collections;

import java.util.HashMap;
import java.util.Map;

import vn.com.tma.trainingplan.example.oop.Employee;
import vn.com.tma.trainingplan.example.oop.People.gender;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String,Employee> employees = new HashMap<String, Employee>();
		employees.put("B", new Employee("B", 22, gender.FEMALE, 500));
		employees.put("A", new Employee("A",20,gender.MALE, 450));
		employees.put("B", new Employee("B", 22, gender.FEMALE, 500));
		
		for (String i:employees.keySet()) {
			System.out.print(i + ", ");
			employees.get(i).print();
		}
	}
}
