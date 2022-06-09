package vn.com.tma.trainingplan.example.oop;

public class Employee extends People implements IWork {
//	Encapsulation
	private long salary;

	public Employee(String name, int age, Enum<gender> gender, long salary) {
		super(name, age, gender);
		this.salary = salary;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public void mailCheck() {
		System.out.println("Within mailCheck of Employee class");
		System.out.println("Mailing check to " + getName() + " with salary " + salary);
	}

	@Override
	public void work() {
		System.out.println("Employee is working");
	}

}
