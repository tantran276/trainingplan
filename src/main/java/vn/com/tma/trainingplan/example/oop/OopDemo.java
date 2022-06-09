package vn.com.tma.trainingplan.example.oop;

import vn.com.tma.trainingplan.example.oop.People.gender;

public class OopDemo {
	public static void main(String[] args) {
		
//		When People is abstract class,  it cannot be instantiated.
//		People p = new People("A",20,gender.MALE);
		People p = new Employee("A",20,gender.MALE, 450);
		People e = new Employee("B", 22, gender.FEMALE, 500);
		Manager m = new Manager("C", 30, gender.MALE, 1000);
		
		System.out.println("People name: " + p.getName());
		System.out.println("A is Employee : " + (p instanceof Employee));
		p.mailCheck();
		
//		Employee inheritance People
		System.out.println("Employee name: " + e.getName());
		
//		Employee override method mailCheck People(Abstract, Polymorphism)
		e.mailCheck();
//		e.work();
		
		System.out.println("Manager name: " + m.getName());
		m.mailCheck();
		m.work();
		
		System.out.println(p.equals(e));
	}
}
