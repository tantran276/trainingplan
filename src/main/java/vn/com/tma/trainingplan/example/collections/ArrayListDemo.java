package vn.com.tma.trainingplan.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import vn.com.tma.trainingplan.example.oop.Employee;
import vn.com.tma.trainingplan.example.oop.People.gender;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("B", 22, gender.FEMALE, 500));
		employees.add(new Employee("A",20,gender.MALE, 450));
		
		System.out.println("List employee:");
		for(Employee e:employees) {
			e.print();
		}
		
		Collections.sort(employees);
		System.out.println("List employee after:");
		for(Employee e:employees) {
			e.print();
		}
		System.out.println("Get employee at 0");
		Employee e = employees.get(0);
		e.print();
	}
}
