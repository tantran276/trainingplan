package vn.com.tma.trainingplan.example.collections;

import java.util.HashSet;
import java.util.Set;

import vn.com.tma.trainingplan.example.oop.Employee;
import vn.com.tma.trainingplan.example.oop.People.gender;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<Employee> employees = new HashSet<Employee>();
		Employee e1 = new Employee("B", 22, gender.FEMALE, 500);
		Employee e2 = new Employee("A", 20, gender.MALE, 450);
		Employee e3 = new Employee("B", 20, gender.MALE, 450);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		System.out.println("List employee:");
		for (Employee e : employees) {
			e.print();
		}		
	}
}
